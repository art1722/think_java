// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(isAnagram("hello", "ellohh"));
    }
    public static boolean isAnagram(String str1, String str2) {
        char[] str1_array = str1.toCharArray();
        char[] str2_array = str2.toCharArray();
        Arrays.sort(str1_array);
        Arrays.sort(str2_array);
        System.out.println(Arrays.compare(str1_array, str2_array));
         return Arrays.equals(str1_array, str2_array);    
}
}
