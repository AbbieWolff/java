/*
 * Abbie Wolff
 * July 2015
 * 
 * Java Programming Week 6 Assignment:
 * "[A] program that calls a method of type double 
 * to convert Fahrenheit to Celsius. The formula is C = 5/9(F-32). 
 * [T]he user enter[s] the Fahrenheit temperature; 
 * the program... display[s] the corresponding Celsius temperature."
 */
package temperatureconversion;

// Import Java Utility Scanner package.
import java.util.Scanner;

public class TemperatureConversion {
    
    // Declare conversion method to convert Farenheit to Celsius.
    public static double convertFarenheit(double farenheit) {
        // Round the result of ((farenheit amount - 32) x 5) / 9.
        return Math.round(((farenheit - 32) * 5) / 9);
        }
    
    // Command line arguments.
    public static void main(String[] args) {

        // Utilize Java Scanner library package to enable user input.
        Scanner userInput = new Scanner (System.in);
        
        // Declare variables.
        double farenheit;
        double celsius;
    
        // Introduce program to user.
        System.out.print(" Hey there! Let's convert Farenheit to Celsius.");
        System.out.println(" ");
        
        // Request user input for Farenheit variable value.
        System.out.println(" ");
        System.out.println(" Please enter the temperature" +
                " in degrees Farenheit: ");
        farenheit = userInput.nextDouble();
        
        // Calculate Celsius using Farenheit value.
        celsius = convertFarenheit(farenheit);
        
        // Print result.
        System.out.println(" ");
        System.out.println(" " + Math.round(farenheit) + 
                " degrees Farenheit is equivalent to " +
                celsius + " degrees Celsius.");           
        
        // Thank user.
        System.out.println(" ");
        System.out.println(" Thank you. Have a great day!");
        System.out.println(" ");
        
    }
    
}
