package com.epam.university.java.core.task013;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FigureImpl implements Figure {

    private int vertexCount;
    private int vertexCountCurrent = 0;
    private Set<Vertex> vertexSet = new HashSet<>();

    public FigureImpl(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    @Override
    public void addVertex(Vertex vertex) {
        vertexCountCurrent++;
        if (vertexCountCurrent > vertexCount) {
            throw new IllegalArgumentException();
        }
        vertexSet.add(vertex);
    }

    @Override
    public Collection<Vertex> getVertexes() {

        return vertexSet;
    }
}
