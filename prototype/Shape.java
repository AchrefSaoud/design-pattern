package prototype;

/*
    Use the Prototype pattern when creating objects is more expensive or complex than copying existing ones.
    If object creation involves significant resources, such as database or network calls, and you have a similar object available, cloning can be more efficient. 
*/
public interface Shape {
    Shape clone();
    void draw();
}
