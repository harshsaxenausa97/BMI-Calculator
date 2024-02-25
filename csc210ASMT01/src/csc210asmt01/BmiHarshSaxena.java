/*********************************************************************************************
 * 
 * File: BmiHarshSaxena.java
 * By: Harsh Saxena
 * Date: 03/02/2018
 * 
 * Description: Body Mass Index(BMI) Computation. User will enter height in feet and inches.
 *              Also enter weight in pound. Program calculates and display BMI of the user
 *              indicate whether the user is overweight or not.
 * ********************************************************************************************/

package csc210asmt01;
import java.util.Scanner; // needed for Scanner

/**
 *
 * @author harshsaxena
 */
public class BmiHarshSaxena {
    /**
     * @param args the command line arguments
     */
    
    // Create a single shared Scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("******************************************************************");
        System.out.println("Welcome to: ");
        System.out.println("            BODY MASS INDEX (BMI) Computation ");
        System.out.println("                              by Harsh Saxena ");
        System.out.println("******************************************************************\n\r");
        
        // Prompt the user to enter height in feet and inches (both integers)
        System.out.print("Please Enter height in feet and inches:    ");
        
        // Read the height in feet and inches
        int feet = scanner.nextInt();
        int inches = scanner.nextInt();
        
        // Calculate height in inches
        int height = (feet * 12) + inches;
         
        // Prompt the user to enter weight in pounds (an integer)
        System.out.print("Please Enter weight in pounds:    ");
        
        // Read the weight
        int weight = scanner.nextInt();
        //scanner.close();
        
        // Calculate the BMI of the user
        float bmi = (float) (703 * (weight / Math.pow(height,2)));
       
        String BMI = Float.toString(bmi);
        
        String result = "";
        
        if (bmi == 25) {
            result = "borderline overweight.";
        }
        
        if (bmi < 25) {
            result = "not overweight.";
        }
        if (bmi > 25) {
            result = "overweight.";
        }
        
        //Display the BMI
        System.out.println("\n\rYour BMI is: " + BMI + " which means you are " + result);
        System.out.println("\n\rThe SFSU Mashouf Wellness Center is now open!");
        
        System.out.println("\n\r******************************************************************\n\r");
        System.out.println("***   Thank you for using my program.  ****\n\r");
        System.out.println("******************************************************************");
                

    }
}