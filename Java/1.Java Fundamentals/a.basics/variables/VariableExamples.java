public class VariableExamples {
    public static void main(String[] args) {
        // Example 1: Declaring and Initializing Variables
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Example 2: Updating Variable Values
        int count = 5;
        count = count + 1; // Incrementing count by 1
        System.out.println("Count: " + count);

        // Example 3: Variable Scope
        int x = 5; // Local variable
        {
            int y = 10; // Local variable
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        // System.out.println("y: " + y); // This line will cause a compilation error as y is out of scope

        // Example 4: Using Constants
        final double PI = 3.14159; // Constant variable
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area: " + area);

        // Example 5: String Variables
        String name = "John";
        int age = 25;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
