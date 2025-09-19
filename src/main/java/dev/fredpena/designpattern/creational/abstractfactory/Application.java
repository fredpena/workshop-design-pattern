package dev.fredpena.designpattern.creational.abstractfactory;

/**
 * @author me@fredpena.dev
 * @created 11/09/2025  - 22:58
 */
public class Application {

    private final GUIFactory factory;
    private Button button;
    private Checkbox checkbox;
    private TextField textField;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.textField = factory.createTextField();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        textField.paint();
    }

    public void delete(){
        button.paint();
        checkbox.paint();
        textField.paint();
    }
}
