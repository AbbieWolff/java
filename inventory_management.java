/*
 * Abbie Wolff
 * August 2015
 * 
 * Java Programming Final Project:
 * A program that aids players of The Witcher 3: Wild Hunt video game
 * with inventory management and trading in-game. It is not a mod.
 * Users enter the ingredient they are wondering whether they should keep
 * or sell, and the program returns with an answer, based on a database of
 * information about what alchemy & crafting recipes require each ingredient.
 * Users also keep the app up to date on which recipes they have created so far
 * so that the app can tell them an up-to-date grocery list of needed and
 * not-needed recipe ingredients.
 */

package inventory_management;

// Import Java Utility Scanner package to allow user input.
import java.util.Scanner;
import java.util.Arrays;

public class Inventory_Management {

    // Command line arguments.
    public static void main(String[] args) {
            
        // Utilize Java Scanner library packages.
        Scanner userInput = new Scanner (System.in);
        
        // Greeting & explanation of application.
        System.out.print("Hey there! Welcome to the grocery list creator /"
            + " inventory management application for players of "
            + "*The Witcher 3: Wild Hunt* video game. ");       
        
        // Instructions.
        System.out.print("When prompted, please type the names of the "
            + "alchemy and crafting recipes you have already created."
            + "Then, when requested, enter the ingredient you "
            + "would like to inquire about. I'll tell you whether "
            + "you should keep it for alchemy or crafting recipes, "
            + "or whether you can sell it for coin. ");
        
        // Request user input for, declare and assign value to MyRecipes.
        String[] MyRecipes;
        System.out.print("Please enter the names of the recipes "
                + "you have completed, separated by commas."
                + "When you are finished, type DONE.");
        
        do {
            // Request user input for numberGrade value.
            System.out.println("");
            System.out.print(" Please enter the next completed recipe name: ");
            myRecipes[#] = userInput.next[];
        
            //If input is invalid, print error & retry.
            if (userInput.next() == "null") {
                System.out.println("");
                System.out.println(" Whoops! Please enter a valid" +
                    " recipe name in all lowercase letters: ");
                myRecipes[#] = userInput.next();
                System.out.println("");
                
                // If grade is 90 - 100, assign A & print "earned an A."
                } else if (userInput.next() != "null"){ 
                    System.out.println("");
                    System.out.println(" You completed the " + recipeName + 
                            + " recipe.");
                    System.out.println("");
                }
        
        // Complete do-while loop by describing the while condition,
        // which is MyRecipes input must not equal "DONE".
        } while (!"DONE".equals(userInput.next()));
               
        
        // Request user input for, declare and assign value of MyItem.
        System.out.print("Please type the name of an item you are wondering "
                + "if you should sell or keep: ");
        String myItem;
        myItem = userInput.next();
        
        // Declares a class called Recipe.
        class Recipe {
            // Declares a string called recipeName to contain the recipes' names.
            String[] recipeName;

            // Declare a string called recipeType with two options, 1 or 2,
            // for either an alchemy recipe or a crafting recipe.
            String[] recipeType = {"alchemy", "crafting"};
            String[] recipeTypeA = {"potion"};
            String[] recipeTypeB = {"weapon", "armor", "runestone", "bomb",
                    "arrow" };
            // Update all recipe type lists to show a comprehensive list of all 
            // recipe types in the game.
        
            // Declare a string called recipeIngredients to contain each recipe's
            // ingredients.
            String[] recipeIngredients = {
                // Insert comprehensive list of ingredients in the game.
            };
            
            // Updated list of recipes completed & yet to complete.
            char[] completedRecipe; 
                public String markRecipeComplete(char completedRecipe) {
                    if () {
                        completedRecipe = 'n';
                        recipeIngredients++;
                    } 
                    
                        else if () {
                            completedRecipe = 'y';
                            recipeIngredients--;
                        }
                    
                    return completedRecipe;
                }
        
            // Declare item class.
            class Item {
                   // Declare char & strings about if the item is needed.
                char[] neededItem = {'y', 'n'};
                String itemStatus;
                
                // Determine how an item is declared needed or not needed
                // with a method called assignItemStatus.
                public String assignItemStatus(char neededItem) {
                         
                    // If the item is needed, explain that to the user.
                    if (neededItem == 'y') {
                        itemStatus = "needed";
                        System.out.print(" Keep it. You will need it.");
                    }
                
                        // If the item is not needed, explain that to the user.
                        else if (neededItem == 'n') {
                            itemStatus = "not needed";
                            System.out.print(" Sell it. You won't need it.");
                        }
                
                // Return a string version of the result of the check.
                return itemStatus;
                } // close assignItemStatus method.
                
                // Determine if an item is needed or not.
                public char assignNeededItem () {
                    // Add content here.
                }
                
        
                // Add more descriptors & fields & methods here.     
            
            } // Close Item class.
        } // Close Recipe class.

        
    
    
    
    } // Close command line arguments.

} // Close program.
