package mpg;
// @author Abbie

// import Java Scanner library package.
import java.util.Scanner;
    
public class MPG {
    // Command line arguments.
    public static void main(String[] args) {
        
        // Utilize Java Scanner library package to enable user input.
        Scanner user_input = new Scanner (System.in);
        
        // Introduce program to user.
        System.out.print("Let's calculate your mpg.");

        // Declare miles and request user input for its value.
        float miles;
        System.out.print(" Please enter the number of miles you traveled: ");
        miles = user_input.nextFloat();
        
        // Declare gallons and request user input for its value.
        float gallons;
        System.out.print("Please enter the number of gallons you used: ");
        gallons = user_input.nextFloat();
        
        // Declare miles_per_gallon and assign its value.
        Float miles_per_gallon;
        miles_per_gallon = miles / gallons;
        
        // Print result.
        System.out.println("Thanks! Your fuel efficiency was " + 
                miles_per_gallon + " miles per gallon.");     
        
    }
}
