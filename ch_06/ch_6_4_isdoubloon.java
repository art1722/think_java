/*
A word is said to be a doubloon if every letter that appears in the word appears exactly
twice. Here are some example doubloons found in the dictionary:
Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, boob, Caucasus,
coco, Dada, deed, Emmett, Hannah, horseshoer, intestines, Isis, mama, Mimi, murmur,
noon, Otto, papa, peep, reappear, redder, sees, Shanghaiings, Toto

Write a method called isDoubloon that takes a string and checks whether it is a doubloon.
To ignore case, invoke the toLowerCase method before checking.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(isDoubloon("Emmexx"));
        
    }
    
    public static boolean isDoubloon(String init) {
        init = init.toLowerCase();
        
        int i = 0;
        int round = init.length() / 2;
        while (round > 0) {
            int idx;
            idx = init.indexOf(init.charAt(i), i+1);
            System.out.println(idx);   
            if (idx != -1) {
            init = init.substring(0, i) + init.substring(i + 1, idx) + init.substring(idx + 1, init.length());
                }
            System.out.println(init);   
            round--;
        }
        if (init.equals("")) {
            return true;
        }
        return false;
        
    }
}
