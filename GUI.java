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

// Import Java utility scanner Package.
import java.util.*;

// Import Java swing, awt & event packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements
        ActionListener, MouseListener, ItemListener {

    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    
    // DECLARATIONS
    
    // Declare instance of InventoryManager.
    public InventoryManager myInventoryManager;
    
    // Declare major content pane panel.
    public JPanel ContentPanel = new JPanel();  
            
    // Label
        // Declare label.
        JLabel label = new JLabel("The Witcher 3: Wild Hunt Inventory Aid");
       
    // Check boxes

        // Declare check box panel.
        JPanel CheckBoxPanel = new JPanel();
        
        // Declare check box label.
        JLabel CheckBoxLabel = new JLabel("Please choose a task: ");
    
        // Declare check boxes.
        ArrayList<JCheckBox> CheckBoxList = new ArrayList();
        
    // Combo box
        
        // Declare JPanel for combo box.
        JPanel ComboBoxPanel = new JPanel();
   
        // Declare combo box label.
        JLabel ComboBoxLabel = new JLabel("");
        
        // Declare and define itemStrings string array.
        String[] itemStrings = { "See completed recipes.", "See the description of a recipe."};
   
        // Declare itemList, a combo box using the values of itemStrings.
        JComboBox itemList = new JComboBox(itemStrings);
    
    // Results
        // Declare output panel.
        JPanel OutputPanel = new JPanel();
        
        // Declare output label.
        JTextArea outputTextArea = new JTextArea();
        
        // Declare output text area that will contain file reader output.
        static JTextArea outputTextArea2 = new JTextArea();
        
        // Declare public methods to set & get text in public output text area.
        public static void setOutputText(String output) {
            outputTextArea2.setText(output);
        }
        public static void getOutputText() {
            outputTextArea2.getText();
            outputTextArea2.setVisible(true);
        }
    
        // Declare button.
        JButton button = new JButton("SUBMIT");
        
    // Strings and arrays
        // Declare results strings.
        String chosenItems;
        String CheckBoxSelections;
    
        // Declare boolean array myToppings.
        boolean[] mySelections = new boolean[5];
    
    
GUI() {
    
    // Initialize InventoryManager class.
    myInventoryManager = new InventoryManager();
    
    // Set GUI Layout to a flow layout.
    setLayout(new FlowLayout());
        
    // Set the background color to default: white.
    setBackground(Color.white);
    
    // Set GUI title to "Inventory Manager".
    setTitle("Inventory Manager");
    
    // Add content pane panel, ContentPanel.
    add(ContentPanel);
    setContentPane(ContentPanel);
    ContentPanel.setVisible(true);
        
    // Add the label to the GUI.
    ContentPanel.add(label);
    add(label);
        
    // Add check boxes.
        ContentPanel.add(CheckBoxPanel);
        add(CheckBoxPanel);
        CheckBoxPanel.setVisible(true);
        
            //CheckBoxPanel.add(CheckBoxLabel);
            add(CheckBoxLabel);
            
            // Cycle through the list of allRecipes and make a checkbox for each recipe.
                // Create a checkbox for each recipe.
            
                // Declare integer and JCheckBox.
                int i;
                JCheckBox currentCheckBox;
               
                // Create a loop to assign check boxes for each recipe & add 'em.
                for (i = 0; i < myInventoryManager.allRecipes.size(); i++) {
                    Recipe currentRecipe = myInventoryManager.allRecipes.get(i);
                    currentCheckBox = new JCheckBox(currentRecipe.getName());
                    CheckBoxList.add(currentCheckBox);
                    CheckBoxPanel.add(currentCheckBox);
                }                
            
    // Add a combo box to the GUI.
        // Add combo box panel.
        ContentPanel.add(ComboBoxPanel);
        add(ComboBoxPanel);
        ComboBoxPanel.setVisible(true);
        
            // Add combo box label.
            ComboBoxPanel.add(ComboBoxLabel);
            add(ComboBoxLabel);
        
            // Add the itemList combo box to the GUI.
            ComboBoxPanel.add(itemList);
            add(itemList);
            
            // Set properties of itemList combo box: uneditable, white.
            itemList.setEditable(false); // make contents uneditable
            itemList.setSelectedIndex(1); // set to white
            itemList.addActionListener(this); // add an action listener
            itemList.setVisible(true); // set it to visible
        
    // Output
        ContentPanel.add(OutputPanel);
        add(OutputPanel);
        OutputPanel.setVisible(true);
            // Add the "SUBMIT" button.
            OutputPanel.add(button);
            add(button);
            button.addActionListener(this);

            // Add output text area and make it uneditable.
            OutputPanel.add(outputTextArea);
            add(outputTextArea);
            outputTextArea.setEditable(false);
            
            // Add output text area 2 and make it uneditable.
            OutputPanel.add(outputTextArea2);
            add(outputTextArea2);
            outputTextArea2.setEditable(false);
        
    // Pack the GUI elements.
    pack();
        
    // Allow users to exit/close the GUI by the default method.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // Make the GUI visible.
    setSize(400, 500);
    setVisible(true);
    }
    
    // Enable program to sense when users change the state of items.
    @Override
    public void itemStateChanged(ItemEvent i) {
        
        // Find out which items were selected.
        Object selection = i.getItemSelectable();
        
        // What happens when check boxes are deselected.
        if (i.getStateChange() == ItemEvent.DESELECTED) {
            // What to do when each check box is deselected...
        }
    }
    
    // Enable program to sense when users enter the GUI area with a mouse.
    @Override
    public void mouseEntered(MouseEvent m) {
    }
    
    // Enable program to sense when users exit the GUI area with a mouse.
    @Override
    public void mouseExited(MouseEvent m) {
    }

    // Enable program to sense when users click a mouse.
    @Override
    public void mouseClicked(MouseEvent m) {
    }
    
    // Enable program to sense when users press a mouse.
    @Override
    public void mousePressed(MouseEvent m) {
    }

    // Enable program to sense when users release a mouse.
    @Override
    public void mouseReleased(MouseEvent m) {
    }
    
    // Enable program to sense when users press "Order Pizza" button.
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Define objects source & choice based on user input.
        Object source = e.getSource();
        String choice = (String)itemList.getSelectedItem();
        
        // When the " " button is pressed...
        if (source == button) {
            
            // If the combo box selection is "See completed recipes."...
            if ("See completed recipes.".equals(choice)) {
                // Figure out which check box{es} were chosen.
                // Create a loop to assign check boxes for each recipe & add 'em.
                int i;
                for (i = 0; i < CheckBoxList.size(); i++) {
                    JCheckBox currentCheckBox = CheckBoxList.get(i);
                    Recipe myRecipe;
                    myRecipe = myInventoryManager.getRecipeByName(currentCheckBox.getText());
                    if (myRecipe != null) {
                        myRecipe.setHasCompleted(currentCheckBox.isSelected());
                    } else {                        
                    }
                }             
                                  
                setVisible(true);
            
                myInventoryManager.displayCompletedRecipes();
                
            }
            
            // If the combo box selection is "See the description of a recipe."...
            else if ("See the description of a recipe.".equals(choice)) {
                // Figure out which check box{es} were chosen.
                // Create a loop to assign check boxes for each recipe & add 'em.
                int i;
                for (i = 0; i < CheckBoxList.size(); i++) {
                    JCheckBox currentCheckBox = CheckBoxList.get(i);
                    Recipe myRecipe;
                    myRecipe = myInventoryManager.getRecipeByName(currentCheckBox.getText());
                    if (myRecipe != null) {
                        if (currentCheckBox.isSelected()) {
                            // write myRecipe.name
                            setOutputText(myRecipe.getName() + ": " +
                                myRecipe.getDescription());
                            break;
                        }
                    } else {                    
                    }
                }
            }
            
            setVisible(true);        
            
        } // end "if button is pressed..." code section
    } // end action event code section
} // end all code in this Java class   
