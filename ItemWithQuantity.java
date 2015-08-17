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

public class ItemWithQuantity {
    // Declare an integer for quantity and an Item called item.
    public int quantity;
    public Item item;
    
    // Define ItemWithQuantity class constructors: quantity & item.
    public ItemWithQuantity(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }
    
    // Declare set and get methods for quantity.
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    public int getQuantity() {
        return this.quantity;
    }    
}
