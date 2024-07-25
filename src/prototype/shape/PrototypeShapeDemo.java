package prototype.shape;

public class PrototypeShapeDemo {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("Orange");

        ShapeClient client = new ShapeClient(circlePrototype);
        Shape orangeCircle = client.createShape();
        orangeCircle.draw();
    }
}
