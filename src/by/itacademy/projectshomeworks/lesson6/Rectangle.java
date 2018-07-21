package by.itacademy.projectshomeworks.lesson6;

public class Rectangle {
    private Point leftTop;
    private Point rightBotton;

    public Rectangle(Point leftTop, Point rightBotton) {
        this.leftTop = leftTop;
        this.rightBotton = rightBotton;
    }

    public int getAreaRectangle() {
        int distanceX = this.rightBotton.getX() - this.leftTop.getX();
        int distanceY = this.leftTop.getY() - this.rightBotton.getY();
        return distanceX * distanceY;
    }

    public double getDiagonalRectangle() {
        return this.leftTop.distance(this.rightBotton);
    }
}