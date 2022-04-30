/*
A word is said to be abecedarian if the letters in the word appear in alphabetical
order. For example, the following are all six-letter English abecedarian words:
abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy,
cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy
Write a method called isAbecedarian that takes a String and returns a boolean
indicating whether the word is abecedarian.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(isAbecedarian("abeef"));
    }
    
    public static boolean isAbecedarian(String init) {
        
        for (int i = 0; i < init.length() - 1; i++) {
            if (init.charAt(i) > init.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
