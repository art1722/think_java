// "static void main" must be defined in a public class.
/*
Now that we have conditional statements, we can get back to the Guess My Number game from Exercise 3-4.
You should already have a program that chooses a random number, prompts the user to guess it, and displays the difference between the guess and the chosen number.

By adding a small amount of code at a time and testing as you go, modify the pro‐ gram so it tells the user whether the guess is too high or too low, and then prompts the user for another guess.
The program should continue until the user gets it right or guesses incorrectly three times. If the user guesses the correct number, display a message and terminate the program.

original code from ApolloZhu
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    int times = 0;
        
    guess(times);

   }
    
    public static void guess(int times){
    
      System.out.println("I'm thinking of a number between 1 and 10");
      System.out.println("(including both). Can you guess what it is?");
      System.out.print("Type a number: ");
        
        Scanner console = new Scanner(System.in);
        int guess = console.nextInt();
        
      Random random = new Random();
      int answer = random.nextInt(10) + 1;
        
    int diff = Math.abs(guess-answer);
    System.out.printf("\nYour guess is: %d\n", guess);
      System.out.printf("The number I was thinking of is: %d\n", answer);
      System.out.printf("You were off by: %d\n", diff);
    
    if (times == 2) {
        System.out.println("Game over!");
    }
    else if (diff != 0) {
        System.out.printf("Try again, %d times left\n", 2-times);
        System.out.println();
        guess(times + 1,);
    }
    else {
        System.out.println("You win!");
    }
    }
}
/*
ApolloZhu:
// "static void main" must be defined in a public class.
public class Main {
    private static Scanner console = new Scanner(System.in);

   public static void main(String args[]){
   
      Random random = new Random();
      int answer = random.nextInt(100) + 1;
      guess(answer);
      
   }
  
   //
    * A recursive function for getting number guessed and compare to answer
    * @param answer The correct answer
    //
   private static void guess(int answer){
      System.out.println("I'm thinking of a number between 1 and 100");
      System.out.println("(including both). Can you guess what it is?");
      System.out.print("Type a number: ");
      
      int input = console.nextInt();
      
      if (input == answer){
         System.out.println(input + " is correct!");
      }
      else {
         System.out.println(input + " is too " + (input > answer ? "high" : "low"));
         System.out.println("Try again\n");
         guess(answer);
      }
   }
}
*/
