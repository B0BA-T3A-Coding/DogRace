import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class GoldenRetriever extends Dog {

      public GoldenRetriever() {
      
         super(1, 1, Display.EAST, 0);
      
      }
      
      public GoldenRetriever(int x, int y, int dir, int beep){
      
         super(x, y, dir, beep);
      
      }
      
      public void DogTrick1(){
         
         turnAround();
         turnAround();               
      }
      public void DogTrick2(){
         
          turnAround();
          move();
          turnAround();
          move();
               
      }

   }