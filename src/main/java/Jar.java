import java.util.Random;
import java.util.Scanner;  

public class Jar extends GuessingGame {

  private int jarItems;
  String itemType;
  Random random = new Random();
  Scanner scan = new Scanner(System.in);
  Prompter prompter = new Prompter();
  
  String setItem(){
    String itemTypeQuestion = "What type of item does the jar hold?";
    ioLog.add(itemTypeQuestion);
    System.out.println(itemTypeQuestion);
    
    String itemResponse = scan.nextLine();
    return itemResponse;
  }
  
  int setItemNumber(String itemType){
    System.out.printf("What is the maximum amount of %s?\n", itemType);
    return scan.nextInt();
  }
  
  int fill(int maxItems){
    return random.nextInt(maxItems)+1;
  }
  
}