package prototype;

public class Test {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");
        ShapeClient client = new ShapeClient(circlePrototype);
        Shape redCircle = client.createShape();
 
        redCircle.draw();
    }
}
