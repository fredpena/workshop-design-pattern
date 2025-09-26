package dev.fredpena.designpattern.behavioral.chainofresponsibility;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:49
 */
public class Dialog extends Container {
    private final String title;
    private String wikiPageURL;

    public Dialog(String title) {
        this.title = title;
    }

    public void setWikiPageURL(String url) {
        this.wikiPageURL = url;
    }

    @Override
    public void showHelp() {
        if (wikiPageURL != null && !wikiPageURL.isBlank()) {
            System.out.println("[Dialog '" + title + "'] Open wiki: " + wikiPageURL);
        } else {
            super.showHelp();
        }
    }
}
