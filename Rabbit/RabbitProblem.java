package Rabbit;

public class RabbitProblem {

	public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    
    public static int fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        int a = 1, b = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10; 

        System.out.println("Recursive Fibonacci for " + n + " months: " + fibonacciRecursive(n));
        System.out.println("Iterative Fibonacci for " + n + " months: " + fibonacciIterative(n));
    }
}

