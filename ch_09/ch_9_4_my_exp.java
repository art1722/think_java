/*
1. Write a method called myexp that takes x and n as parameters and estimates ex by
adding the first n terms of this series. You can use the factorial method from
“Value-Returning Methods” on page 114 or your iterative version from the previous
exercise.
2. You can make this method more efficient by observing that the numerator of
each term is the same as its predecessor multiplied by x, and the denominator is
the same as its predecessor multiplied by i.
Use this observation to eliminate the use of Math.pow and factorial, and check
that you get the same result.
3. Write a method called check that takes a parameter, x, and displays x, myexp(x),
and Math.exp(x). The output should look something like this:
1.0 2.708333333333333 2.718281828459045
You can use the escape sequence "\t" to put a tab character between columns of
a table.
4. Vary the number of terms in the series (the second argument that check sends to
myexp) and see the effect on the accuracy of the result. Adjust this value until the
estimated value agrees with the correct answer when x is 1.
5. Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and
100.0. How does the accuracy of the result vary as x varies? Compare the number
of digits of agreement rather than the difference between the actual and estimated
values.
6. Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and
-100.0. Comment on the accuracy.
*/
// "static void main" must be defined in a public class.
import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.printf("%d, %f, %f \n",3, myexp(3,50), Math.pow(Math.E, 3));
        System.out.printf("%d, %f, %f \n",10, myexp(10,50), Math.pow(Math.E, 10));
        System.out.printf("%d, %f, %f",30, myexp(30,50), Math.pow(Math.E, 30));
    }
    public static BigDecimal myexp(int x, int n){
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i <= n; i++) {
            total = total.add((BigDecimal.valueOf(x).pow(i)).divide(factorial(i),10,RoundingMode.HALF_UP));
            //System.out.printf("%.2f\n", total);
        }
        return total;
    }
    public static BigDecimal factorial(int n) {
        BigDecimal total = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            total = total.multiply(BigDecimal.valueOf(i));
            //System.out.printf("%3d: %50d", i, total);
            //System.out.println();
        }
        return total;
    }
}
