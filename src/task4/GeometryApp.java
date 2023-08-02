package task4;

import task4.Circle;

import task4.Rectangle;
import task4.Shape;
import task4.Triangle;

// Главный класс приложения
public class GeometryApp {
    public static void main(String[] args) {
        // Пример использования конкретных классов геометрических фигур
        Shape circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}