// "static void main" must be defined in a public class.
/*
Write a program that converts a temperature from Celsius to Fahrenheit. It should (1)
prompt the user for input, (2) read a double value from the keyboard, (3) calculate
the result, and (4) format the output to one decimal place.
When it’s finished, it should work like this:
Enter a temperature in Celsius: 24
24.0 C = 75.2 F
Here is the formula to do the conversion:
F = C ×95
+ 32
Hint: Be careful not to use integer division!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        double indata;
        double calculated;
        
        Scanner in = new Scanner(System.in);
        indata = in.nextInt();
        calculated = indata * 9/5 + 32;
        System.out.println(calculated);
        
    }
}
