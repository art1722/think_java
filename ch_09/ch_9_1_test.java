// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        char x = 104;
        //x = x + 1 ; ->error: incompatible types: possible lossy conversion from int to char [in Main.java]
        System.out.println(x);
        System.out.print("x++:");
        System.out.println(x++);
        System.out.println(x++);
        System.out.print("x+3 or 3+x:");
        System.out.println(x+3);
        System.out.println("" + 7);
        System.out.println(8 + 2.5);
        
        boolean temp = true;
        System.out.print(temp + "yeah");
    }
}
