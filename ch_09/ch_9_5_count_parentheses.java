/*
1. Encapsulate this fragment in a method that takes a string argument and returns
the final value of count.
2. Test your method with multiple strings, including some that are balanced and
some that are not.
3. Generalize the code so that it works on any string. What could you do to generalize
it more?
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s = "((3 + 7) * 2)";
        isParentheses(s);
    }
    public static boolean isParentheses(String console) {
        int count = 0;
        for (int i = 0; i < console.length(); i++) {
            char c = console.charAt(i);
                if (c == '(') {
                count++;
                } else if (c == ')') {
                count--;
        }
        }
        System.out.println(count);
        return true;
    }
}
