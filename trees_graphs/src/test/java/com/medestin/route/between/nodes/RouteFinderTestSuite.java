package com.medestin.route.between.nodes;

import com.medestin.Graph;
import com.medestin.GraphNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RouteFinderTestSuite {
    private RouteFinder finder = new RouteFinder();

    @Test
    public void testRouteFinderPositive(){
        GraphNode n1 = new GraphNode("1");
        GraphNode n2 = new GraphNode("2");
        GraphNode n3 = new GraphNode("3");
        GraphNode n4 = new GraphNode("4");
        GraphNode n5 = new GraphNode("5");

        n1.getChildren().add(n2);
        n1.getChildren().add(n3);

        n2.getChildren().add(n3);
        n2.getChildren().add(n4);

        n3.getChildren().add(n5);

        Graph graph = new Graph();
        graph.getNodes().add(n1);
        graph.getNodes().add(n2);
        graph.getNodes().add(n3);
        graph.getNodes().add(n4);
        graph.getNodes().add(n5);

        assertTrue(finder.isConnected(graph, n1, n5));
    }

    @Test
    public void testFinderShallowSearch(){
        GraphNode n1 = new GraphNode("1");
        GraphNode n2 = new GraphNode("2");

        n1.getChildren().add(n2);

        Graph graph = new Graph();
        graph.getNodes().add(n1);
        graph.getNodes().add(n2);

        assertTrue(finder.isConnected(graph, n1, n2));
    }

    @Test
    public void testFinderExactNode(){
        GraphNode n1 = new GraphNode("1");
        GraphNode n2 = new GraphNode("2");

        n1.getChildren().add(n2);

        Graph graph = new Graph();
        graph.getNodes().add(n1);
        graph.getNodes().add(n2);

        assertTrue(finder.isConnected(graph, n1, n1));
    }

    @Test
    public void testFinderNegative(){
        GraphNode n1 = new GraphNode("1");
        GraphNode n2 = new GraphNode("2");
        GraphNode n3 = new GraphNode("3");
        GraphNode n4 = new GraphNode("4");
        GraphNode n5 = new GraphNode("5");

        n1.getChildren().add(n2);
        n1.getChildren().add(n3);

        n2.getChildren().add(n3);
        n2.getChildren().add(n4);

        n5.getChildren().add(n4);

        Graph graph = new Graph();
        graph.getNodes().add(n1);
        graph.getNodes().add(n2);
        graph.getNodes().add(n3);
        graph.getNodes().add(n4);
        graph.getNodes().add(n5);

        assertFalse(finder.isConnected(graph, n1, n5));
    }
}