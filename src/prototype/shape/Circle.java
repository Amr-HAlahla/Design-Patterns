package prototype.shape;

public class Circle implements Shape {
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
        System.out.println("Drawing a " + color + " Circle");
    }
}
