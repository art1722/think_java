/*
Exercise 5-3.
Fermat’s Last Theorem says that there are no integers a, b, c, and n such that
an + bn = cn, except when n ≤ 2.
Write a program named Fermat.java that inputs four integers (a, b, c, and n) and checks to see if Fermat’s theorem holds. If n is greater than 2 and an + bn = cn, the program should display Holy smokes, Fermat was wrong! Otherwise, the program should display “No, that doesn’t work.”
Hint: You might want to use Math.pow.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("To check Fermat's theorem, please input three number");
        
        Scanner console = new Scanner(System.in);
        int firstnum = console.nextInt();
        console.nextLine();
        int secondnum = console.nextInt();
        console.nextLine();
        int thirdnum = console.nextInt();
        console.nextLine();
        int n = console.nextInt();
        
        System.out.println(isFermat(firstnum, secondnum, thirdnum, n));
    }
    
    public static String isFermat(int a, int b, int c, int n) {
        boolean checkFermat = (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
        if (n > 2 && checkFermat) {
            return "Holy smokes, Fermat was wrong";
        } else {
            return "No, that doesn't work";
        }
    }
}
