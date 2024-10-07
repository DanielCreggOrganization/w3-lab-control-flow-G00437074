package ie.atu.controlflow;

public class ReturnExample {
    public static void main(String[] args) {
        int result = addNumbers(5, 3);
        System.out.println("The result is: " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b; // Exit and return the sum of a and b
    }
}