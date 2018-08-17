package pattern;

interface Color {
    void applyColor();
}

class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("red");
    }
}

class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("green");
    }
}

abstract class Shape {
    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void apply();
}

class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    public void apply() {
        System.out.print("Triangle with color ");
        color.applyColor();
    }
}

class Circle extends Shape {

    Circle(Color c) {
        super(c);
    }

    @Override
    public void apply() {
        System.out.print("Circle with color ");
        color.applyColor();
    }
}

public class DemoBridge {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.apply();

        Shape triangle = new Triangle(new GreenColor());
        triangle.apply();
    }
}
