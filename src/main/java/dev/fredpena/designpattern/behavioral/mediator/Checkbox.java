package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:36
 */
public class Checkbox extends Component {
    private final String label;
    private boolean checked;

    public Checkbox(Mediator dialog, String label) {
        super(dialog);
        this.label = label;
    }

    public boolean isChecked() { return checked; }

    public void setChecked(boolean v) {
        this.checked = v;
        dialog.notify(this, "check");
    }

    public void check() {
        setChecked(!checked);
    }

    @Override
    public String toString() {
        return "Checkbox{" + label + ", checked=" + checked + "}";
    }
}
