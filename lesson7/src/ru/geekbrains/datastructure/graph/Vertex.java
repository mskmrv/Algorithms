package ru.geekbrains.datastructure.graph;

public class Vertex {
    private final String label;
    private boolean visited;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "ru.geekbrains.datastructure.graph.Vertex{" +
                "label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return label != null ? label.equals(vertex.label) : vertex.label == null;
    }

    @Override
    public int hashCode() {
        return label != null ? label.hashCode() : 0;
    }

    public void setVisited() {
        this.visited = true;
    }

    public boolean wasVisited() {
        return visited;
    }

    public void resetState() {
        visited = false;
    }
}
