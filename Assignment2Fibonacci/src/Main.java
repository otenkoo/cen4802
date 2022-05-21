import java.util.Scanner;

public class Main {
    //A recursive static method that returns the nth term in the Fibonacci sequence.
    // The method should accept n as a parameter and return the nth term in the sequence.
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
