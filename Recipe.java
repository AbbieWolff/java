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


public class Recipe {
    
    // Declare Recipe class constructors: result Item, ingredients ArrayList, 
    // hasCompleted boolean; 
    public Recipe(Item result, String name, ArrayList<ItemWithQuantity> ingredients, 
            boolean hasCompleted) {
      this.result = result;
      this.name = name;
      this.ingredients = ingredients;
      this.hasCompleted = hasCompleted;
    }
    
    // Declare an item called result.
    public Item result;
    
    // Declare a get name method.
    public String getName() {
        return this.result.name;
    }
    
    // Declare a get description method.
    public String getDescription() {
        return this.result.description;
    }
    
    // Declare a boolean to contain the status of recipe completion.
    public boolean hasCompleted; // initially set to false (incomplete)
    
    // Declare a set method for the boolean.
    public void setHasCompleted(boolean done) {
        this.hasCompleted = done;
    }
    
    // Declare a get method for the boolean.
    public String getHasCompleted() {
        return Boolean.toString(this.hasCompleted);
    }
    
    // Declare an array list called ingredients.
    public ArrayList<ItemWithQuantity> ingredients = new ArrayList();
 
}
