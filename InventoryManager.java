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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InventoryManager {
    
    // Declare chosenItem and chosenItemDescription strings.
    public String chosenItem;
    public String chosenItemDescription;
    
    // Declare chosenRecipe and ChosenRecipeDescription strings.
    public String chosenRecipe;
    public String chosenRecipeDescription;
    
    // Declare allItems, myItems, allRecipes, myRecipes Array lists.
    public ArrayList<Item> allItems;
    public ArrayList<Item> myItems; 
    public ArrayList<Recipe> allRecipes;
    public ArrayList<Recipe> myRecipes;
    public ArrayList<Recipe> completedRecipes;
    
    // Declare completed recipes, my items, my recipes strings.
    public String completedRecipesString;
        //completedRecipesString = toString(completedRecipes);
    public String myItemsString;
        //myItemsString = toString(myItems);
    public String myRecipesString;
        //myRecipesString = toString(myRecipes);
        
    // Declare a method to get items by name.     
    public Item getItemByName(String name) {
        // Return Item from allItems with name matching given name
    }
   
    // Declare a method to get recipes by name.
    public Item getRecipeByName(String name) {
        // Return Item from allRecipes with name matching given name.
    }
    
    // Declare a method to display completed recipes.
    public void displayRecipesDone (String[] finishedRecipes) {
        
    //go through all recipes in allRecipes 
    //and do something with the ones where myRecipe.hasCompleted==true
        
    // Print completedRecips.
    System.out.println("\nThe recipes you have already completed include: " +
            completedRecipesString);
    }
    
    // Declare a method to display all item ingredients in incomplete recipes.
    public void displayItems (String[] neededItems) {
        // work on this...
        
        // Print myItems.
        System.out.println("\nThe items you still need include: " + myItemsString);
    }
    
    // Declare a method to display recipes that have yet to be made.
    public void displayRecipes (String[] incompleteRecipes) {
        // work on this...
            
        // Print myRecipes.
        System.out.println("\nThe recipes you still need to make include: " + 
                myRecipesString);
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
