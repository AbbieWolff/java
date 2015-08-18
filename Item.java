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

public class Item {
    
    // Define strings for name & description.
    String name;
    String description;
    
    // Define ItemWithQuantity class constructors.
    public Item (String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    // Declare set & get methods for class variables name & description.
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }

    public void setDescription(String newDescription) {
        this.name = newDescription;
    }
    
    public String getDescription() {
        return this.description;   
    }
    
    /*public void CreateItems() {
        String name1;
        String name2;
        
        name1 = ...?
        
        Item name1;
        name1 = new Item;
        name1.name(name2);
    }
    */
    
    
    /*
    Item name;
    name = new Item;
    name.name("name");
    */
    
    
    
    
    
    
}
