/**
*
* Description of the program goes here  // provide a brief description
*
* @author Alex Gandhi
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
 
 public class Lab06 {
 
         public static void task_01(Athlete arg) 
         {
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
         }
            
          public static void task_02(Athlete arg) 
         {
            while (!arg.nextToABeeper()) 
           {
               arg.move();
           }
         }
           
           public static void task_03(Athlete arg) 
         {
            while (arg.frontIsClear()) 
           {
               arg.move();
           }
         }
           
           public static void task_04(Athlete arg) 
         {
            while (arg.frontIsClear()) 
           {
               if (arg.nextToABeeper()) 
              {
               arg.pickBeeper();
              }
               arg.move();
           }
         }
          
          public static void task_05(Athlete arg) 
         {
            while (arg.frontIsClear())
              {
               arg.move();
              
            while (arg.nextToABeeper()) 
           {  
               arg.pickBeeper();
           }
              }
         }
           
          public static void task_06(Athlete arg) 
         {
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
            arg.move();
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
         } 
           
          public static void main(String[] args) 
         {
          
          String filename = JOptionPane.showInputDialog("What robot map?");
 	
          Display.openWorld("maps/" + filename + ".map");
          Display.setSize(10, 10);
          Display.setSpeed(7);
          
          Athlete alex = new Athlete(1, 1, Display.EAST, Display.INFINITY);
          Athlete henry = new Athlete(1, 2, Display.EAST, Display.INFINITY);
          Athlete sourna = new Athlete(1, 3, Display.EAST, Display.INFINITY);
          Athlete connor = new Athlete(1, 4, Display.EAST, Display.INFINITY);
          Athlete nikhil = new Athlete(1, 5, Display.EAST, Display.INFINITY);
          Athlete josh = new Athlete(1, 6, Display.EAST, Display.INFINITY); 
          
          task_01(alex);
          task_02(henry);
          task_03(sourna);
          task_04(connor);
          task_05(nikhil);
          task_06(josh);
          
         }
         
}