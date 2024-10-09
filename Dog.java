   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public abstract class Dog extends Athlete implements Runnable
   {
       public Dog(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public Dog()
      {
         super(1, 1, Display.EAST, 0);
      }
       public abstract void DogTrick1();
       public abstract void DogTrick2();
       public void run()
      {
         while(frontIsClear())
         {
    
            if (!rightIsClear())
            {
            DogTrick1();
            move();
            }
            else if(!leftIsClear())
            {
            DogTrick2();
            move();
            }
           else
           {  
            move();
            }
        
         }
      }
   }
        