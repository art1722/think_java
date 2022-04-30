/*
Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess by using this formula:

x1 = x0 + a/x0 /2
For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = 6 + 9/6 /2 = 3 . 75, which is closer. We can repeat the procedure, using x1 to cal‐ culate x2, and so on. In this case, x2 = 3 . 075 and x3 = 3 . 00091. So the repetition con‐ verges quickly on the correct answer.
Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calcu‐ late the absolute value of the difference.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        
        System.out.println(squareRoot(input));
    }
    
    public static double squareRoot(int a) {
        double old_estimate = a;
        double new_estimate = a/2;
        
        while (Math.abs(old_estimate - new_estimate) > 0.001) {
            
            System.out.print(old_estimate);
            System.out.print(" ");
            System.out.println(new_estimate);

            old_estimate = new_estimate;
            new_estimate = (new_estimate + (a/new_estimate)) / 2;
        
        }
        return new_estimate;

    }
}
