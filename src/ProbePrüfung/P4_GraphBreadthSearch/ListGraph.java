package ProbePrüfung.P4_GraphBreadthSearch;

import java.util.ArrayList;
import java.util.List;

public class ListGraph {

    private ArrayList<Edge>[] graph;
    private int numVertices;
    private boolean directed;

    public ListGraph(int numVertices, boolean directed) {
        graph = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++)
            graph[i] = new ArrayList<Edge>();
        this.numVertices = numVertices;
        this.directed = directed;
    }

    public int numVertices() {
        return numVertices;
    }

    public boolean isDirected() {
        return directed;
    }

    public boolean hasEdge(int fromVertex, int toVertex) {
        Edge edge = findEdge(fromVertex, toVertex);
        return edge != null;
    }

    public void addEdge(int fromVertex, int toVertex) {
        graph[fromVertex].add(new Edge(fromVertex, toVertex));
        if (!directed) {
            graph[toVertex].add(new Edge(toVertex, fromVertex));
        }
    }

    private Edge findEdge(int fromVertex, int toVertex) {
        for (Edge edge : graph[fromVertex]) {
            if (edge.toVertex == toVertex) {
                return edge;
            }
        }
        return null;
    }

    public void removeEdge(int fromVertex, int toVertex) {
        graph[fromVertex].remove(findEdge(fromVertex, toVertex));
        if (!directed) {
            graph[toVertex].remove(findEdge(toVertex, fromVertex));
        }
    }

    public List<Edge> getEdges(int v) {
        return graph[v];
    }

    public List<Integer> performBreadthSearch(int startVertex) {
        // TODO: Implementierung hinzufuegen
        return null;
    }


}
