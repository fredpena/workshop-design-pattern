package dev.fredpena.designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author me@fredpena.dev
 * @created 19/09/2025  - 10:31
 */
public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String textureKey) {
        TreeType type = TreeFactory.getTreeType(name, color, textureKey);
        trees.add(new Tree(x, y, type));
    }

    public void draw(Canvas canvas) {
        for (Tree t : trees) {
            t.draw(canvas);
        }
    }

    public int size() {
        return trees.size();
    }
}