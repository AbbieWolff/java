/*
 * Abbie Wolff
 * June 2015
 */
package commission;

// Import Java Utility Scanner & Number Format Packages.
import java.util.Scanner;
import java.text.NumberFormat;


public class Commission {

    // Command line arguments
    public static void main(String[] args) {
        
        // Utilize Java library packages to enable user input.
        Scanner userInput = new Scanner (System.in);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        
        // Introduce program to user.
        System.out.print("Let's calculate your commission.");

        // Declare earnings and request user input for its value.
        double earnings;
        System.out.println(" Please enter the dollar amount you earned" +
                " in sales: ");
        earnings = userInput.nextDouble();
        
        // Declare earned_commission
        double earnedCommission = 0;
        
        // Calculate commision_earned based on earnings & commission rates.
        // If earnings are less than $50,000, commission is $0.
        if (earnings < 50000){
            earnedCommission = 0;
            System.out.println(" You earned less than $50,000." +
                " As a result, you did not earn any commission.");
            
            // If earnings are between $50,000 and $75,000, commission is 5%.
            } else if (earnings >= 50000 && earnings < 75000){
                earnedCommission = earnings * 0.05;
                System.out.println(" You earned between $50,000 and $75,000." +
                    " As a result, you earned a 5% commission.");
            
            // If earnings are more than $75,000, commission is 8%.
            } else if (earnings >= 75000) {
                earnedCommission = earnings * 0.08;
                System.out.println(" You earned more than $75,000." +
                    " As a result, you earned an 8% commission.");
            
            // If no amount is entered, display error message.
            } else {
                System.out.println(" Oops! No dollar amount entered. Try again.");
                }
     
        // Print result.
        System.out.println(" You earned " + 
                defaultFormat.format(earnedCommission) + 
                " in commission.");
        
        // Declare total_earnings.
        double totalEarnings;
        
        // Calculate total_earnings: add earned_commission to earnings.
        totalEarnings = earnedCommission + earnings;
        
        // Print final result.
        System.out.println(" Your total earnings (including commission)" +
                " were " + defaultFormat.format(totalEarnings) + 
                ". Don't spend it all in one place!");
    
    }
    
}
