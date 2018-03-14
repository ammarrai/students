package coursera;

import java.util.List;

public abstract class Graph {

    private int numVertices = 0;
    private int numEdges = 0;


    public void addVertex() {
        implementAddVertext();
        numVertices++;
    }


    public abstract void implementAddVertext();

    public abstract List<Integer> getNeighbors(int v);


    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }
}
