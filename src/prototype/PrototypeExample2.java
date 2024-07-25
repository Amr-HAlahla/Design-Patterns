package prototype;

interface Shape {
    Shape getClone();

    void draw();
}

class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape getClone() {
        return new Circle(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + "Circle");
    }
}

class ShapeClient {
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape() {
        return shapePrototype.getClone();
    }
}

public class PrototypeExample2 {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("Orange");

        ShapeClient client = new ShapeClient(circlePrototype);
        Shape redCircle = client.createShape();
        redCircle.draw();
    }
}
