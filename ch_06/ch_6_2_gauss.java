/*
One way to evaluate exp − x2 is to use the infinite series expansion:
exp − x2 = 1 − x2 + x4/2 − x6/6 + ...
The ith term in this series is − 1 ix2i/i!. Write a method named gauss that takes x
and n as arguments and returns the sum of the first n terms of the series. You should
not use factorial or pow.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        guess(4, 5);
    }
    
    public static void guess(int x, int n) {
        
        double element;
        double expo = 1;
        double total = 1;
        for (int i = 1; i <= n; i++) {
            expo = expo * i;
            element = (Math.pow(-1, i) * Math.pow(x, 2 * i)) / expo;
            total += element;
            System.out.print(element);
            System.out.println(total);
        }
    }
}
