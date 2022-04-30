/*
Write a program named Quadratic.java that finds the roots of ax2 + bx + c = 0
using the quadratic formula: x=−b± b2−4ac
2a
Prompt the user to input integers for a, b, and c. Compute the two solutions for x,
and display the results.
Your program should be able to handle inputs for which there is only one or no solu‐ tion. Specifically, it should not divide by zero or take the square root of a negative number.
Be sure to validate all inputs. The user should never see an input mismatch exception. Display specific error messages that include the invalid input.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        console.nextLine();
        int b = console.nextInt();
        console.nextLine();
        int c = console.nextInt();
        
        System.out.println(Quadratic(a, b, c));
        
    }
    
    public static String Quadratic(int a, int b, int c) {
        
        if (a == 0) {
            return "Error: divided by zero";
        }    
        double root = Math.pow(b, 2) - (4 * a * c);
        if (root < 0) {
            return "Error: negative square root";
        }
        
        double ans1 = ((- b - Math.pow(root, 1/2)) / (2 * a));
        double ans2 = ((- b - Math.pow(root, 1/2)) / (2 * a));
        return String.format("%f and %f", ans1, ans2);
    }
}
