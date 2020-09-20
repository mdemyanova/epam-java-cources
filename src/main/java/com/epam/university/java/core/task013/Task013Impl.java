package com.epam.university.java.core.task013;

import java.util.Collection;

public class Task013Impl implements Task013 {
    @Override
    public Figure invokeActions(Figure figure, Collection<FigureAction> actions) {

        if (actions == null) {
            throw new IllegalArgumentException();
        }
        if (actions.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (FigureAction currentAction : actions) {
            currentAction.run(figure);
        }
        if (figure.getVertexes().size() < 3) {
            throw new IllegalArgumentException();
        }

        return figure;
    }

    @Override
    public boolean isConvexPolygon(Figure figure) {
        if (figure == null) {
            throw new IllegalArgumentException();
        }

        int edge = 0;
        for (Vertex first : figure.getVertexes()) {
            for (Vertex last : figure.getVertexes()) {

                boolean isFalse = false;
                boolean isTrue = false;
                int point1 = first.getY() - last.getY();
                int point2 = last.getX() - first.getX();
                int point3 = (first.getX() * last.getY()) - (last.getX() * first.getY());

                for (Vertex vertex : figure.getVertexes()) {
                    if (point1 * vertex.getX() + point2 * vertex.getY() + point3 < 0) {
                        isFalse = true;
                    } else if (point1 * vertex.getX() + point2 * vertex.getY() + point3 > 0) {
                        isTrue = true;
                    }
                }
                if (isFalse ^ isTrue) {
                    edge++;
                    break;
                }
            }
        }

        return edge == figure.getVertexes().size();
    }
}
