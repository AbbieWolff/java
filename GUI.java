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
import java.util.Scanner;

// Import Java swing, awt & event packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements
        ActionListener, MouseListener, ItemListener {

    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    
    // DECLARATIONS
    
    // Declare major content pane panel.
    public JPanel ContentPanel = new JPanel();
    
    // Tabs
        // Declare tabbed pane
        //JTabbedPane Tabs = new JTabbedPane();
        //ImageIcon icon;    
            
    // Label
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
        
        //JComponent ComboBoxTab;
       
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
        
        //JComponent CheckBoxTab;

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
            
        //JComponent RadioButtonTab;\
    
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
        JButton button = new JButton("SUBMIT ALL");
    
        //JComponent ResultsTab;
        
    // Strings and arrays
        // Declare results strings.
        String chosenItems;
        String RadioButtonSelection;
        String CheckBoxSelections;
    
        // Declare boolean array myToppings.
        boolean[] mySelections = new boolean[5];
    
    
GUI() {
    
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
    
    // Add tabs
        //this.ResultsTab = Tabs.makeTextPanel("Results");
        //this.RadioButtonTab = Tabs.makeTextPanel("Radio Buttons");
        //this.CheckBoxTab = Tabs.makeTextPanel("Check Boxes");
        //this.ComboBoxTab = Tabs.makeTextPanel("Combo Box");
        //this.icon = createImageIcon("images/middle.gif");
        
    // Add the label to the GUI.
    ContentPanel.add(label);
    add(label);
        
    // Add a combo box to the GUI.
        // Add combo box panel.
        ContentPanel.add(ComboBoxPanel);
        add(ComboBoxPanel);
        ComboBoxPanel.setVisible(true);
        
            // Initialize combo box tab.
            //Tabs.addTab("Combo Boxes", icon, ComboBoxTab, "description");
            //Tabs.setMnemonicAt(1, KeyEvent.VK_1);
        
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
        RadioButtonPanel.setVisible(true);
        
            // Initialize radio button tab.
            //Tabs.addTab("Radio Buttons", icon, RadioButtonTab, "description");
            //Tabs.setMnemonicAt(2, KeyEvent.VK_2);
        
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
        
    // Add check boxes.
        ContentPanel.add(CheckBoxPanel);
        add(CheckBoxPanel);
        CheckBoxPanel.setVisible(true);
        
            // Initialize check box tab.
            //Tabs.addTab("Check Boxes", icon, CheckBoxTab, "description");
            //Tabs.setMnemonicAt(3, KeyEvent.VK_3);
        
            //CheckBoxPanel.add(CheckBoxLabel);
            add(CheckBoxLabel);
        
            //CheckBoxPanel.add(CheckBox1);
            add(CheckBox1);
        
            //CheckBoxPanel.add(CheckBox2);
            add(CheckBox2);
        
            //CheckBoxPanel.add(CheckBox3);
            add(CheckBox3);
        
            //CheckBoxPanel.add(CheckBox4);
            add(CheckBox4);
        
            //CheckBoxPanel.add(CheckBox5);
            add(CheckBox5);
        
    // Output
        ContentPanel.add(OutputPanel);
        add(OutputPanel);
        OutputPanel.setVisible(true);
        
            // Initialize results tab.
            //Tabs.addTab("Results", icon, ResultsTab, "description");
            //Tabs.setMnemonicAt(3, KeyEvent.VK_3);
        
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
    setSize(275, 500);
    setVisible(true);
    }
    
    // Enable program to sense when users change the state of items.
    @Override
    public void itemStateChanged(ItemEvent i) {
        
        // Find out which items were selected.
        Object selection = i.getItemSelectable();
            
            // What to do when each toppings check box is selected...
            // If 1 is selected...
            if (selection == CheckBox1) {    
                mySelections[0] = true;
                //CheckBoxSelections = CheckBoxSelections + " " + "a, ";
            // Else if 1 is deselected...
            } else if (selection != CheckBox1) {
                mySelections[0] = false;
            }   
        
            // If 2 is selected...
            else if (selection == CheckBox2) {
                mySelections[1] = true;
                //CheckBoxSelections = CheckBoxSelections + " " + "b, ";
            // Else if 2 is deselected...
            } else if (selection != CheckBox2) {
                mySelections[1] = false;
            }
        
            // If 3 is selected...
            else if (selection == CheckBox3) {
                mySelections[2] = true;
                //CheckBoxSelections = CheckBoxSelections + " " + "c, ";
            // Else if 3 is deselected...
            } else if (selection != CheckBox3) {
                mySelections[2] = false;
            } 
        
            // If 4 is selected...
            else if (selection == CheckBox4) {
                mySelections[3] = true;
                //CheckBoxSelections = CheckBoxSelections + " " + "d, ";
            // Else if 4 is deselected...
            } else if (selection != CheckBox4) {
                mySelections[3] = false;
            }
        
            // If 5 is selected...
            else if (selection == CheckBox5) {
                mySelections[4] = true;
                //CheckBoxSelections = CheckBoxSelections + " " + "e, ";
            // Else if 5 is deselected...
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
            
            // When a radio button is pressed, figure out which one.
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
    
            // Figure out which check box{es} were chosen.
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
                                  
            setVisible(true);
            
            // Report the choices made by the user in the output text area.
            outputTextArea.setText("\nYou chose " + chosenItems + ", " +
                RadioButtonSelection + ", and " + CheckBoxSelections + "." +
                "\nThanks!");
            
            // Push the text to the GUI
            outputTextArea.getText();
            outputTextArea.setVisible(true);
            
        } // end "if button is pressed..." code section
    } // end action event code section
} // end all code in this Java class   
