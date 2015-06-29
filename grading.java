/*
 * Abbie Wolff
 * June 2015
 */
package grading;

// Import Java Utility Scanner package.
import java.util.Scanner;

public class Grading {

    // Command line arguments
    public static void main(String[] args) {
        // Introduce program to user.
        System.out.print(" Hey there! Let's determine your students' grades.");
        
        // Instruct user on how to use the program.
        System.out.println(" When prompted, please enter each student's name." +
                " You will then be asked to enter his/her numerical grade." +
                " Type DONE in the name field when finished.");
        System.out.println(""); // blank line for visual spacing purposes
        
        // Utilize Java Scanner library package to enable user input.
        Scanner userInput = new Scanner (System.in);
        
        // Declare studentName, numberGrade & letterGrade variables.
        String studentName;
        char letterGrade;
        letterGrade = 'G'; // Assign letterGrade value as G (for now).
        double numberGrade;
        
        // Request user input for the first studentName value.
        System.out.print(" Enter the student's name: ");
        studentName = userInput.next();
        
        /*
         * Create a do-while loop that stops when the user inputs
         * "DONE into the name field.
        */
        do {
            // Request user input for numberGrade value.
            System.out.println("");
            System.out.print(" Please enter his/her numerical grades: ");
            numberGrade = userInput.nextDouble();
        
            // Determine letterGrade based on numberGrade value entered.
            // If grade is outside of the 0 - 100 range, print error & retry.
            if (numberGrade < 0 || numberGrade > 100) {
                System.out.println("");
                System.out.println(" Whoops! Please enter a number" +
                    " between 0 and 100: ");
                numberGrade = userInput.nextDouble();
                System.out.println("");
                
                // If grade is 90 - 100, assign A & print "earned an A."
                } else if (numberGrade >= 90 && numberGrade <= 100) {
                letterGrade = 'A';
                System.out.println("");
                System.out.println(" " + studentName + " earned an A.");
                System.out.println("");
            
                // If grade is 80 - 89.99, assign B & print "earned a B."
                } else if (numberGrade < 90 && numberGrade >= 80) {
                    letterGrade = 'B';
                    System.out.println("");
                    System.out.println(" " + studentName + " earned a B.");
                    System.out.println("");
            
                // If grade is 70 - 79.99, assign C & print "earned a C."
                } else if (numberGrade < 80 && numberGrade >= 70) {
                    letterGrade = 'C';
                    System.out.println("");
                    System.out.println(" " + studentName + " earned a C.");
                    System.out.println("");
        
                // If grade is 60 - 79.99, assign D & print "earned a D."    
                } else if (numberGrade < 70 && numberGrade >= 60) {
                    letterGrade = 'D';
                    System.out.println("");
                    System.out.println(" " + studentName + " earned a D.");
                    System.out.println("");
                
                // If grade is 0 - 60, assign F & print "earned an F."
                } else if (numberGrade < 60 && numberGrade >= 0) {
                    letterGrade = 'F';
                    System.out.println("");
                    System.out.println(" " + studentName + " earned an F.");
                    System.out.println("");
                }
            
            // Prompt the user to enter the next student's name.
            System.out.print(" Enter the next student's name: ");
            studentName = userInput.next();
        
        // Complete do-while loop by describing the while condition,
        // which is studentName must not equal "DONE".
        } while (!"DONE".equals(studentName));
        
        /* 
         * When the while condition is not met, when the name field
         * reads "DONE", print farewell message.
        */
        System.out.println("");
        System.out.print(" Completed. Thank you!");
        System.out.println("");
        System.out.println("");
              
    } 
}
