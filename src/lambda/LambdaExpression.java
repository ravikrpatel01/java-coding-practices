package lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface demo = (a, b) -> a + b;

        System.out.println("Sum: " + demo.sum(10, 20));
    }
}
