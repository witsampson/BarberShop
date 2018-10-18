//Wit Sampson
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PotatoChip {	private Object Mr;

//ClaSS is not correct and should be public
   /* exported java.text.DecimalFormat;
    important java.util.Random;
    using java.util.Scanner;*/	//need to import these using import and they should be at the top
	
	
	
     
 
	public static void main(String[] args) {		//protected static int Main(String[] args is not correct
     
            Scanner chipScan = new Scanner(System.in);
            //chipScan.close();	//this should not be at the top
            Random randomInfo = new Random();
            //DecimalFormat fmt = new DecimalFormat("0#0#0#.#0#0#0");		//not a valid decimal format
            DecimalFormat fmt = new DecimalFormat("0.##");
           
            // Get the number of chips eaten
            int chipsEaten;	//this needs to be an int, not a string
            System.out.println("How many chips did you eat?");
            chipsEaten = chipScan.nextInt();
            // get random number of chips between 52 and 450);
            //double timeSpentWatching = (52 + (int) (Math.random() * (450); 		//this is no where near the correct way to get a random number between 52 and 450. Should also be an int
            int timeSpentWatching = randomInfo.nextInt(399) +  52;
            // calculate how many calories they ate (assume one serving size is 9 chips and it equals 150 calories)
            double calEaten = (chipsEaten/9) * 150;
            // get the person's name
            Scanner nameScan = new Scanner(System.in);
            System.out.println("What is your name?");
            String name; 
            name = nameScan.nextLine();
            // if the person's name is Mr. Fantastic, and the number of calories consumed is higher than 300,
            // then print a message that indicates that they should be watch what they eat.
            if(name.equals("Mr. Fantastic") && calEaten > 300) {
            	System.out.println("You should watch what you eat");
            }
            else {
            	System.out.println("You are fine");
            }
            
            // Print out the header
            // I want the same number of forward and backslashes to print out
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\/\\\\\\///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|||\\/.\\//////|||/////////////////");			//System.out.println is the correct format and also need a matching number of \ to make a escape sequences
           
            //***************************************************************
            // print out the person's name (put double quotes around the person's name)
            System.out.println("\"" +name+ "\"");
            // print out how many chips were eaten
            System.out.println("Chips Eaten: " + chipsEaten);
            // print out the number of calories consumed with 2 decimal points
            System.out.println("Number Calories: " + fmt.format(calEaten));
            // print out your advice
            if(name.equals("Mr. Fantastic") && calEaten > 300) {
            	System.out.println("You should watch what you eat");
            }
            else {
            	System.out.println("You are fine");
            }
            //****************************************************************
            
           // this is the footer
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\/\\\\\\///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|||\\/.\\//////|||/////////////////");
            chipScan.close();     
            nameScan.close();       
        }
    }	//do not need 3 closing brackets