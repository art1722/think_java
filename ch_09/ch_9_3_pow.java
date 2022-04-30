/*
Many encryption algorithms depend on the ability to raise large integers to a power.
Here is a method that implements an efficient algorithm for integer exponentiation:

The problem with this method is that it works only if the result is small enough to be
represented by an int. Rewrite it so that the result is a BigInteger. The parameters
should still be integers, though.
You should use the BigInteger methods add and multiply. But don’t use BigIn
teger.pow; that would spoil the fun.
*/

// "static void main" must be defined in a public class.
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(pow(3, 10));
    }
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;
        
        System.out.printf("%d, %d\n", x, n);
        BigInteger total = pow(x, n/2);
        System.out.printf("%d, %d,  %d\n", x, n, total);
        if (n % 2 == 0) {
            return total.multiply(total);
        } else {
            return total.multiply(total.multiply(BigInteger.valueOf(x)));
        }
    }
}
