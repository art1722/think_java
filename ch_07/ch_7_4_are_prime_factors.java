/*
Write a method named arePrimeFactors that takes an integer n and an array of inte‐ gers, and that returns true if the numbers in the array are all prime and their product is n.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = {2,2, 3,5};
        System.out.println(arePrimeFactors(60, arr));
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
    public static boolean arePrimeFactors(int n, int[] arr) {
        boolean[] ref = sieve(n);
        
        //first check if all of them are prime numbers
        for (int element: arr) {
                if (ref[element] == false) {
                    System.out.println("false");
                    return false;
            }
        }
        
        //second check if it is primefactors
        int total = 1;
        for (int element: arr) {
            total *= element;
            }
        if (total != n) {
            return false;
        
        }
        
        return true;
    }
}
