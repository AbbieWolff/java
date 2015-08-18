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
    
    public InventoryManager() {
        
        // Declare temporary item.
        Item tempItem;
        
        // Declare all items.
        
        tempItem = new Item("Aether", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Albedo", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alchemists' Powder", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alchemy Paste", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alcohest", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alghoul Bone Marrow", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alghoul Claw", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Alghoul Decoction", "Adrenaline Points are generated more quickly than normal until the first successful enemy attack.");
        allItems.add(tempItem);

        tempItem = new Item("Alghoul Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Allspice", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ancient Leshen Decoction", "Each Sign cast increases Stamina regeneration for the remainder of the fight.");
        allItems.add(tempItem);

        tempItem = new Item("Ancient Leshen Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Arachas Decoction", "Reduces damage received based on armor and inventory weigh: less weight carried and lighter armor means less damage is taken.");
        allItems.add(tempItem);

        tempItem = new Item("Arachas Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Arachas Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Arachas Venom", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Archgriffin Decoction", "If any Stamina is available, strong strikes consume all of it and reduce the struck foe's Vitality by 10% after their normal damage is calculated.");
        allItems.add(tempItem);

        tempItem = new Item("Archgriffin Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Arenaria", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Balisse Fruit", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Basilisk Decoction", "Applies a random beneficial effect at dusk and dawn. The effect lasts for six hours.");
        allItems.add(tempItem);

        tempItem = new Item("Basilisk Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Basilisk Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Basilisk Venom", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Bear Fat", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Bear Pheromones", "Bears will not attack the witcher.");
        allItems.add(tempItem);

        tempItem = new Item("Beast Oil", "10% Attack Power versus Beasts");
        allItems.add(tempItem);

        tempItem = new Item("Beggartick Blossoms", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Berbercane Fruit", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Berserker Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Bison Grass", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Black Blood", "Witcher's blood injures vampires and necrophages when they wound him.");
        allItems.add(tempItem);

        tempItem = new Item("Blizzard", "Slows down time for everyone except witcher for a short period after killing an enemy.");
        allItems.add(tempItem);

        tempItem = new Item("Bloodmoss", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Blowball", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Blowbill", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Bryonia", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Buckthorn", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Calcium Equum", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cat", "Grants sight in total darkness.");
        allItems.add(tempItem);

        tempItem = new Item("Cave Troll Liver", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Celandine", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cherry Cordial", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Chitin Scale", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Chort Decoction", "Provides complete resistance to the Stagger effect and reduces the Knock-down effect to Stagger.");
        allItems.add(tempItem);

        tempItem = new Item("Chort Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Chort Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cockatrice Decoction", "All alchemy creations can be used one additional time.");
        allItems.add(tempItem);

        tempItem = new Item("Cockatrice Egg", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cockatrice Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cockatrice Stomach", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cortinarius", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Crow's Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Crystallized Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Cursed Oil", "10% Attack Power versus Cursed Ones");
        allItems.add(tempItem);

        tempItem = new Item("Cyclops' Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Dark Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Devourer's Blood", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Dog Tallow", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Doppler Decoction", "Increases critical hit damage when attacking from behind.");
        allItems.add(tempItem);

        tempItem = new Item("Doppler Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Draconid Oil", "10% Attack Power versus Draconids");
        allItems.add(tempItem);

        tempItem = new Item("Drowner Brain", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Drowner Pheromones", "Drowners will not attack the witcher.");
        allItems.add(tempItem);

        tempItem = new Item("Drowner Tongue", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ducal Water", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Dwarven Spirit", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Earth Elemental Decoction", "Increases resistance to Vitality-depleting critical effects applied during combat. The resistance level rises the longer the critical effect is applied.");
        allItems.add(tempItem);

        tempItem = new Item("Earth Elemental Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ekhidna Decoction", "Performing actions that consume Stamina regenerates Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Ekimmara Decoction", "Damage dealt to foes regenerates Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Ekimmara Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ekimmara Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ekkidna Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Elementa Oil", "10% Attack Power versus Elementa");
        allItems.add(tempItem);

        tempItem = new Item("Elemental Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Empty Bottle", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Endrega Embryo", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Endrega Heart", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Beast Oil", "25% Attack Power versus Beasts");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Black Blood", "Witcher's blood injures and knocks back vampires and necrophages when they wound him.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Blizzard", "Slows down time for everyone except witcher for a short period after killing an enemy. Great slowdown.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Cat", "Grants sight in total darkness and immunity to hypnosis. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Cursed Oil", "25% Attack Power versus Cursed Ones");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Draconid Oil", "25% Attack Power versus Draconids");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Elementa Oil", "25% Attack Power versus Elementa");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Full Moon", "Increases maximum Vitality. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Golden Oriole", "Grants immunity to poisons, neutralizes the effects of poisons already in bloodstream. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Hanged Man's Venom", "25% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Hybrid Oil", "25% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Insectoid Oil", "25% Attack Power versus Insectoids");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Maribor Forest", "Accelerates the generation of Adrenaline Points. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Necrophage Oil", "25% Attack Power versus Necrophages");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Ogroid Oil", "25% Attack Power versus Ogroids");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Petri's Philter", "Increases Sign Intensity. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Relict Oil", "25% Attack Power versus Relicts");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Specter Oil", "25% Attack Power versus Specters");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Swallow", "Accelerates Vitality regeneration. Extended duration. Vitality regeneration pauses for 2 seconds upon receiving damage.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Tawny Owl", "Accelerates Stamina regeneration. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Thunderbolt", "Increases Attack Power. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced Vampire Oil", "25% Attack Power versus Vampires");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced White Honey", "Clears Toxicity and cances all active potion effects.");
        allItems.add(tempItem);

        tempItem = new Item("Enhanced White Rafford's Decoction", "Immediately restores a large portion of Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Ergot Seeds", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Erynia Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Essence of Wraith", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Fiend Decoction", "Increases the amount of weight the witcher can carry without being overburdened.");
        allItems.add(tempItem);

        tempItem = new Item("Fiend Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Fiend's Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Fifth Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Foglet Decoction", "Increases Sign Intensity during cloudy weather.");
        allItems.add(tempItem);

        tempItem = new Item("Foglet Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Foglet Teeth", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Fool's Parsley Leaves", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Forktail Decoction", "Combining fast and strong attacks with Sign abilities increases Attack Power for melee attacks and Sign Intensity while casting.");
        allItems.add(tempItem);

        tempItem = new Item("Forktail Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Forktail Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Full Moon", "Increases maximum Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Gargoyle Dust", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Gargoyle Heart", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ghoul's Blood", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ginatia Petals", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Golden Oriole", "Grants immunity to poisons, neutralizes the effects of poisons already in bloodstream.");
        allItems.add(tempItem);

        tempItem = new Item("Golem's Heart", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Grave Hag Decoction", "Each foe slain accelerates Vitality regeneration for the duration of the battle.");
        allItems.add(tempItem);

        tempItem = new Item("Grave Hag Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Grave Hag's Ear", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Greater Blue Mutagen", "Provides the largest boost to Sign Intensity.");
        allItems.add(tempItem);

        tempItem = new Item("Greater Green Mutagen", "Provides the largest boost to Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Greater Red Mutagen", "Provides the largest boost to Attack Power.");
        allItems.add(tempItem);

        tempItem = new Item("Green Mold", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Griffin Decoction", "Taking damage raises damage resistance (up to an upper limit) for the remainder of the fight.");
        allItems.add(tempItem);

        tempItem = new Item("Griffin Feathers", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Griffin Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Griffin's Egg", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hag Tooth", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Han Fiber", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hanged Man's Venom", "10% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Harpy Eggs", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Harpy Feathers", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Harpy Talons", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hellebore Petals", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Homemade Pepper Vodka", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Honeysuckle", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hop Umbels", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hornwort", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Hybrid Oil", "10% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Hydragenum", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Insectoid Oil", "10% Attack Power versus Insectoids");
        allItems.add(tempItem);

        tempItem = new Item("Katakan Decoction", "Increases critical hit chance.");
        allItems.add(tempItem);

        tempItem = new Item("Katakan Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Killer Whale", "Increases breath supply while underwater by 50% and improves vision while diving.");
        allItems.add(tempItem);

        tempItem = new Item("Leshen Decoction", "A portion of the damage dealt by enemies is reflected back on the attacker.");
        allItems.add(tempItem);

        tempItem = new Item("Leshen Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Leshen Resin", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Lesser Blue Mutagen", "Provides a boost to Sign Intensity.");
        allItems.add(tempItem);

        tempItem = new Item("Lesser Green Mutagen", "Provides a boost to Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Lesser Red Mutagen", "Provides a boost to Attack Power.");
        allItems.add(tempItem);

        tempItem = new Item("Light Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Lock of Lamia Hair", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Longrube", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Lunar Shards", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Mahakaman Spirit", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Mandrake Cordial", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Mandrake Root", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Maribor Forest", "Accelerates the generation of Adrenaline Points.");
        allItems.add(tempItem);

        tempItem = new Item("Mistletoe", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Moleyarrow", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Blood", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Claw", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Dust", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Egg", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Feather", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Hair", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Heart", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Liver", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Plate", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Saliva", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Tongue", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Monster Tooth", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Necrophage Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Necrophage Oil", "10% Attack Power versus Necrophages");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Blood", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Claw", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Eye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Heart", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Pheromones", "Nekkers will not attack the witcher.");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Warrior Decoction", "Mounts never panic. 50% increase to mounted combat damage.");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Warrior Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nekker Warrior's Liver", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nightwraith Decoction", "Geralt's maximum Vitality is increased with each foe killed. This increase lasts until he meditates or fast travels.");
        allItems.add(tempItem);

        tempItem = new Item("Nightwraith Hair", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nightwraith Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nigredo", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nilfgaardian Lemon", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Noonwraith Decoction", "Provides complete immunity to the Knockdown, Hypnosis, Stun and Blindness effects.");
        allItems.add(tempItem);

        tempItem = new Item("Noonwraith Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Nostrix", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ogroid Oil", "10% Attack Power versus Ogroids");
        allItems.add(tempItem);

        tempItem = new Item("Oil", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Optima Mater", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Petri's Philter", "Increases Sign Intensity.");
        allItems.add(tempItem);

        tempItem = new Item("Phosphorus", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Pigskin Puffball", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Pop's Mold Antidote", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Potion of Clearance", "Returns all spent Ability Points to the available pool so that you can redistribute them. Cannot be brewed. Purchased only from specific vendors for a high price.");
        allItems.add(tempItem);

        tempItem = new Item("Pringrape", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Puffball", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Quebrith", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Quicksilver Solution", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ranogrin", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Rebis", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Redanian Herbal", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Relict Oil", "10% Attack Power versus Relicts");
        allItems.add(tempItem);

        tempItem = new Item("Reliever's Decoction", "Increases damage dealt and decreases damage taken against wraiths.");
        allItems.add(tempItem);

        tempItem = new Item("Resin", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Ribleaf", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Rotfiend Blood", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Rubedo", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Saltpeter", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Sewant Mushrooms", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Specter Dust", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Specter Oil", "10% Attack Power versus Specters");
        allItems.add(tempItem);

        tempItem = new Item("Stammelford's Dust", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Succubus Decoction", "Attack Power grows over the course of a fight until reaching a maximum threshold.");
        allItems.add(tempItem);

        tempItem = new Item("Succubus Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Sulfur", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Superior Beast Oil", "50% Attack Power versus Beasts");
        allItems.add(tempItem);

        tempItem = new Item("Superior Black Blood", "Vampires and necrophages start Bleeding when near the witcher. In addition, the witcher's blood injures and knocks them back when they wound him.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Blizzard", "Slows down time for everyone except witcher for a short period after killing an enemy. Great slowdown. Also, with 3 Adrenaline points, actions don't cost any stamina.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Cat", "Grants sight in total darkness and immunity to hypnosis. Extended duration.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Cursed Oil", "50% Attack Power versus Cursed Ones");
        allItems.add(tempItem);

        tempItem = new Item("Superior Draconid Oil", "50% Attack Power versus Draconids");
        allItems.add(tempItem);

        tempItem = new Item("Superior Elementa Oil", "50% Attack Power versus Elementa");
        allItems.add(tempItem);

        tempItem = new Item("Superior Full Moon", "Increases maximum Vitality. Extended duration. Heals Vitality by an amount equal to current Toxicity.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Golden Oriole", "Neutralizes the effects of poisons already in the bloodstream. Extended duration. Poisons now heal instead of doing damage.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Hanged Man's Venom", "50% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Superior Hybrid Oil", "50% Attack Power versus humans and nonhumans");
        allItems.add(tempItem);

        tempItem = new Item("Superior Insectoid Oil", "50% Attack Power versus Insectoids");
        allItems.add(tempItem);

        tempItem = new Item("Superior Maribor Forest", "Accelerates the generation of Adrenaline Points. Extended duration. Grants 1 Adrenaline Point upon consumption.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Necrophage Oil", "50% Attack Power verus Necrophages");
        allItems.add(tempItem);

        tempItem = new Item("Superior Ogroid Oil", "50% Attack Power versus Ogroids");
        allItems.add(tempItem);

        tempItem = new Item("Superior Petri's Philter", "Increases Sign Intensity. Extended duration. Signs always apply their special effects.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Relict Oil", "50% Attack Power versus Relicts");
        allItems.add(tempItem);

        tempItem = new Item("Superior Specter Oil", "50% Attack Power versus Specters");
        allItems.add(tempItem);

        tempItem = new Item("Superior Swallow", "Accelerates Vitality regeneration. Extended duration. Regeneration works in and out of combat for all levels of the potion.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Tawny Owl", "Accelerates Stamina regeneration. Extended duration. Never expires at night.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Thunderbolt", "Extended duration. Grants 100% critical hit chance during storms.");
        allItems.add(tempItem);

        tempItem = new Item("Superior Vampire Oil", "50% Attack Power versus Vampires");
        allItems.add(tempItem);

        tempItem = new Item("Superior White Honey", "Clears Toxicity and cances all active potion effects.");
        allItems.add(tempItem);

        tempItem = new Item("Superior White Rafford's Decoction", "Restores Vitality immediately and fully. Grants immunity to damage for a short duration.");
        allItems.add(tempItem);

        tempItem = new Item("Swallow", "Accelerates Vitality regeneration. Vitality regeneration pauses for 2 seconds upon receiving damage.");
        allItems.add(tempItem);

        tempItem = new Item("Tawny Oil", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Tawny Owl", "Accelerates Stamina regeneration.");
        allItems.add(tempItem);

        tempItem = new Item("Temerian Rye", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Thunderbolt", "Increases Attack Power.");
        allItems.add(tempItem);

        tempItem = new Item("Troll Claw", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Troll Decoction", "Regenerates Vitality during and outside of combat.");
        allItems.add(tempItem);

        tempItem = new Item("Troll Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Vampire Fang", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Vampire Oil", "10% Attack Power versus Vampires");
        allItems.add(tempItem);

        tempItem = new Item("Vampire Saliva", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Venom Extract", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Verbena", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Vermilion", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Vitriol", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Water Essence", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Water Hag Decoction", "Damage dealt is increased when Vitality is at its maximum.");
        allItems.add(tempItem);

        tempItem = new Item("Water Hag Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Water Hag Tooth", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Werewolf Decoction", "Running, sprinting and jumping outside combat does not use Stamina.");
        allItems.add(tempItem);

        tempItem = new Item("Werewolf Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Werewolf Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Werewolf Saliva", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("White Gull", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("White Honey", "Clears Toxicity and cances all active potion effects.");
        allItems.add(tempItem);

        tempItem = new Item("White Myrtle Petals", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("White Raffard's Decoction", "Immediately restores a portion of Vitality.");
        allItems.add(tempItem);

        tempItem = new Item("Wine Stone", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wolf's Liver", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wolfsbane", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wraith Decoction", "Whenever a single hit drains more than a third of Vitality, a Quen shield is activated which protects against the next attack.");
        allItems.add(tempItem);

        tempItem = new Item("Wraith Mutagen", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wyvern Decoction", "Each blow landed increases Attack Power until either the fight ends or damage (other than that from potion Toxicity) is taken.");
        allItems.add(tempItem);

        tempItem = new Item("Wyvern Egg", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wyvern Hide", "No Description");
        allItems.add(tempItem);

        tempItem = new Item("Wyvern Mutagen", "No Description");
        allItems.add(tempItem);
        
        // Declare temporary recipe, ingredients and result.
        Recipe tempRecipe;
        ArrayList<ItemWithQuantity> tempIngredients; 
        Item tempResult;
        
        // Define temporary result, ingredients and recipe for each recipe by name.
        tempResult = getItemByName("Ancient Leshen Decoction");
        tempIngredients = new ArrayList();
        tempIngredients.add(new ItemWithQuantity(1, getItemByName("Dwarven Spirit")));
        tempIngredients.add(new ItemWithQuantity(1, getItemByName("Ancient Leshen Mutagen")));
        tempIngredients.add(new ItemWithQuantity(1, getItemByName("Mandrake Root")));
        tempIngredients.add(new ItemWithQuantity(1, getItemByName("Ginatia Petals")));
        tempIngredients.add(new ItemWithQuantity(1, getItemByName("Honeysuckle")));
        tempRecipe = new Recipe(tempResult, tempIngredients, false);
        allRecipes.add(tempRecipe);
        
        // ADD ALL RECIPES WITH ALL INGREDIENTS HERE
        
    }
    
    // Declare chosenItem and chosenItemDescription strings.
    public String chosenItem;
    public String chosenItemDescription;
    
    // Declare chosenRecipe and ChosenRecipeDescription strings.
    public String chosenRecipe;
    public String chosenRecipeDescription;
    
    // Declare allItems and allRecipes Array lists.
    public ArrayList<Item> allItems = new ArrayList();
    public ArrayList<Recipe> allRecipes = new ArrayList();
    
    /*
    // Declare my items, my recipes strings.
    public String myItemsString;
        //myItemsString = toString(myItems);
    public String myRecipesString;
        //myRecipesString = toString(myRecipes);
    */
        
    // Declare a method to get items by name.     
    public Item getItemByName(String name) {
        
        // Declare int i.
        int i;
        
        // Search allItems to find the currently selected item by name.
        for (i = 0; i < allItems.size(); i++) {
            Item currentItem = allItems.get(i);
                if (currentItem.name == name) {
                    // Return Item from allItems with name matching given name.
                    return currentItem;
                }
        }
        
        // If no item was found, return null.
        return null;
    }
    
    /*
    // Check if getItemByName fails to find a result, then do something.
    Item foundItem = myInventoryManager.getItemByName("poopy item");
    if (foundItem != null) {
        //do something
    }
    else ( 
        // fail 
    }
    */
    
   
    // Declare a method to get recipes by name.
    public Recipe getRecipeByName(String name) {
        // Declare int i.
        int i;
        
        // Search allRecipes to find the currently selected item by name.
        for (i = 0; i < allRecipes.size(); i++) {
            Recipe currentRecipe = allRecipes.get(i);
                if (currentRecipe.getName() == name) {
                    // Return Recipe from allRecipes with name matching given name.
                    return currentRecipe;
                }
        }
        
        // If no recipe was found, return null.
        return null;
    }
    
    // Declare a method to set completed recipes.
    public ArrayList<Recipe> getCompletedRecipes() {
    // Declare list & string of completed recipes.
        ArrayList<Recipe> completedRecipes = new ArrayList();
        
        // Declare int i.
        int i;
        
        // Search allRecipes to find the currently selected item by name.
        for (i = 0; i < allRecipes.size(); i++) {
            Recipe currentRecipe = allRecipes.get(i);
                if (currentRecipe.hasCompleted) {
                    // Return Recipe from allRecipes with name matching given name.
                    completedRecipes.add(currentRecipe);
                }
        }
        
        return completedRecipes;
    }
    
    // Declare a method to display completed recipes.
    public void displayCompletedRecipes () {
        
        // Declare list & string of completed recipes.
        ArrayList<Recipe> completedRecipes = getCompletedRecipes();
        String completedRecipesString;
        
        // Declare int i.
        int i;
        
        // Initialize completedrecipesString.
        completedRecipesString = "";
        
        // Search completedRecipes to convert to a series of strings (to print).
        for (i = 0; i < completedRecipes.size(); i++) {
            Recipe currentRecipe = completedRecipes.get(i);
                completedRecipesString = completedRecipesString + " " +
                    currentRecipe.getName() + ", ";
        }         
        
        // Print completedRecipes.
        GUI.setOutputText("\nThe recipes you have already completed include: " +
            completedRecipesString + ".");
        GUI.getOutputText();
    }
    
    /*
    // Declare a method to display all item ingredients in incomplete recipes.
    public void displayItems (String[] neededItems) {
        // work on this...
        
        // Print myItems.
        System.out.println("\nThe items you still need include: " + myItemsString);
    }
    */
    
    // Declare a method to display a recipe description.
    public void displayRecipeDescription (String recipeDescription) {
        // work on this...
        
        // Print chosenRecipe and corresponding description.
        System.out.println("\nThe description for " + chosenRecipe + " is: " + 
                chosenRecipeDescription);
    }  

}
