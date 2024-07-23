package bridge;

/*
You should use the Bridge Pattern when:
• You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example,
when the implementation must be selected or switched at run-time.
• Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern lets you
combine the different abstractions and implementations and extend them independently.
• Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be
recompiled.
• You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden
from the client. 
 */

public class Test {
    
    public static void main(String[] args) {
        Square square=new Square(new Blue());
        square.draw();
    }
}
