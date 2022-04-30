/*
Write a method called letterHist that takes a string as a parameter and returns a histogram of the letters in the string. The zeroth element of the histogram should contain the number of a’s in the string (upper- and lowercase); the 25th element should contain the number of z’s. Your solution should traverse the string only once.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Arrays.toString(letterHist("Hello")));
    }
    public static int[] letterHist(String args) {
        args = args.toLowerCase();
        int[] ans = new int[26];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 0;
        }
        
        for (char chr: args.toCharArray()) {
            ans[chr - 'a'] += 1;
        }
        return ans;
    }
}
