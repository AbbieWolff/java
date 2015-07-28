/*
 * Abbie Wolff
 * July 2015
 * 
 * Java Programming Week 9 Assignment:
 * This program enables users to select the size & toppings of a pizza with a 
 * GUI. Users choose between small, medium or large pizza sizes using radio 
 * buttons. Users select toppings by clicking on check boxes.
 */

package pizza;

// Import Java Utility Scanner & Array Packages.
import java.util.Scanner;

// Import Java GUI event handlers and display settings.
import java.awt.Color; // Set GUI color.
import java.awt.FlowLayout; // Flow layout.
import java.awt.event.ItemEvent; // Item event.
import java.awt.event.ItemListener; // Item listener.
import java.awt.event.MouseEvent; // Mouse event.
import java.awt.event.MouseListener; // Mouse listener.
import java.awt.event.ActionEvent; // Action event.
import java.awt.event.ActionListener; // Action listener.

// Import Java GUI Swing package.
import javax.swing.JButton; // Button
import javax.swing.JFrame; // Frame
import javax.swing.JLabel; // Label
import javax.swing.JTextArea; // Text area
import javax.swing.JCheckBox; // Check box
import javax.swing.JRadioButton; // Radio button
import javax.swing.ButtonGroup; // Button group



public class Pizza extends JFrame implements
    ItemListener, MouseListener, ActionListener {
private static final long serialVersionUID = 1L;

    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    
    // Declare button.
    JButton button = new JButton("Order Pizza");

    // Declare size label.
    JLabel sizeLabel = new JLabel("Size: ");
    
    // Declare size group & radio buttons.
    ButtonGroup sizeGroup = new ButtonGroup();
        JRadioButton smallRadioButton = new JRadioButton("small");
        JRadioButton mediumRadioButton = new JRadioButton("medium");
        JRadioButton largeRadioButton = new JRadioButton("large");
    
    // Declare toppingsLabel.
    JLabel toppingsLabel = new JLabel("Toppings: ");
    
        // Declare toppings group & check boxes.
        JCheckBox pepperoniCheckBox = new JCheckBox("pepperoni");
        JCheckBox pineappleCheckBox = new JCheckBox("pineapple");
        JCheckBox baconCheckBox = new JCheckBox("bacon");
        JCheckBox mushroomsCheckBox = new JCheckBox("mushrooms");
        JCheckBox extraCheeseCheckBox = new JCheckBox("extra cheese");    
        
    // Declare orderSummaryLabel with accompanying text area.
    JLabel orderSummaryLabel = new JLabel("Order Summary: ");
    JTextArea orderSummaryTextArea = new JTextArea();
    
    // Declare label.
    JLabel label = new JLabel("          ");
    
    // Declare string array toppings. 
    String[] toppings = { 
        "pepperoni", "pineapple", "bacon", "mushrooms", "extra cheese"
    };
    
    // Declare boolean array myToppings.
    boolean[] myToppings;
    
    // Declare size string.
    String size;
    
    // Declare chosenToppings string & i (index) integer.
    String chosenToppings = ""; 
    int i = 0; // index
        
    // Specify settings & add labels, textFields 1 & 2, etc. to GUI.
    Pizza() {
        setLayout(new FlowLayout());
        
        // Add size labels and radio buttons to group and to GUI.
        // Register listeners for each radio button.
        add(sizeLabel);
            add(smallRadioButton);
            sizeGroup.add(smallRadioButton);
            smallRadioButton.addActionListener(this);
            
            add(mediumRadioButton);
            sizeGroup.add(mediumRadioButton);
            mediumRadioButton.addActionListener(this);

            add(largeRadioButton);
            sizeGroup.add(largeRadioButton);
            largeRadioButton.addActionListener(this);
        
        // Add toppings label and toppings check boxes.
        add(toppingsLabel);
            add(pepperoniCheckBox);
            add(pineappleCheckBox);
            add(baconCheckBox);
            add(mushroomsCheckBox);
            add(extraCheeseCheckBox);
       
        // Add label to GUI.
        add(label);
        
        // Add button to GUI.
        add(button);
        
        // Add uneditable order summary label and text area below button.
        add(orderSummaryLabel);
        add(orderSummaryTextArea);
        orderSummaryTextArea.setEditable(false);
        
        // Initialize mouse input.
        label.addMouseListener(this);
        
        // Initialize button and check if user clicked the button.
        button.addActionListener(this);
        
        // Pack GUI.
        pack();
        
        // Allow users to exit/close the GUI by the default method.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the GUI size and make it visible.
        setSize(300, 400);
        setVisible(true);
        
    }
             
    // Enable program to sense when users change the state of items.
    @Override
    public void itemStateChanged(ItemEvent i) {
        
        // Find out which items were selected.
        Object selection = i.getItemSelectable();
            
            // What to do when each toppings check box is selected...
            // If pepperoni is selected...
            if (selection == pepperoniCheckBox) {    
                myToppings[0] = true;
            // Else if pepperoni is deselected...
            } else if (selection != pepperoniCheckBox) {
                myToppings[0] = false;
            }   
        
            // If pineapple is selected...
            else if (selection == pineappleCheckBox) {
                myToppings[1] = true;
            // Else if pineapple is deselected...
            } else if (selection != pineappleCheckBox) {
                myToppings[1] = false;
            }
        
            // If bacon is selected...
            else if (selection == baconCheckBox) {
                myToppings[2] = true;
            // Else if bacon is deselected...
            } else if (selection != baconCheckBox) {
                myToppings[2] = false;
            } 
        
            // If mushrooms is/are selected...
            else if (selection == mushroomsCheckBox) {
                myToppings[3] = true;
            // Else if mushrooms is/are deselected...
            } else if (selection != mushroomsCheckBox) {
                myToppings[3] = false;
            }
        
            // If extra cheese is selected...
            else if (selection == extraCheeseCheckBox) {
                myToppings[4] = true;
                // Else if extra cheese is deselected...
                } else if (selection != extraCheeseCheckBox) {
                myToppings[4] = false;
                }
        
        // What happens when check boxes are deselected.
        if (i.getStateChange() == ItemEvent.DESELECTED) {
            // What to do when each toppings check box is deselected...
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
               
        // Assign radio button selection to size string.
        Object choice = e.getActionCommand();
        
            // If the small radio button is selected, assign size to "small."
            if (choice == smallRadioButton) {
                size = "small";

            // If the medium radio button is selected, assign size to "medium".    
            } else if (choice == mediumRadioButton) {
                size = "medium";
          
            // If the large radio button is selected, assign size to "large".
            } else if (choice == largeRadioButton) {
                size = "large";
            }
        
    
        // When users press the 'Order Pizza' button...
        Object source = e.getSource();
            
            // When the "Order Pizza" button is pressed, figure out which
            // toppings were chosen.
            if (source == button) {
                
                for (i = 0; i < myToppings.length; i++) {
                    if (myToppings[i]) {
                        chosenToppings = chosenToppings + toppings[i];
                    }
                }
            
            // Display pizza order selections in Order Summary text area.
            
                // Assign string orderSummary the phrase to be printed.
                String orderSummary = ("\nYou ordered a " + size + "pizza with " +
                    chosenToppings +
                    " for toppings. " +
                    "\nThank you! Enjoy your imaginary pizza.");
            
                // Set the text in the Order Summary text area to the defined
                // value of the order summary string.
                orderSummaryTextArea.setText(orderSummary);
                
                // Push the text to the GUI
                orderSummaryTextArea.getText();
                orderSummaryTextArea.setVisible(true);
            }
    }
}
