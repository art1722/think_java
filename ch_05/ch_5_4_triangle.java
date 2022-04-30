/*
If you are given three sticks, you may or may not be able to arrange them in a trian‐ gle. For example, if one of the sticks is 12 inches long and the other two are 1 inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:
If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.

Write a program named Triangle.java that inputs three integers, and then outputs whether you can (or cannot) form a triangle from the given lengths. Reuse your code from the previous exercise to validate the inputs. Display an error if any of the lengths are negative or zero.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner console = new Scanner(System.in);
        int n_first = console.nextInt();
        console.nextLine();
        int n_second = console.nextInt();
        console.nextLine();
        int n_third = console.nextInt();
        
        System.out.println(Triangle(n_first, n_second, n_third));
    }
    
    public static String Triangle(int first, int second, int third) {
        
        if ((first <= 0) || (second <= 0) || (third <= 0)) {
            return "Error: zero or negative input";
        }
        boolean output = ((first < second + third) && (second < first + third) && (third < first + second));
        return String.format("%b", output);
        
    }
}
