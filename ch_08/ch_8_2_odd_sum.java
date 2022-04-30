/*
Write a recursive method named oddSum that takes a positive odd integer n and returns the sum of odd integers from 1 to n. Start with a base case, and use temporary variables to debug your solution. You might find it helpful to print the value of n each time oddSum is invoked.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(oddSum(97));
    }
    public static int oddSum(int n) {
        if (n == 1) {
            return n;
        }
        else if (n % 2 == 1 && n > 1) {
            return n + oddSum(n-2);
        }
        else if (n % 2 == 0 && n > 1) {
            return oddSum(n-1);
        }
        return 0;
        
    }
}
