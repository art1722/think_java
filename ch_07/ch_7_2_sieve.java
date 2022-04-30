/*
The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime num‐ bers up to any given limit.”
Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean[] arr = sieve(10);
        for (boolean value: arr) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
    public static boolean[] sieve(int n) {
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            ans[i] = true;
        }
        for (int i = 2; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (ans[j] == true && j % i == 0) {
                    ans[j] = false;
                } 
            }
        }
        return ans;
    }
}
