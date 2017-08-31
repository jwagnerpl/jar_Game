import java.util.ArrayList;
import java.util.List;


public class GuessingGame {
  public static void main(String[] args){
    Prompter prompter = new Prompter();   
    
    prompter.setGameSettings();
    prompter.startGame();
  }  
}

