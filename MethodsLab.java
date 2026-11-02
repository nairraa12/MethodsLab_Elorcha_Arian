package methodslab;

import java.util.Scanner;

public class MethodsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1
        greetuser();

        //2
        System.out.print("\nEnter 2 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        //3
        System.out.print("\nEnter a number for factorial: ");
        int n = input.nextInt();
        System.out.println("Factorial: " + factorial(n));

        //4
        int[] numbers = {10, 15, 20, 12, 18};
        System.out.println("Sum of Array: " + sumArray(numbers));

        //5
        System.out.print("\nEnter a number to check prime: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }

        //6
        System.out.println("Largest number: " + maxInArray(numbers));

        //7
        System.out.print("\nEnter two positive numbers for GCD and LCM: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("GCD: " + gcd(x, y));
            System.out.println("LCM: " + lcm(x, y));
        } else {
            System.out.println("Enter positive numbers only. ");
        }

        //challenge 1
        System.out.print("\nEnter a number for recursive factorial: ");
        int r = input.nextInt();

        if (r >= 0 && r <= 20) {
            System.out.println("Recursive factorial: " + recFactorial(r));
        } else {
            System.out.println("Enter a number from 0 to 20. ");
        }

        //challenge 2
        System.out.print("\nEnter a Fibonacci index: ");
        int f = input.nextInt();

        if (f >= 0 && f <= 40) {
            System.out.println("Fibonacci: " + fib(f));
        } else {
            System.out.println("Enter an index number from 0 to 40. ");
        }

        //challengse 3
        input.nextLine();

        System.out.print("\nEnter a word to check palindrome: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        input.close();
    }

    //task 1
    static void greetuser() {
        System.out.println("Hello, Welcome to the Math Program");
    }

    //task 2
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    //task 3
    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    //task 4
    static int sumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    //task 5
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //task 6
    static int maxInArray(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    //task 7: CGD
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    //task 7: LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    //challenge 1
    static long recFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recFactorial(n - 1);
    }

    //challenge 2
    static long fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //challenge 3
    static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
