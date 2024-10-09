import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class DogRace {

   public static void main(String[] args){
   
    String filename = JOptionPane.showInputDialog("What DogRace world?");
      
    Display.openWorld("maps/"+filename+".map");
   
   
   GoldenRetriever goldy = new GoldenRetriever(2, 9, Display.EAST, 0);
   Pomeranian pom = new Pomeranian(2, 2, Display.EAST, 0);
   ShihTzu tzu = new ShihTzu(2, 6, Display.EAST, 0);
   
   Thread t1 = new Thread(goldy);
   Thread t2 = new Thread(pom);
   Thread t3 = new Thread(tzu);
  
        
   t1.start();
   t2.start();
   t3.start();
  

     
   
   }

}