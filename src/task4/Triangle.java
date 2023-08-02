package task4;

import task4.Shape;

// Класс для треугольника
class Triangle extends Shape {
    // Поля класса
    private final double side1;
    private final double side2;
    private final double side3;
    // Конструктор
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    /**
     *
     * Высчитывает по формуле площадь треугольника
     * @return площадь треугольника
     */
    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    /**
     *
     * Высчитывает по формуле периметр треугольника
     * @return периметр треугольника
     */
    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}

