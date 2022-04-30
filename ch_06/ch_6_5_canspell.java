/*
In Scrabble each player has a set of tiles with letters on them. The object of the game
is to use those letters to spell words. The scoring system is complex, but longer words
are usually worth more than shorter words.
Imagine you are given your set of tiles as a string, like "quijibo", and you are given
another string to test, like "jib".
Write a method called canSpell that takes two strings and checks whether the set of
tiles can spell the word. You might have more than one tile with the same letter, but
you can use each tile only once.
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(canSpell("banana", "adnd"));
    }
    public static boolean canSpell(String tiles, String test) {
        int lengthTest = test.length();
        //stem.out.println(lengthTest);
        
        while (lengthTest > 0) {
            if (tiles.indexOf(test.charAt(0)) == -1) {
                return false;
            }
            test = test.substring(1, test.length());
            System.out.println(test);
            
            lengthTest--;
        }
        return true;
    }
}
