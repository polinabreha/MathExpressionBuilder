package com.pluralsight;

public class MathExpressionBuilder {
    public static void main(String[] args) {
        int x = 12;
        int y = 7;
        int z = 2;
        double w = 1.8;
        String originalExpression = "x + y * z - w";
        String newExpression = "(x + y )* z - w";
        System.out.println("Original expression: " + originalExpression);
        double firstResult = x + y * z - w;
        System.out.println(firstResult);
        System.out.println("With parentheses: " + newExpression);
        double secondResult = (x + y) * z - w;
        System.out.println(secondResult);
        double difference = secondResult - firstResult;
        int roundedDifference = (int) Math.round(difference);
        System.out.println("The difference between the first and second result is " + roundedDifference);

    }
}
