package dev.fredpena.designpattern.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 08:47
 */
public abstract class Container extends Component {
    protected final List<Component> children = new ArrayList<>();

    public void add(Component child) {
        children.add(child);
        child.setContainer(this); // encadena
    }

    public List<Component> getChildren() {
        return children;
    }
}