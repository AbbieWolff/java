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
import java.util.*;

public class InventoryManager {
    
    // Declare chosenItem and chosenItemDescription strings.
    public String chosenItem;
    public String chosenItemDescription;
    
    // Declare chosenRecipe and ChosenRecipeDescription strings.
    public String chosenRecipe;
    public String chosenRecipeDescription;
    
    // Declare allItems and allRecipes Array lists.
    public ArrayList<Item> allItems = new ArrayList();
    public ArrayList<Recipe> allRecipes = new ArrayList();;
    
    // Add items to the allItems array list.
    allItems.add( "Alchemists Powder" );
    allItems.add( "Alchemy Paste" );
    allItems.add( "Alghoul Bone Marrow" );
    allItems.add( "Alghoul Claw" );
    allItems.add( "Alghoul Mutagen" );
    allItems.add( "Allspice" );
    allItems.add( "Ancient Leshen Mutagen" );
        "Arachas Eye", "Arachas Mutagen", "Arachas Venom", "Archgriffin Mutagen" +
        "Arenaria", "Balisse Fruit", "Basilisk Hide", "Basilisk Mutagen" +
        "Basilisk Venom", "Bear Fat", "Beggartick Blossoms", "Berbercane Fruit" +
        "Berserker Hide", "Bison Grass", "Bloodmoss", "Blowball", "Bryonia" +
        "Buckthorn", "Calcium Equum", "Cave Troll Liver", "Celandine" +
        "Cherry Cordial", "Chitin Scale", "Chort Hide", "Chort Mutagen" +
        "Cockatrice Egg", "Cockatrice Mutagen", "Cockatrice Stomach" +
        "Cortinarius", "Crow's Eye", "Crystallized Essence", "Cyclops' Eye" +
        "Dark Essence", "Devourer's Blood", "Dog Tallow", "Doppler Mutagen" +
        "Drowner Brain", "Drowner Tongue", "Ducal Water" +
        "Earth Elemental Mutagen", "Ekimmara Hide", "Ekimmara Mutagen" +
        "Ekkidna Mutagen", "Elemental Essence", "Empty Bottle" +
        "Endrega Embryo", "Endrega Heart", "Ergot Seeds", "Erynia Eye" +
        "Essence of Wraith", "Fiend Mutagen", "Fiend's Eye", "Fifth Essence" +
        "Foglet Mutagen", "Foglet Teeth", "Fool's Parsley Leaves" +
        "Forktail Hide", "Forktail Mutagen", "Gargoyle Dust", "Gargoyle Heart" +
        "Ghoul's Blood", "Ginatia Petals", "Golem's Heart", "Grave Hag Mutagen" +
        "Grave Hag's Ear", "Greater Blue Mutagen", "Greater Green Mutagen" +
        "Greater Red Mutagen", "Green Mold", "Griffin Feathers" +
        "Griffin Mutagen", "Griffin's Egg", "Hag Tooth", "Han Fiber" +
        "Harpy Eggs", "Harpy Feathers", "Harpy Talons", "Hellebore Petals" +
        "Homemade Pepper Vodka", "Honeysuckle", "Hop Umbels", "Hornwort" +
        "Katakan Mutagen", "Leshen Mutagen", "Leshen Resin" +
        "Lesser Blue Mutagen", "Lesser Green Mutagen", "Lesser Red Mutagen" +
        "Light Essence", "Lock of Lamia Hair", "Longrube", "Lunar Shards" +
        "Mahakaman Spirit", "Mandrake Cordial", "Mandrake Root", "Mistletoe" +
        "Moleyarrow", "Monster Blood", "Monster Claw", "Monster Dust" +
        "Monster Egg", "Monster Essence", "Monster Feather", "Monster Hair" +
        "Monster Heart", "Monster Hide", "Monster Liver", "Monster Plate" +
        "Monster Saliva", "Monster Tongue", "Monster Tooth", "Necrophage Hide" +
        "Nekker Blood", "Nekker Claw", "Nekker Eye", "Nekker Heart" +
        "Nekker Warrior Mutagen", "Nekker Warrior's Liver", "Nightwraith Hair" +
        "Nightwraith Mutagen", "Nilfgaardian Lemon", "Noonwraith Mutagen" +
        "Nostrix", "Oil", "Optima Mater", "Phosphorus", "Pigskin Puffball" +
        "Potion of Clearance", "Pringrape", "Puffball", "Quicksilver Solution" +
        "Ranogrin", "Redanian Herbal", "Resin", "Ribleaf", "Rotfiend Blood" +
        "Saltpeter", "Sewant Mushrooms", "Specter Dust", "Stammelford's Dust" +
        "Succubus Mutagen", "Sulfur", "Tawny Oil", "Temerian Rye", "Troll Claw" +
        "Troll Hide", "Vampire Fang", "Vampire Saliva", "Venom Extract" +
        "Verbena", "Water Essence", "Water Hag Mutagen", "Water Hag Tooth" +
        "Werewolf Hide", "Werewolf Mutagen", "Werewolf Saliva" +
        "White Myrtle Petals", "Wine Stone", "Wolf's Liver", "Wolfsbane" +
        "Wraith Mutagen", "Wyvern Egg", "Wyvern Hide", "Wyvern Mutagen"
        };
    
    
    // Declare myItems, myRecipes, completedRecipes Array lists.
    public ArrayList<Item> myItems = new ArrayList(); 
    public ArrayList<Recipe> myRecipes = new ArrayList();
    public ArrayList<Recipe> completedRecipes = new ArrayList();
    
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
