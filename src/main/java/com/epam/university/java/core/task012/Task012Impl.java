package com.epam.university.java.core.task012;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Task012Impl implements Task012 {
    @Override
    public Graph invokeActions(Graph sourceGraph, Collection<GraphAction> actions) {
        if (sourceGraph == null || actions == null) {
            throw new IllegalArgumentException();
        }
        if (actions.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (GraphAction action : actions) {
            action.run(sourceGraph);
        }

        return sourceGraph;
    }

    @Override
    public boolean pathExists(Graph graph, int from, int to) {
        if (graph == null) {
            throw new IllegalArgumentException();
        }


        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(from);
        visited.add(from);
        while (!stack.empty()) {
            Collection<Integer> set = graph.getAdjacent(stack.peek());
            visited.add(stack.peek());
            stack.pop();
            for (Integer i: set) {
                if (visited.contains(i)) {
                    continue;
                }
                if (i.equals(to)) {
                    return true;
                }
                stack.push(i);
            }
        }

        return false;
    }
}
