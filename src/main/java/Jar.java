import java.util.Random;

public class Jar {
    String jarItem;
    int maxJarItems;
    int randomJarQuantity;
    int guessCount;
    Random random = new Random();
   
    void fill(int maxJarItems){
      this.randomJarQuantity = random.nextInt(maxJarItems)+1;
    }
 
 public Jar(String jarItem, int randomJarQuantity){
    
   this.jarItem = jarItem;
   this.randomJarQuantity = randomJarQuantity;
    
    }
 
 }