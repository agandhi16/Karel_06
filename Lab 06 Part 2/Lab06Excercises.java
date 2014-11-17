import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06Excercises {

   public static void task_07(Athlete arg) {
      
      int count = 0;
      while (!arg.nextToABeeper() && arg.frontIsClear()) 
     {
      arg.move();
      count++;
     }
      JOptionPane.showMessageDialog(null, "The task 07 robot took" + count + " steps.", "task_07 Robot", JOptionPane.OK_OPTION);
      //Shaurya helped with the line above.
    }
    
   public static void task_08(Athlete arg) {
      while (!arg.nextToARobot()) 
     {
      arg.move();
     }
      while (arg.hasBeepers()) 
     {
      arg.putBeeper();
     }
    }
    
    public static void task_09(Athlete arg) {
      for (int k = 1; k <= 5; k++)
     {
      for (int i = 1; i <= 4; i++)
     {
      arg.putBeeper();
     }
      arg.move();
     }
    }
    
    public static void task_10(Athlete arg) {
      while (arg.frontIsClear()) 
     {
         if (arg.nextToABeeper()) 
        {
         arg.move();
        }
         else 
        {
         arg.putBeeper();
        }
     }
    }
    
     public static void task_11(Athlete arg) {
       while (!arg.rightIsClear()) {
       arg.putBeeper();
       arg.move();
     }
    }
    
     public static void task_12(Athlete arg) {
       while (arg.rightIsClear() || !arg.nextToABeeper()) {
       arg.move();
     }
    }
   
     public static void main(String[] args) 
    {
          String filename = JOptionPane.showInputDialog("What robot map?");
          Display.openWorld("maps/" + filename + ".map");
         
         {
          Athlete n = new Athlete(2, 2, Display.WEST, 1);
         }
          Display.setSize(11, 11);
          Display.setSpeed(6);
          
          Athlete liam = new Athlete(1, 1, Display.EAST, 20);
          Athlete kyle = new Athlete(1, 2, Display.EAST, 20);
          Athlete seb = new Athlete(1, 3, Display.EAST, 20);
          Athlete miles = new Athlete(1, 4, Display.EAST, 20);
          Athlete bobby = new Athlete(1, 5, Display.EAST, 20);
          Athlete marco = new Athlete(1, 6, Display.EAST, 20);

          
          task_07(liam);
          task_08(kyle);
          task_09(seb);
          task_10(miles);
          task_11(bobby);
          task_12(marco);
     
    }
    
}   
     
      
      