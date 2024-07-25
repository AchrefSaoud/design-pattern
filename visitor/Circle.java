package visitor;

public class Circle implements Shape {
    // Circle specific properties and methods

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
