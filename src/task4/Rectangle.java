package task4;

import task4.Shape;

// Класс для прямоугольника
class Rectangle extends Shape {
    // Поля прямоугольной фигуры
    private final double length;
    private final double width;
    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    /**
     *
     * Высчитывает по формуле площадь прямоугольника
     * @return площадь прямоугольника
     */
    @Override
    double getArea() {
        return length * width;
    }
    /**
     *
     * Высчитывает по формуле периметр прямоугольника
     * @return периметр прямоугольника
     */
    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}
