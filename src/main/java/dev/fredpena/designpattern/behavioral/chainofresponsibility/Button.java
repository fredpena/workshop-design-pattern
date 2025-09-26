package dev.fredpena.designpattern.behavioral.chainofresponsibility;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:48
 */
public class Button extends Component {
    private final int x, y, w, h;
    private final String label;

    public Button(int x, int y, int w, int h, String label) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.label = label;
    }

    @Override
    public void showHelp() {
        // Puede usar la lógica base (tooltip) o extenderla si se desea
        if (tooltipText != null && !tooltipText.isBlank()) {
            System.out.println("[Button '" + label + "'] Tooltip: " + tooltipText);
        } else {
            super.showHelp();
        }
    }
}
