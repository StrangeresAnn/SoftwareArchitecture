package task4;

import task4.Shape;

// Класс для круга
class Circle extends Shape {
    // Поля класса круга
    private final double radius;
    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }


    /**
     * Высчитывает по формуле площадь круга
     * @return площадь круга
     */
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    /**
     *
     * Высчитывает по формуле периметр круга
     * @return периметр круга
     */
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

