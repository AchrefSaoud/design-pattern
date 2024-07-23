package bridge;

// Refined Abstractions

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Square. " + color.fill());
    }
}
