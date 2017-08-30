import java.util.Scanner;  

public class Guess{

private int guess;
Scanner scan = new Scanner(System.in);  
  
int startGame(String itemType, int maxItems){
  System.out.printf("How many %s are in the jar?\nPick a number between 1 and %s.\n", itemType, maxItems);
  guess = scan.nextInt();
  
  while(guess > 1000) {
    System.out.println("Sorry, please guess a number between 1 - 1000");
    guess = scan.nextInt();
    }
  
  return guess;
  
}

//Correct Answer
void correctAnswer(int attemptCount){
  System.out.printf("You got it in %s attempt(s).", attemptCount);
  }
  
  
//Incorrect Answer
 int incorrectAnswer(int incorrectGuess, int jarCount){
  
  while(incorrectGuess > 1000) {
    System.out.println("Sorry, please guess a number between 1 - 1000");
    incorrectGuess = scan.nextInt();
    }
   
  System.out.println("I'm sorry, that is incorrect.");
      if (incorrectGuess > jarCount){
      System.out.println("Your guess is too high.");
      }
      else {System.out.println("Your guess is too low.");
      }
   System.out.println("Please guess again:\n");
   return scan.nextInt();
 }

}