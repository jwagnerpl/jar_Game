import java.util.ArrayList;
import java.util.List;

public class GuessingGame {

  private static String itemType;
  private static int maxItems;
  private static int guessAttempt;
  private static int jarCount;
  private static int guessCount;
  public static List<String> ioLog = new ArrayList<String>();
  
  public static void main(String[] args) {
    
    Prompter prompter = new Prompter();    
    
    
    Jar jar = new Jar(); 
    itemType = jar.setItem();
    maxItems = jar.setItemNumber(itemType);
    jarCount = jar.fill(maxItems);
    
    Guess guess = new Guess();
    guessAttempt = guess.startGame(itemType, maxItems);
    guessCount = 1;
    
   while(guessAttempt != jarCount){
      

      
      guessAttempt = guess.incorrectAnswer(guessAttempt, jarCount);
      guessCount += 1;
   }
 
    guess.correctAnswer(guessCount);
    
    System.out.println(prompter.ioLog);
  
    
    
    
  }
  

  
}

