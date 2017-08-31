import java.util.Random;
import java.util.Scanner; 

public class Prompter{
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    Jar jar = new Jar();
    int firstGuess;
    
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

    void correctAnswer(int guessCount){
    System.out.printf("You got it in %s attempt(s).", guessCount);
    }  
  
    void setGameSettings(){
    System.out.println("What type of item does the jar hold?");  
    jar.jarItem = scan.nextLine();
    
    System.out.printf("What is the maximum amount of %s?\n", jar.jarItem);
    jar.maxJarItems = scan.nextInt();
    
    jar.randomJarQuantity = random.nextInt(jar.maxJarItems)+1;
    } 
  
    void startGame(){
      System.out.printf("How many %s are in the jar?\nPick a number between 1 and %s.\n", jar.jarItem, jar.maxJarItems);
      int guess = scan.nextInt();
  
      while(guess > 1000) {
        System.out.println("Sorry, please guess a number between 1 - 1000");
        guess = scan.nextInt();
      }
     jar.guessCount = 1;
      
     while(guess != jar.randomJarQuantity){
     
      guess = incorrectAnswer(guess, jar.randomJarQuantity);
      jar.guessCount += 1;
     }
     
     correctAnswer(jar.guessCount);
      
    }
}