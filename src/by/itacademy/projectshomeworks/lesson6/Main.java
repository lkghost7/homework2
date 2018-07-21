package by.itacademy.projectshomeworks.lesson6;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(7, 23), new Point(19, 8));
        System.out.println("Площадь прямоугольника:  " + rectangle.getAreaRectangle());
        System.out.println("Диагональ прямоугольника составляет: " + rectangle.getDiagonalRectangle());
    }
}