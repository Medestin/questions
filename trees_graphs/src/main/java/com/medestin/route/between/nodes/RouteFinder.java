package com.medestin.route.between.nodes;

import com.medestin.Graph;
import com.medestin.GraphNode;

import java.util.ArrayDeque;

public class RouteFinder {

    public boolean isConnected(Graph graph, GraphNode nodeOne, GraphNode nodeTwo) {
        if (nodeOne == nodeTwo) {
            return true;
        }
        graph.getNodes().forEach(n -> n.setVisited(false));

        GraphNode current = nodeOne;
        ArrayDeque<GraphNode> queue = new ArrayDeque<>(current.getChildren());
        current.setVisited(true);

        while (!queue.isEmpty()) {
            current = queue.remove();
            if (!current.isVisited()) {
                if (current == nodeTwo) {
                    return true;
                } else {
                    current.getChildren().forEach(n -> {
                        if (!n.isVisited()) {
                            queue.add(n);
                        }
                    });
                }
                current.setVisited(true);
            }
        }
        return false;
    }
}
