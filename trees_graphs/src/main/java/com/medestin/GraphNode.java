package com.medestin;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private String name;
    private final List<GraphNode> children = new ArrayList<>();

    public GraphNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<GraphNode> getChildren() {
        return children;
    }
}
