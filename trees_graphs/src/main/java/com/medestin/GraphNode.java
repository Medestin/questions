package com.medestin;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private String name;
    private final List<GraphNode> children = new ArrayList<>();
    private boolean visited;

    public GraphNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<GraphNode> getChildren() {
        return children;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
