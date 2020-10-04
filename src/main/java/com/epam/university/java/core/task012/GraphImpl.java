package com.epam.university.java.core.task012;


import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;

public class GraphImpl implements Graph {

    int vertexCount;
    private Map<Integer, Set> connections;

    public GraphImpl(int vert) {
        connections = new HashMap<>(vert);
        this.vertexCount = vert;
    }

    @Override
    public void createEdge(int from, int to) {
        if (from > vertexCount || to > vertexCount) {
            throw new IllegalArgumentException();
        }
        if (connections.containsKey(from)) {
            connections.get(from).add(to);
        } else {
            Set<Integer> set = new HashSet<>();
            set.add(to);
            connections.put(from, set);
        }
        if (connections.containsKey(to)) {
            connections.get(to).add(from);
        } else {
            Set<Integer> set = new HashSet<>();
            set.add(from);
            connections.put(to, set);
        }
    }

    @Override
    public boolean edgeExists(int from, int to) {

        return connections.get(from).contains(to) || connections.get(to).contains(from);
    }

    @Override
    public void removeEdge(int from, int to) {
        if (from > vertexCount || to > vertexCount) {
            throw new IllegalArgumentException();
        }
        connections.get(from).remove(to);
        if (connections.get(from).size() == 0) {
            connections.remove(from);
        }
        connections.get(to).remove(from);
        if (connections.get(to).size() == 0) {
            connections.remove(to);
        }
    }

    @Override
    public Collection<Integer> getAdjacent(int from) {
        if (from > vertexCount) {
            throw new IllegalArgumentException();
        }
        return connections.get(from);
    }
}
