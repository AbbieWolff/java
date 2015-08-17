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
    
    Item AlchemistsPowder;
    AlchemistsPowder = new Item;
    AlchemistsPowder.name("Alchemists' Powder");
    
    Item AlchemyPaste;
    AlchemyPaste = new Item;
    AlchemyPaste.name("Alchemy Paste");
    
    Item AlghoulBoneMarrow;
    AlghoulBoneMarrow = new Item;
    AlghoulBoneMarrow.name("Alghoul Bone Marrow");
    
    Item AlghoulClaw;
    AlghoulClaw = new Item;
    AlghoulClaw.name("Alghoul Claw");
    
    Item AlghoulMutagen;
    AlghoulMutagen = new Item;
    AlghoulMutagen.name("Alghoul Mutagen");
    
    Item Allspice;
    Allspice = new Item;
    Allspice.name("Allspice");
    
    Item AncientLeshenMutagen;
    AncientLeshenMutagen = new Item;
    AncientLeshenMutagen.name("Ancient Leshen Mutagen");
    
    Item ArachasEye;
    ArachasEye = new Item;
    ArachasEye.name("Arachas Eye");
    
    Item ArachasMutagen;
    ArachasMutagen = new Item;
    ArachasMutagen.name("Arachas Mutagen");
    
    Item ArachasVenom;
    ArachasVenom = new Item;
    ArachasVenom.name("Arachas Venom");
    
    Item ArchgriffinMutagen;
    ArchgriffinMutagen = new Item;
    ArchgriffinMutagen.name("Archgriffin Mutagen");
    
    Item Arenaria;
    Arenaria = new Item;
    Arenaria.name("Arenaria");
    
    Item BalisseFruit;
    BalisseFruit = new Item;
    BalisseFruit.name("Balisse Fruit");
    
    Item BasiliskHide;
    BasiliskHide = new Item;
    BasiliskHide.name("Basilisk Hide");
    
    Item BasiliskMutagen;
    BasiliskMutagen = new Item;
    BasiliskMutagen.name("Basilisk Mutagen");
    
    Item BasiliskVenom;
    BasiliskVenom = new Item;
    BasiliskVenom.name("Basilisk Venom");
    
    Item BearFat;
    BearFat = new Item;
    BearFat.name("Bear Fat");
    
    Item BeggartickBlossoms;
    BeggartickBlossoms = new Item;
    BeggartickBlossoms.name("Beggartick Blossoms");
    
    Item BerbercaneFruit;
    BerbercaneFruit = new Item;
    BerbercaneFruit.name("Berbercane Fruit");
    
    Item BerserkerHide;
    BerserkerHide = new Item;
    BerserkerHide.name("Berskerker Hide");
    
    Item BisonGrass;
    BisonGrass = new Item;
    BisonGrass.name("Bison Grass");
    
    Item Bloodmoss;
    Bloodmoss = new Item;
    Bloodmoss.name("Bloodmoss");
    
    Item Blowball;
    Blowball = new Item;
    Blowball.name("Blowball");
    
    Item Bryonia;
    Bryonia = new Item;
    Bryonia.name("Bryonia");
    
    Item Buckthorn;
    Buckthorn = new Item;
    Buckthorn.name("Buckthorn");
    
    Item CalciumEquum;
    CalciumEquum = new Item;
    CalciumEquum.name("Calcium Equum");
    
    Item CaveTrollLiver;
    CaveTrollLiver = new Item;
    CaveTrollLiver.name("Cave Troll Liver");
    
    Item Celandine;
    Celandine = new Item;
    Celandine.name("Celandine");
    
    Item CherryCordial;
    CherryCordial = new Item;
    CherryCordial.name("Cherry Cordial");
    
    Item ChitinScale;
    ChitinScale = new Item;
    ChitinScale.name("Chitin Scale");
    
    Item ChortHide;
    ChortHide = new Item;
    ChortHide.name("Chort Hide");
    
    Item ChortMutagen;
    ChortMutagen = new Item;
    ChortMutagen.name("Chort Mutagen");
    
    Item CockatriceEgg;
    CockatriceEgg = new Item;
    CockatriceEgg.name("Cockatrice Egg");
    
    Item CockatriceMutagen;
    CockatriceMutagen = new Item;
    CockatriceMutagen.name("Cockatrice Mutagen");
    
    Item CockatriceStomach;
    CockatriceStomach = new Item;
    CockatriceStomach.name("Cockatrice Stomach");
    
    Item Cortinarius;
    Cortinarius = new Item;
    Cortinarius.name("Cortinarius");
    
    Item CrowsEye;
    CrowsEye = new Item;
    CrowsEye.name("Crow's Eye");
    
    Item CrystallizedEssence;
    CrystallizedEssence = new Item;
    CrystallizedEssence.name("Crystallized Essence");
    
    Item CyclopsEye;
    CyclopsEye = new Item;
    CyclopsEye.name("Cyclops' Eye");
    
    Item DarkEssence;
    DarkEssence = new Item;
    DarkEssence.name("Dark Essence");
    
    Item DevourersBlood;
    DevourersBlood = new Item;
    DevourersBlood.name("Devourer's Blood");
    
    Item DogTallow;
    DogTallow = new Item;
    DogTallow.name("Dog Tallow");
    
    Item DopplerMutagen;
    DopplerMutagen = new Item;
    DopplerMutagen.name("Doppler Mutagen");
    
    Item DrownerBrain;
    DrownerBrain = new Item;
    DrownerBrain.name("Drowner Brain");
    
    Item DrownerTongue;
    DrownerTongue = new Item;
    DrownerTongue.name("Drowner Tongue");
    
    Item DucalWater;
    DucalWater = new Item;
    DucalWater.name("Ducal Water");
    
    Item EarthElementalMutagen;
    EarthElementalMutagen = new Item;
    EarthElementalMutagen.name("Earth Elemental Mutagen");
    
    Item EkimmaraHide;
    EkimmaraHide = new Item;
    EkimmaraHide.name("Ekimmara Hide");
    
    Item EkimmaraMutagen;
    EkimmaraMutagen = new Item;
    EkimmaraMutagen.name("Ekimmara Mutagen");
    
    Item EkkidnaMutagen;
    EkkidnaMutagen = new Item;
    EkkidnaMutagen.name("Ekkidna Mutagen");
    
    Item ElementalEssence;
    ElementalEssence = new Item;
    ElementalEssence.name("Elemental Essence");
    
    Item EmptyBottle;
    EmptyBottle = new Item;
    EmptyBottle.name("Empty Bottle");
    
    Item EndregaEmbryo;
    EndregaEmbryo = new Item;
    EndregaEmbryo.name("Endrega Embryo");
    
    Item EndregaHeart;
    EndregaHeart = new Item;
    EndregaHeart.name("Endrega Heart");
    
    Item ErgotSeeds;
    ErgotSeeds = new Item;
    ErgotSeeds.name("Ergot Seeds");
    
    Item EryniaEye;
    EryniaEye = new Item;
    EryniaEye.name("Erynia Eye");
    
    Item EssenceOfWraith;
    EssenceOfWraith = new Item;
    EssenceofWraith.name("Essence of Wraith");
    
    Item FiendMutagen;
    FiendMutagen = new Item;
    FiendMutagen.name("Fiend Mutagen");
    
    Item FiendsEye;
    FiendsEye = new Item;
    FiendsEye.name("Fiend's Eye");
    
    Item FifthEssence;
    FifthEssence = new Item;
    FifthEssence.name("Fifth Essence");
    
    Item FogletMutagen;
    FogletMutagen = new Item;
    FogletMutagen.name("Foglet Mutagen");
    
    Item FogletTeeth;
    FogletTeeth = new Item;
    FogletTeeth.name("Foglet Teeth");
    
    Item FoolsParsleyLeaves;
    FoolsParsleyLeaves = new Item;
    FoolsParsleyLeaves.name("Fool's Parsley Leaves");
    
    Item ForktailHide;
    ForktailHide = new Item;
    ForktailHide.name("Forktail Hide");
    
    Item ForktailMutagen;
    ForktailMutagen = new Item;
    ForktailMutagen.name("Forktail Mutagen");
    
    Item GargoyleDust;
    GargoyleDust = new Item;
    GargoyleDust.name("Gargoyle Dust");
    
    Item GargoyleHeart;
    GargoyleHeart = new Item;
    GargoyleHeart.name("Gargoyle Heart");
    
    Item GhoulsBlood;
    GhoulsBlood = new Item;
    GhoulsBlood.name("Ghoul's Blood");
    
    Item GinatiaPetals;
    GinatiaPetals = new Item;
    GinatiaPetals.name("Ginatia Petals");
    
    Item GolemsHeart;
    GolemsHeart = new Item;
    GolemsHeart.name("Golem's Heart");
    
    Item GraveHagMutagen;
    GraveHagMutagen = new Item;
    GraveHagMutagen.name("Grave Hag Mutagen");
    
    Item GraveHagsEar;
    GraveHagsEar = new Item;
    GraveHagsEar.name("Grave Hag's Ear");
    
    Item GreaterBlueMutagen;
    GreaterBlueMutagen = new Item;
    GreaterBlueMutagen.name("Greater Blue Mutagen");
    
    Item GreaterGreenMutagen;
    GreaterGreenMutagen = new Item;
    GreaterGreenMutagen.name("Greater Green Mutagen");
    
    Item GreaterRedMutagen;
    GreaterRedMutagen = new Item;
    GreaterRedMutagen.name("Greater Red Mutagen");
    
    Item GreenMold;
    GreenMold = new Item;
    GreenMold.name("Green Mold");
    
    Item GriffinFeathers;
    GriffinFeathers = new Item;
    GriffinFeathers.name("Griffin Feathers");
    
    Item GriffinMutagen;
    GriffinMutagen = new Item;
    GriffinMutagen.name("Griffin Mutagen");
        
    Item GriffinsEgg;
    GriffinsEgg = new Item;
    GriffinsEgg.name("Griffin's Egg");
    
    Item HagTooth;
    HagTooth = new Item;
    HagTooth.name("Hag Tooth");
    
    Item HanFiber;
    HanFiber = new Item;
    HanFiber.name("Han Fiber");
    
    Item HarpyEggs;
    HarpyEggs = new Item;
    HarpyEggs.name("Harpy Eggs");
    
    Item HarpyFeathers;
    HarpyFeathers = new Item;
    HarpyFeathers.name("Harpy Feathers");
    
    Item HarpyTalons;
    HarpyTalons = new Item;
    HarpyTalons.name("Harpy Talons");
    
    Item HelleborePetals;
    HelleborePetals = new Item;
    HelleborePetals.name("Hellebore Petals");
    
    Item HomemadePepperVodka;
    HomemadePepperVodka = new Item;
    HomemadePepperVodka.name("Homemade Pepper Vodka");
    
    Item Honeysuckle;
    Honeysuckle = new Item;
    Honeysuckle.name("Honeysuckle");
    
    Item HopUmbels;
    HopUmbels = new Item;
    HopUmbels.name("Hop Umbels");
    
    Item Hornwort;
    Hornwort = new Item;
    Hornwort.name("Hornwort");
    
    Item KatakanMutagen;
    KatakanMutagen = new Item;
    KatakanMutagen.name("Katakan Mutagen");
    
    Item LeshenMutagen;
    LeshenMutagen = new Item;
    LeshenMutagen.name("Leshen Mutagen");
    
    Item LeshenResin;
    LeshenResin = new Item;
    LeshenResin.name("Leshen Resin");
    
    Item LesserBlueMutagen;
    LesserBlueMutagen = new Item;
    LesserBlueMutagen.name("Lesser Blue Mutagen");
    
    Item LesserGreenMutagen;
    LesserGreenMutagen = new Item;
    LesserGreenMutagen.name("Lesser Green Mutagen");
    
    Item LesserRedMutagen;
    LesserRedMutagen = new Item;
    LesserRedMutagen.name("Lesser Red Mutagen");
    
    Item LightEssence;
    LightEssence = new Item;
    LightEssence.name("Light Essence");
    
    Item LockOfLamiaHair;
    LockOfLamiaHair = new Item;
    LockOfLamiaHair.name("Lock of Lamia Hair");
    
    Item Longrube;
    Longrube = new Item;
    Longrube.name("Longrube");
    
    Item LunarShards;
    LunarShards = new Item;
    LunarShards.name("Lunar Shards");
    
    Item MahakamanSpirit;
    MahakamanSpirit = new Item;
    MahakamanSpirit.name("Mahakaman Spirit");
    
    Item MandrakeCordial;
    MandrakeCordial = new Item;
    MandrakeCordial.name("Mandrake Cordial");
    
    Item MandrakeRoot;
    MandrakeRoot = new Item;
    MandrakeRoot.name("Mandrake Root");
    
    Item Mistletoe;
    Mistletoe = new Item;
    Mistletoe.name("Mistletoe");
    
    Item Moleyarrow;
    Moleyarrow = new Item;
    Moleyarrow.name("Moleyarrow");
    
    Item MonsterBlood;
    MonsterBlood = new Item;
    MonsterBlood.name("Monster Blood");
    
    Item MonsterClaw;
    MonsterClaw = new Item;
    MonsterClaw.name("Monster Claw");
    
    Item MonsterDust;
    MonsterDust = new Item;
    MonsterDust.name("Monster Dust");
    
    Item MonsterEgg;
    MonsterEgg = new Item;
    MonsterEgg.name("Monster Egg");
    
    Item MonsterEssence;
    MonsterEssence = new Item;
    MonsterEssence.name("Monster Essence");
    
    Item MonsterFeather;
    MonsterFeather = new Item;
    MonsterFeather.name("Monster Feather");
    
    Item MonsterHair;
    MonsterHair = new Item;
    MonsterHair.name("Monster Hair");
    
    Item MonsterHeart;
    MonsterHeart = new Item;
    MonsterHeart.name("Monster Heart");
    
    Item MonsterHide;
    MonsterHide = new Item;
    MonsterHide.name("Monster Hide");
    
    Item MonsterLiver;
    MonsterLiver = new Item;
    MonsterLiver.name("Monster Liver");
    
    Item MonsterPlate;
    MonsterPlate = new Item;
    MonsterPlate.name("Monster Plate");
    
    Item MonsterSaliva;
    MonsterSaliva = new Item;
    MonsterSaliva.name("Monster Saliva");
    
    Item MonsterTongue;
    MonsterTongue = new Item;
    MonsterTongue.name("Monster Tongue");
    
    Item MonsterTooth;
    MonsterTooth = new Item;
    MonsterTooth.name("Monster Tooth");
    
    Item NecrophageHide;
    NecrophageHide = new Item;
    NecrophageHide.name("Necrophage Hide");
    
    Item NekkerBlood;
    NekkerBlood = new Item;
    NekkerBlood.name("Nekker Blood");
    
    Item NekkerClaw;
    NekkerClaw = new Item;
    NekkerClaw.name("Nekker Claw");
    
    Item NekkerEye;
    NekkerEye = new Item;
    NekkerEye.name("Nekker Eye");
    
    Item NekkerHeart;
    NekkerHeart = new Item;
    NekkerHeart.name("Nekker Heart");
    
    Item NekkerWarriorMutagen;
    NekkerWarriorMutagen = new Item;
    NekkerWarriorMutagen.name("Nekker Warrior Mutagen");
    
    Item NekkerWarriorMutagen;
    NekkerWarriorMutagen = new Item;
    NekkerWarriorMutagen.name("Nekker Warrior Mutagen");
    
    Item NekkerWarriorsLiver;
    NekkerWarriorsLiver = new Item;
    NekkerWarriorsLiver.name("Nekker Warrior's Liver");
    
    Item NightwraithHair;
    NightwraithHair = new Item;
    NightwraithHair.name("Nightwraith Hair");
    
    Item NightwraithMutagen;
    NightwraithMutagen = new Item;
    NightwraithMutagen.name("Nightwraith Mutagen");
    
    Item NilfgaardianLemon;
    NilfgaardianLemon = new Item;
    NilfgaardianLemon.name("Nilfgaardian Lemon");
    
    Item NoonwraithMutagen;
    NoonwraithMutagen = new Item;
    NoonwraithMutagen.name("Noonwraith Mutagen");
    
    Item Nostrix;
    Nostrix = new Item;
    Nostrix.name("Nostrix");
    
    Item Oil;
    Oil = new Item;
    Oil.name("Oil");
    
    Item OptimaMater;
    OptimaMater = new Item;
    OptimaMater.name("Optima Mater");
    
    Item Phosphorus;
    Phosphorus = new Item;
    Phosphorus.name("Phosphorus");
    
    Item PigskinPuffball;
    PigskinPuffball = new Item;
    PigskinPuffball.name("Pigskin Puffball");
    
    Item PotionOfClearance;
    PotionOfClearance = new Item;
    PotionOfClearance.name("Potion of Clearance");
    
    Item Pringrape;
    Pringrape = new Item;
    Pringrape.name("Pringrape");
    
    Item Puffball;
    Puffball = new Item;
    Puffball.name("Puffball");
    
    Item QuicksilverSolution;
    QuicksilverSolution = new Item;
    QuicksilverSolution.name("Quicksilver Solution");
    
    Item Ranogrin;
    Ranogrin = new Item;
    Ranogrin.name("Ranogrin");
    
    Item RedanianHerbal;
    RedanianHerbal = new Item;
    RedanianHerbal.name("RedanianHerbal");
    
    Item Resin;
    Resin = new Item;
    Resin.name("Resin");
    
    Item Ribleaf;
    Ribleaf = new Item;
    Ribleaf.name("Ribleaf");
    
    Item RotfiendBlood;
    RotfiendBlood = new Item;
    RotfiendBlood.name("Rotfiend Blood");
    
    Item Saltpeter;
    Saltpeter = new Item;
    Saltpeter.name("Saltpeter");
    
    Item SewantMushrooms;
    SewantMushrooms = new Item;
    SewantMushrooms.name("Sewant Mushrooms");
    
    Item SpecterDust;
    SpecterDust = new Item;
    SpecterDust.name("Specter Dust");
    
    Item StammelfordsDust;
    StammelfordsDust = new Item;
    StammelfordsDust.name("Stammelford's Dust");
    
    Item SuccubusMutagen;
    SuccubusMutagen = new Item;
    SuccubusMutagen.name("Succubus Mutagen");
    
    Item Sulfur;
    Sulfur = new Item;
    Sulfur.name("Sulfur");
    
    Item TawnyOil;
    TawnyOil = new Item;
    TawnyOil.name("Tawny Oil");
    
    Item TemerianRye;
    TemerianRye = new Item;
    TemerianRye.name("Temerian Rye");
    
    Item TrollClaw;
    TrollClaw = new Item;
    TrollClaw.name("Troll Claw");
    
    Item TrollHide;
    TrollHide = new Item;
    TrollHide.name("Troll Hide");
    
    Item VampireFang;
    VampireFang = new Item;
    VampireFang.name("Vampire Fang");
    
    Item VampireSaliva;
    VampireSaliva = new Item;
    VampireSaliva.name("Vampire Saliva");
    
    Item VenomExtract;
    VenomExtract = new Item;
    VenomExtract.name("Venom Extract");
    
    Item Verbena;
    Verbena = new Item;
    Verbena.name("Verbena");
    
    Item WaterEssence;
    WaterEssence = new Item;
    WaterEssence.name("Water Essence");
    
    Item WaterHagMutagen;
    WaterHagMutagen = new Item;
    WaterHagMutagen.name("Water Hag Mutagen");
    
    Item WaterHagTooth;
    WaterHagTooth = new Item;
    WaterHagTooth.name("Water Hag Tooth");
    
    Item WerewolfHide;
    WerewolfHide = new Item;
    WerewolfHide.name("Werewolf Hide");
    
    Item WerewolfMutagen;
    WerewolfMutagen = new Item;
    WerewolfMutagen.name("Werewolf Mutagen");
    
    Item WerewolfSaliva;
    WerewolfSaliva = new Item;
    WerewolfSaliva.name("Werewolf Saliva");
    
    Item WhiteMyrtlePetals;
    WhiteMyrtlePetals = new Item;
    WhiteMyrtlePetals.name("White Myrtle Petals");
    
    Item WineStone;
    WineStone = new Item;
    WineStone.name("Wine Stone");
    
    Item WolfsLiver;
    WolfsLiver = new Item;
    WolfsLiver.name("Wolf's Liver");
    
    Item Wolfsbane;
    Wolfsbane = new Item;
    Wolfsbane.name("Wolfsbane");
    
    Item WraithMutagen;
    WraithMutagen = new Item;
    WraithMutagen.name("Wraith Mutagen");
    
    Item WyvernEgg;
    WyvernEgg = new Item;
    WyvernEgg.name("name");
    
    Item WyvernHide;
    WyvernHide = new Item;
    WyvernHide.name("Wyvern Hide");
    
    Item WyvernMutagen;
    WyvernMutagen = new Item;
    WyvernMutagen.name("Wyvern Mutagen");
    
    /*
    Item name;
    name = new Item;
    name.name("name");
    */
    
    
    
    
    
    
}
