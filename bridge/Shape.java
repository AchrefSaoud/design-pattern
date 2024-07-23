package bridge;

//the abstraction
/*
we create a bridge between the abstraction of shape and the implementation 
of color this now we can create any shape an colors and asign any dhape to any color 
*/
abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
