import java.util.*;

public class practise {

    //1.Determining Even/Odd Numbers
    public static void checkEvenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    //2.Checking for Prime Numbers
    public static void checkPrime(int n) {
        if(n == 2) {
            System.out.println("Prime");;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");
    }

    //3.Validating Leap Years
    public static void checkLeapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a Leap year");
            }
        }
    }

    //4.Calculating Armstrong Numbers
    public static void checkArmstrongNum(int num) {

    }

    //5.Generating the Fibonacci Series
    public static void calcFibonacci(int limit) {

    }

    //6.Identifying Palindromes
    public static void palindrome(String str) {
        int n = str.length();
        for(int i=0; i<n; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                System.out.println("Not a palindrome");
            }
        }
        System.out.println("Palindrome"); 
    }

    //7.Crafting Star Patterns
    public static void starPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //8.Finding the Factorial of a Number
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //9.Summing Digits of a Number
    public static int sumOfDigit(int n) {
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    //10.Finding the Greatest Common Divisor (GCD)
    

    public static void main(String[] args) {
        // checkEvenOrOdd(4);
        // checkPrime(7);
        // checkLeapYear(2020);
        // palindrome("racecar");
        // starPattern(5);
        // System.out.println(factorial(5));
        System.out.println(sumOfDigit(1234));
    }
}


