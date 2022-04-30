/*
You might be sick of the factorial method by now, but we’re going to do one more
version.
1. Create a new program called Big.java and write an iterative version of facto
rial (using a for loop).
2. Display a table of the integers from 0 to 30 along with their factorials. At some
point around 15, you will probably see that the answers are not correct anymore.
Why not?
3. Convert factorial so that it performs its calculation using BigIntegers and
returns a BigInteger as a result. You can leave the parameter alone; it will still be
an integer.
4. Try displaying the table again with your modified factorial method. Is it correct
up to 30? How high can you make it go?
*/
// "static void main" must be defined in a public class.
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //BigInteger n = new BigInteger("30");
        factorial(40);
    }
    public static void factorial(int n) {
        BigInteger total = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            total = total.multiply(BigInteger.valueOf(i));
            System.out.printf("%3d: %50d", i, total);
            System.out.println();
        }
    }
}
