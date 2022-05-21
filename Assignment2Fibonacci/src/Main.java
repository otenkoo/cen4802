import java.util.Scanner;

public class Main {
    /**
     * Recursively calculates and returns the value of the nth position of the Fibonacci sequence from user input.
     * @param n the position within the Fibonacci series to be computed.
     * @return the value of the nth position of the Fibonacci Sequence.
     * @author Gener Almestica
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        //ask user input for fibonacci sequence
        System.out.println("Enter a number to find the nth term in the Fibonacci sequence: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //print out the nth term in the fibonacci sequence
        System.out.println("The " + n + "th term in the Fibonacci sequence is: " + fibonacci(n));
    }
}
