/*
The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this:
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
To choose a random number, you can use the Random class in java.util. Here’s how it works:
*/

// "static void main" must be defined in a public class.
import java.util.Random;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int input, correct;
        
        System.out.println("I'm thinking of a number between 1 to 100");
        System.out.println("Type a number");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        Random random = new Random();
        correct = random.nextInt(100) + 1;
        
        System.out.printf("Your guess is %d \n", input);
        System.out.printf("The number I was thinking is %d \n", correct);
        System.out.printf("You were off by %d", java.lang.Math.abs(input-correct));
        System.out.println();
    }
}
