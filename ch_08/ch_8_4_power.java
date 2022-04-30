/*
Write a recursive method called power that takes a double x and an integer n and returns xn.
Hint: A recursive definition of this operation is xn = x · xn − 1. Also, remember that anything raised to the zeroth power is 1.
Optional challenge: you can make this method more efficient, when n is even, using xn = xn/2 2.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(power(2.5, 9));
    }
    public static double power(double x, int n) {
        if (n==1) {
            return x;
        }
        else if (n % 2 == 0) {
            double half = power(x, n/2);
            return half * half;
        } 
        return x * power(x, n-1);
    }
}
