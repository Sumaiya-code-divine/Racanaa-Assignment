public class Question1 {
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2);
    }
}
