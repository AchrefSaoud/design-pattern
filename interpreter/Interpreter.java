package interpreter;

import java.util.Stack;

class Interpreter {
    private Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        Expression expressionTree = buildExpressionTree(expression);
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(new NumberExpression(Character.getNumericValue(c)));
            } else if (c == '+') {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AdditionExpression(left, right));
            } else if (c == '*') {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new MultiplicationExpression(left, right));
            }
        }
        return stack.pop();
    }
}

