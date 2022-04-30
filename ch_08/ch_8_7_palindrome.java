// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printString("hello");
        System.out.println();
        printBackward("hello");
        System.out.println();
        System.out.println(reverseString("programming"));
        System.out.println(isPalindrome("otto"));
    }
    /**
 * Returns the first character of the given String.
 */
public static char first(String s) { return s.charAt(0);
}
/**
 * Returns all but the first letter of the given String.
 */
public static String rest(String s) { return s.substring(1);
}
/**
 * Returns all but the first and last letter of the String.
 */
public static String middle(String s) { return s.substring(1, s.length() - 1);
}
/**
 * Returns the length of the given String.
 */
public static int length(String s) { return s.length();
}
    
public static void printString(String s) {
    if (s.length() > 0) {
    System.out.print(s.charAt(0));
    printString(s.substring(1));
        }
}    
    
public static void printBackward(String s) {
    if (s.length() > 0) {
    printBackward(s.substring(1));
    System.out.print(s.charAt(0));
    }
}
public static String reverseString(String s) {
    // we can also use String.valueOf();
    return s.length() == 1 ? Character.toString(s.charAt(0)) : reverseString(s.substring(1)) + Character.toString(s.charAt(0));
}
public static boolean isPalindrome(String s) {
    System.out.println(s.compareTo(reverseString(s)));
    return s.equals(reverseString(s));
}
}
