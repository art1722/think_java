/*
Write a recursive method called ack that takes two ints as parameters and that com‐
putes and returns the value of the Ackermann function.
Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Ackermann(3, 3));
        
    }
    public static int Ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        else if (m > 0 && n == 0) {
            return Ackermann(m-1, 1);
        }
        else if (m > 0 && n > 0) {
            return Ackermann(m-1, Ackermann(m, n-1));
        }
        return 0;
    }
    
}
