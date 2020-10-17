package org.oop;

public class DistanceAndDirectionCalculator {

    private static double xDistance;
    private static double yDistance;

    public static double distance(Point from, Point to) {
        xDistance = getDistance(to.getX(), from.getX());
        yDistance = getDistance(to.getY(), from.getY());
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        xDistance = getDistance(to.getX(), from.getX());
        yDistance = getDistance(to.getY(), from.getY());
        return Math.atan2(yDistance, xDistance);
    }

    private static double getDistance(double d1, double d2) {
        return d1 - d2;
    }
}
