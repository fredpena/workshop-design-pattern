package dev.fredpena.designpattern.behavioral.chainofresponsibility;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:49
 */
public class Application {
    private Dialog dialog;

    public void createUI() {
        dialog = new Dialog("Budget Reports");
        dialog.setWikiPageURL("http://help.example.com/budget-reports");

        Panel panel = new Panel(0, 0, 400, 800);
        panel.setModalHelpText("This panel shows budget filters and summaries.");

        Button ok = new Button(250, 760, 50, 20, "OK");
        ok.setTooltipText("This is an OK button that confirms changes.");
        Button cancel = new Button(320, 760, 50, 20, "Cancel");
        // cancel sin tooltip → propaga a Panel, luego a Dialog

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

    // Simula la detección del componente bajo el puntero.
    // Para la demo alternamos entre OK y Cancel.
    private Component getComponentAtMouseCoords(boolean overOk) {
        Panel panel = (Panel) dialog.getChildren().get(0);
        return overOk ? panel.getChildren().get(0) : panel.getChildren().get(1);
    }

    public void onF1KeyPress(boolean overOk) {
        Component component = getComponentAtMouseCoords(overOk);
        component.showHelp();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.createUI();

        System.out.println("F1 sobre OK:");
        app.onF1KeyPress(true);   // Button OK atiende con tooltip

        System.out.println("F1 sobre Cancel:");
        app.onF1KeyPress(false);  // Cancel → Panel (modal) → (si no) Dialog (wiki)
    }
}
