import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class Pomeranian extends Dog {

      public Pomeranian() {
      
         super(1, 1, Display.EAST, 0);
      
      }
      
      public Pomeranian(int x, int y, int dir, int beep){
      
         super(x, y, dir, beep);
      
      }
      
      public void DogTrick1(){
         
         turnAround();
          move();
          turnAround();
          move();
              
      }
      public void DogTrick2(){
         
          turnRight();
          move();
          turnAround();
          move();
          turnRight();               
      }

   }