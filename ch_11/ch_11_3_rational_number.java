/*
A rational number is a number that can be represented as the ratio of two integers.
For example, 2/3 is a rational number, and you can think of 7 as a rational number
with an implicit 1 in the denominator.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Rational init = new Rational(4,2);
        init.printRational();
        System.out.println();
        init.negate();
        System.out.println(init);
        init.invert();
        System.out.println(init);
        System.out.println(init.toDouble());
        System.out.println(init.reduce());
        System.out.println(init.add(new Rational(2,3)));
    }
    
    public static class Rational {
        private int numerator;
        private int denominator;
        
        public Rational() {
            this.numerator = 0;
            this.denominator = 1;
        }
        
        public Rational(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        
        public void printRational() {
            System.out.printf("%2d/%2d", this.numerator, this.denominator);
        }
        
        public String toString() {
            return String.format("%2d/%2d", this.numerator, this.denominator);
        }
        
        public void negate() {
            this.numerator = this.numerator * (-1);
        }
        
        public void convertSign() {
            if (this.denominator < 0) {
                this.numerator = - this.numerator;
                this.denominator = - this.denominator;
            }
        }
        public void invert() {
            int temp;
            temp = this.numerator;
            this.numerator = this.denominator;
            this.denominator = temp;
            this.convertSign();
            
            /*
        if (this.numerator < 0) {
            this.numerator, this.denominator = this.denominator, this.numerator;
        } else {
            this.numerator, this.denominator = this.denominator, this.numerator;
        }
        */
        }
        
        public double toDouble() {
            return (double) this.numerator / this.denominator;
        }
        
        public Rational reduce() {
            int dividend = Math.max(this.numerator, this.denominator);
            int divisor = Math.min(this.numerator, this.denominator);
            Rational res = new Rational();
            int remainder = Integer.MAX_VALUE;
            int temp;
            while (remainder != 0) {
                remainder = dividend % divisor;
                dividend = divisor;
                divisor = remainder;
            }
            res.numerator = this.numerator / dividend;
            res.denominator = this.denominator /dividend;
            res.convertSign();
            return res;
        }
        
        public Rational add(Rational that) {
            Rational res = new Rational();
            System.out.printf("a = %d, b = %d, c = %d, d = %d \n", this.numerator, this.denominator, that.numerator, that.denominator);
            res.numerator = (this.numerator * that.denominator) + (that.denominator * this.numerator);
            res.denominator = this.denominator * that.denominator;
            res = res.reduce();
            return res;
        }
    }
                   
}
