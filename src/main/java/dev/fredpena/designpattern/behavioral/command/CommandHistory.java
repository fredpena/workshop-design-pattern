package dev.fredpena.designpattern.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 10:31
 */
public class CommandHistory {
    private final Deque<Command> stack = new ArrayDeque<>();

    public void push(Command c) {
        stack.push(c);
    }

    public Command pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
