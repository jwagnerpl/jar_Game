import java.util.Scanner; 

public class Prompter{
    
    Scanner scan = new Scanner(System.in);
    String jarItem;
    int maxJarItems;
    Jar jar = new Jar(jarItem, maxJarItems);
    int firstGuess;
  
  
    int incorrectAnswer(int incorrectGuess, int jarCount){
      
      while(incorrectGuess > jar.maxJarItems) {
        System.out.printf("Sorry, please guess a number between 1 - jar.maxJarItems");
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
    System.out.printf("You got it in %s attempts.", guessCount);
    }  
  
    void setGameSettings(){
      System.out.println("What type of item does the jar hold?");  
      jar.jarItem = scan.nextLine();
      
      System.out.printf("What is the maximum amount of %s?\n", jar.jarItem);
      jar.maxJarItems = scan.nextInt();
      jar.fill(jar.maxJarItems);
    } 
  
    void startGame(){
      System.out.printf("How many %s are in the jar?\nPick a number between 1 and %s.\n", jar.jarItem, jar.maxJarItems);
      int guess = scan.nextInt();
  
      while(guess > jar.maxJarItems) {
        System.out.printf("Sorry, please guess a number between 1 - %s\n",jar.maxJarItems);
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