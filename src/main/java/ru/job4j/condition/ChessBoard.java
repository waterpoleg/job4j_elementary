package ru.job4j.condition;

public class ChessBoard {
    static boolean isInside(int val) {
        return val >= 0 && val <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isInside(x1) && isInside(y1) && isInside(x2) && isInside(y2)) {
            rsl = (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? Math.abs(x1 - x2) : rsl;
        }
        return rsl;
    }
}