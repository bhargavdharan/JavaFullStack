import java.util.Arrays;

class DataTypesExamples {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 30;
        double salary = 50000.50;
        char grade = 'A';
        boolean isEmployed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);

        // String Data Type
        String name = "John Doe";
        System.out.println("Name: " + name);

        // Array Data Type
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // Casting
        double price = 19.99;
        int roundedPrice = (int) price; // Casting double to int
        System.out.println("Rounded Price: " + roundedPrice);

        // Wrapper Classes
        Integer quantity = Integer.valueOf(5);
        System.out.println("Quantity: " + quantity);

        // Auto-Boxing and Auto-Unboxing
        Integer total = 100; // Auto-Boxing
        int value = total; // Auto-Unboxing
        System.out.println("Total: " + total);
        System.out.println("Value: " + value);
    }
}
