/*
In the board game Scrabble, each tile contains a letter, which is used to spell words in
rows and columns, and a score, which is used to determine the value of words. The
point of this exercise is to practice the mechanical part of creating a new class
definition.
1. Write a definition for a class named Tile that represents Scrabble tiles. The
instance variables should include a character named letter and an integer
named value.
2. Write a constructor that takes parameters named letter and value, and initializes
the instance variables.
3. Write a method named printTile that takes a Tile object as a parameter and
displays the instance variables in a reader-friendly format.
4. Write a main method that creates a Tile object with the letter Z and the value 10,
and then uses printTile to display the state of the object.
5. Implement the toString and equals methods for a Tile.
6. Create getters and setters for each of the attributes.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Tile tileObj = new Tile('Z', 10);
        System.out.println(tileObj);
    }
    public static class Tile {
        private char letter;
        private int value;
        
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
        
    public String toString() {
        return String.format("letter:%2s, value:%3d", this.letter, this.value);
    }

    public boolean equals(Tile that) {
        final DELTA = 0.01;
        return this.letter == that.letter && this.value == that.value;
    }
        
    public char getLetter() {
        return this.letter;
    }
    
    public int getValue() {
        return this.value;
    }
        
    public void setLetter(char letter) {
        this.letter = letter;
    }
        
    public void setValue(int value) {
        this.value = value;
    }
    }

}
