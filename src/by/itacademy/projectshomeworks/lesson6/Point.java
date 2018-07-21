package by.itacademy.projectshomeworks.lesson6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double distance(Point point) {
        int distanceX = Math.abs(point.getX() - this.getX());
        int distanceY = Math.abs(point.getY() - this.getY());
        return Math.sqrt(distanceX * distanceY + distanceY * distanceX);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}