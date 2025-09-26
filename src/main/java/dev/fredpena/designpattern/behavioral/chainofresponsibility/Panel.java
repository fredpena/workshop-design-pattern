package dev.fredpena.designpattern.behavioral.chainofresponsibility;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:48
 */
public class Panel extends Container {
    private final int x, y, w, h;
    private String modalHelpText;

    public Panel(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void setModalHelpText(String t) {
        this.modalHelpText = t;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null && !modalHelpText.isBlank()) {
            System.out.println("[Panel] Modal: " + modalHelpText);
        } else {
            super.showHelp(); // propaga
        }
    }
}
