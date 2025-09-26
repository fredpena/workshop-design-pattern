package dev.fredpena.designpattern.behavioral.chainofresponsibility;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:47
 */
public abstract class Component implements ComponentWithContextualHelp {
    protected String tooltipText;
    protected Container container; // siguiente manejador (padre)

    public void setTooltipText(String text) {
        this.tooltipText = text;
    }

    public void setContainer(Container c) {
        this.container = c;
    }

    @Override
    public void showHelp() {
        if (tooltipText != null && !tooltipText.isBlank()) {
            System.out.println("[Tooltip] " + tooltipText);
        } else if (container != null) {
            // Propaga al siguiente en la cadena
            container.showHelp();
        } else {
            System.out.println("[Help] No help available.");
        }
    }
}
