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

// Import Java Utility Scanner Package.
import java.util.Scanner;

// Import Java Swing & event packages.
import javax.swing.*;
import javax.swing.JFrame; // Frame
import javax.swing.JComponent; // Component
import javax.swing.JPanel; // Panel
import javax.swing.JComboBox; // Combo box
import javax.swing.JTextArea; // Text area
import javax.swing.JButton; // Button
import javax.swing.JLabel; // Label
import javax.swing.JTextArea; // Text area
import javax.swing.JCheckBox; // Check box
import javax.swing.JRadioButton; // Radio button
import javax.swing.ButtonGroup; // Button group
import java.awt.Color; // Color
import java.awt.FlowLayout; // Flow layout
import java.awt.event.ActionEvent; // Action event
import java.awt.event.ActionListener; // Action listener
import java.awt.event.MouseEvent; // Mouse event
import java.awt.event.MouseListener; // Mouse listener.
import java.awt.event.ItemEvent; // Item event.
import java.awt.event.ItemListener; // Item listener.

public class InventoryManagement extends JFrame implements
        ActionListener, MouseListener, ItemListener {

    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    
    // DECLARATIONS
    
    // Overall content pane.
    JPanel ContentPanel = new JPanel();
        
    // Labels
        // Declare label.
        JLabel label = new JLabel("The Witcher 3: Wild Hunt Inventory Aid");

    // Combo box
        // Declare JPanel for combo box.
        JPanel ComboBoxPanel = new JPanel();
        
        // Declare combo box label.
        JLabel ComboBoxLabel = new JLabel("Please choose one: ");
        
        // Declare and define itemStrings string array.
        String[] itemStrings = { "item1", "item2", "item3", "item4", "item5",
            "item6", "item7", "item8"};
   
        // Declare itemList, a combo box using the values of itemStrings.
        JComboBox itemList = new JComboBox(itemStrings);
    
    // Check boxes
        // Declare check box panel.
        JPanel CheckBoxPanel = new JPanel();
        
        // Declare check box label.
        JLabel CheckBoxLabel = new JLabel("Please select the choices " +
                    "that apply to you: ");
    
        // Declare check boxes.
        JCheckBox CheckBox1 = new JCheckBox("1");
        JCheckBox CheckBox2 = new JCheckBox("2");
        JCheckBox CheckBox3 = new JCheckBox("3");
        JCheckBox CheckBox4 = new JCheckBox("4");
        JCheckBox CheckBox5 = new JCheckBox("5");
            
        // Declare check box button.
        JButton CheckBoxButton = new JButton("Submit selections");
    
    
    // Radio buttons
        // Declare radio button panel.
        JPanel RadioButtonPanel = new JPanel();
        
        // Declare Label.
        JLabel RadioButtonLabel = new JLabel("Choose one: ");
            
        // Declare group & radio buttons.
        ButtonGroup buttonGroup = new ButtonGroup();
            JRadioButton RadioButtonA = new JRadioButton("A");
            JRadioButton RadioButtonB = new JRadioButton("B");
            JRadioButton RadioButtonC = new JRadioButton("C");
            
        // Declare radio button selection button.
        JButton RadioButton = new JButton("Submit choice");
    
    // Output
        // Declare output panel.
        JPanel OutputPanel = new JPanel();
        
        // Declare output label.
        JTextArea outputTextArea = new JTextArea();
    
        // Declare button.
        JButton button = new JButton("SUBMIT ALL");
    
        
    // Strings and arrays
        // Declare results strings.
        String chosenItems;
        String RadioButtonSelection;
        String CheckBoxSelections;
    
        // Declare boolean array myToppings.
        boolean[] mySelections = new boolean[5];
    
    
InventoryManagement() {
    
    // Set GUI Layout to a flow layout.
    setLayout(new FlowLayout());
        
    // Set the background color to default: white.
    setBackground(Color.white);
    
    // Add content pane panel (called ContentPanel).
    add(ContentPanel);
    setContentPane(ContentPanel);
        
    // Add the label to the GUI.
    ContentPanel.add(label);
    add(label);
        
    // Add a combo box to the GUI.
        // Add combo box panel.
        ContentPanel.add(ComboBoxPanel);
        add(ComboBoxPanel);
        
        // Add combo box label.
        ComboBoxPanel.add(ComboBoxLabel);
        add(ComboBoxLabel);
        
        // Add the itemList combo box to the GUI.
        ComboBoxPanel.add(itemList);
        add(itemList);
            
            // Set properties of itemList combo box: uneditable, white.
            itemList.setEditable(false); // make contents uneditable
            itemList.setSelectedIndex(7); // set to white
            itemList.addActionListener(this); // add an action listener
            itemList.setVisible(true); // set it to visible
               
    // Add radio buttons to group and to GUI.
        ContentPanel.add(RadioButtonPanel);
        add(RadioButtonPanel);
        
            RadioButtonPanel.add(RadioButtonLabel);
            add(RadioButtonLabel);
        
            RadioButtonPanel.add(RadioButtonA);
            add(RadioButtonA);
            buttonGroup.add(RadioButtonA);
            RadioButtonA.addActionListener(this);
            
            RadioButtonPanel.add(RadioButtonB);
            add(RadioButtonB);
            buttonGroup.add(RadioButtonB);
            RadioButtonB.addActionListener(this);

            RadioButtonPanel.add(RadioButtonC);
            add(RadioButtonC);
            buttonGroup.add(RadioButtonC);
            RadioButtonC.addActionListener(this);
        
            // Add a main radio button to register when a choice has been made.
            RadioButtonPanel.add(RadioButton);
            add(RadioButton);
            RadioButton.addActionListener(this);
        
    // Add check boxes.
        ContentPanel.add(CheckBoxPanel);
        add(CheckBoxPanel);
        
            CheckBoxPanel.add(CheckBoxLabel);
            add(CheckBoxLabel);
        
            CheckBoxPanel.add(CheckBox1);
            add(CheckBox1);
        
            CheckBoxPanel.add(CheckBox2);
            add(CheckBox2);
        
            CheckBoxPanel.add(CheckBox3);
            add(CheckBox3);
        
            CheckBoxPanel.add(CheckBox4);
            add(CheckBox4);
        
            CheckBoxPanel.add(CheckBox5);
            add(CheckBox5);
        
            // Add main check box button with listener.
            CheckBoxPanel.add(CheckBoxButton);
            add(CheckBoxButton);
            CheckBoxButton.addActionListener(this);
        
    // Output
        ContentPanel.add(OutputPanel);
        add(OutputPanel);
        
            // Add the "SUBMIT ALL" button.
            OutputPanel.add(button);
            add(button);
            button.addActionListener(this);

            // Add output text area and make it uneditable.
            OutputPanel.add(outputTextArea);
            add(outputTextArea);
            outputTextArea.setEditable(false);
        
    // Pack the GUI elements.
    pack();
        
    // Allow users to exit/close the GUI by the default method.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // Make the GUI visible.
    setSize(500, 500);
    setVisible(true);
    }
    
    // Enable program to sense when users change the state of items.
    @Override
    public void itemStateChanged(ItemEvent i) {
        
        // Find out which items were selected.
        Object selection = i.getItemSelectable();
            
            // What to do when each toppings check box is selected...
            // If pepperoni is selected...
            if (selection == CheckBox1) {    
                mySelections[0] = true;
                CheckBoxSelections = CheckBoxSelections + " " + "a, ";
            // Else if pepperoni is deselected...
            } else if (selection != CheckBox1) {
                mySelections[0] = false;
            }   
        
            // If pineapple is selected...
            else if (selection == CheckBox2) {
                mySelections[1] = true;
                CheckBoxSelections = CheckBoxSelections + " " + "b, ";
            // Else if pineapple is deselected...
            } else if (selection != CheckBox2) {
                mySelections[1] = false;
            }
        
            // If bacon is selected...
            else if (selection == CheckBox3) {
                mySelections[2] = true;
                CheckBoxSelections = CheckBoxSelections + " " + "c, ";
            // Else if bacon is deselected...
            } else if (selection != CheckBox3) {
                mySelections[2] = false;
            } 
        
            // If mushrooms is/are selected...
            else if (selection == CheckBox4) {
                mySelections[3] = true;
                CheckBoxSelections = CheckBoxSelections + " " + "d, ";
            // Else if mushrooms is/are deselected...
            } else if (selection != CheckBox4) {
                mySelections[3] = false;
            }
        
            // If extra cheese is selected...
            else if (selection == CheckBox5) {
                mySelections[4] = true;
                CheckBoxSelections = CheckBoxSelections + " " + "e, ";
            // Else if extra cheese is deselected...
            } else if (selection != CheckBox5) {
                mySelections[4] = false;
            }
        
        // What happens when check boxes are deselected.
        if (i.getStateChange() == ItemEvent.DESELECTED) {
            // What to do when each check box is deselected...
        }
    }
    
    // Enable program to sense when users enter the GUI area with a mouse.
    @Override
    public void mouseEntered(MouseEvent m) {
        label.setForeground(Color.red);
    }
    
    // Enable program to sense when users exit the GUI area with a mouse.
    @Override
    public void mouseExited(MouseEvent m) {
        label.setForeground(Color.black);
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
            
            // If the combo box selection is "item1", set chosen item to item1.
            if ("item1".equals(choice)) {
                chosenItems = "item1";
            }
            
            // If the combo box selection is "item2", set chosen item to item2.
            else if ("item2".equals(choice)) {
                chosenItems = "item2";
            }
            
            // If the combo box selection is "item3", set chosen item to item3.
            else if ("item3".equals(choice)) {
                chosenItems = "item3";
            }
            
            // If the combo box selection is "item4", set chosen item to item4.
            else if ("item4".equals(choice)) {
                chosenItems = "item4";
            }
            
            // If the combo box selection is "item5", set chosen item to item5.
            else if ("item5".equals(choice)) {
                chosenItems = "item5";
            }
            
            // If the combo box selection is "item6", set chosen item to item6.
            else if ("item6".equals(choice)) {
                chosenItems = "item6"; // change output
            }
            
            // If the combo box selection is "item7", set chosen item to item7.
            else if ("item7".equals(choice)) {
                chosenItems = "item7";
            }
            
            // If the combo box selection is "item8", set chosen item to item8.
            else if ("item8".equals(choice)) {
                chosenItems = "item8";
            }            
            
            // When the main radio button is pressed, figure out which one.
            if (source == RadioButton) {
            
                // If the A radio button is selected, assign size to "A".
                if (source == RadioButtonA) {
                    RadioButtonSelection = "A";

                // If the B radio button is selected, assign size to "B".    
                } else if (source == RadioButtonB) {
                    RadioButtonSelection = "B";
          
                // If the C radio button is selected, assign size to "C".
                } else if (source == RadioButtonC) {
                    RadioButtonSelection = "C";
                }
            }
    
            // When the check boxes button is pressed, figure out which
            // check boxes were chosen.
            if (source == CheckBoxButton) {
                
                // If 1 was selected, add it to check box selections output.
                if (CheckBox1.isSelected()) {
                    CheckBoxSelections = CheckBoxSelections + " " + "1, ";
                }
                
                // If 2 was selected, add it to check box selections output.
                if (CheckBox2.isSelected()) {
                    CheckBoxSelections = CheckBoxSelections + " " + "2, ";
                }
                
                // If 3 was selected, add it to check box selections output.
                if (CheckBox3.isSelected()) {
                    CheckBoxSelections = CheckBoxSelections + " " + "3, ";
                }
                
                // If 4 was selected, add it to check box selections output.
                if (CheckBox4.isSelected()) {
                    CheckBoxSelections = CheckBoxSelections + " " + "4, ";
                }
                
                // If 5 was selected, add it to check box selections output.
                if (CheckBox5.isSelected()) {
                    CheckBoxSelections = CheckBoxSelections + " " + "5, ";
                }
            }
                                   
            setVisible(true);
            
            // Report the choices made by the user in the output text area.
            outputTextArea.setText("\nYou chose " + chosenItems + ", " +
                RadioButtonSelection + ", and " + CheckBoxSelections + " ." +
                "\nThanks!");
            
            // Push the text to the GUI
            outputTextArea.getText();
            outputTextArea.setVisible(true);
            
        } // end "if button is pressed..." code section
    } // end action event code section
} // end all code in this Java class   
