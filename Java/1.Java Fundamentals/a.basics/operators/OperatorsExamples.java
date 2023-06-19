public class OperatorsExamples {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("Assignment: " + c);

        // Comparison Operators
        int x = 5;
        int y = 8;
        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreater = (x > y);
        boolean isLess = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater: " + isGreater);
        System.out.println("Less: " + isLess);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);

        // Logical Operators
        boolean p = true;
        boolean q = false;
        boolean logicalAnd = (p && q);
        boolean logicalOr = (p || q);
        boolean logicalNotP = !p;
        boolean logicalNotQ = !q;

        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT P: " + logicalNotP);
        System.out.println("Logical NOT Q: " + logicalNotQ);

        // Ternary Operator
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
    }
}
