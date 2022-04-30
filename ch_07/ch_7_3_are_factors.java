/*
Write a method areFactors that takes an integer n and an array of integers, and returns true if the numbers in the array are all factors of n (which is to say that n is divisible by all of them).
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = new int[] {2,4,6,7};
        System.out.println(Arrays.toString(arr));
    }
    public static boolean areFactors(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n != 0) {
                return false;
            }
        }
        return true;
    }
}
