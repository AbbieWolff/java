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

package inventorymanagement;

// imports
import java.util.Arrays;
import java.util.Scanner;

public class InventoryManager {
    
    public String chosenItem;
    public String chosenItemDescription;
    
    public String chosenRecipe;
    public String chosenRecipeDescription;
    
    public String completedRecipes;
    public String myItems;
    public String myRecipes;
    
    
    // Declare a method to display completed recipes.
    public void displayRecipesDone (String[] finishedRecipes) {
        // Print completedRecips.
        System.out.println("\nThe recipes you have already completed include: " +
                completedRecipes);
    }
    
    // Declare a method to display needed items.
    public void displayItems (String[] neededItems) {
        // work on this...
        
        // Print myItems.
        System.out.println("\nThe items you still need include: " + myItems);
    }
    
    // Declare a method to display recipes that have yet to be made.
    public void displayRecipes (String[] incompleteRecipes) {
        // work on this...
            
        // Print myRecipes.
        System.out.println("\nThe recipes you still need to make include: " + 
                myRecipes);
    }
    
    // Declare a method to display an item description.
    public void displayItemDescription (String itemDescription) {
        // work on this...
        
        // Print chosenItem & corresponding description.
        System.out.println("\nThe description for " + chosenItem + " is: " + 
                chosenItemDescription);
    }
    
    // Declare a method to display a recipe description.
    public void displayRecipeDescription (String recipeDescription) {
        // work on this...
        
        // Print chosenRecipe and corresponding description.
        System.out.println("\nThe description for " + chosenRecipe + " is: " + 
                chosenRecipeDescription);
    }  

}
