package com.gojavaonline3.dlenchuk.module04;

/**
 * Created by DLenchuk on 30.05.2016.
 *
 */
public class Distance {

    public static void main(String[] args) {
        System.out.println(twoPointsDistance(0, 0, 3, 4));
        System.out.println(twoPointsDistance(1, 2, 4, 6));
        System.out.println(twoPointsDistance(12, 35, 4, 115));
    }

    public static double twoPointsDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }
}
