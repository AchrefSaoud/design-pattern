package interpreter;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Interpreter interpreter = new Interpreter(context);

        String expression = "23*4+"; // its the same as (2 * 3) + 4 using postfix expression
        int result = interpreter.interpret(expression);
        System.out.println("Result: " + result);
    }
}
