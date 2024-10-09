import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class ShihTzu extends Dog {

      public ShihTzu() {
      
         super(1, 1, Display.EAST, 0);
      
      }
      
      public ShihTzu(int x, int y, int dir, int beep){
      
         super(x, y, dir, beep);
      
      }
      
      public void DogTrick1(){
         
          turnLeft();
          move();
          turnAround();
          move();
          turnLeft();              
      }
      public void DogTrick2(){
         
          move();
          turnAround();
          move();
          move();
          turnAround();
          move();              
      }

   }