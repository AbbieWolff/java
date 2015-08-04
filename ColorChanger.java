/*
 * Abbie Wolff
 * August 2015
 * 
 * Java Programming Week 10 Assignment:
 * This program enables users to select the background color of a form with a 
 * GUI combo box.
 */
package colorchanger;

// Import Java Utility Scanner Package.
import java.util.Scanner;

// Import Java Swing & event packages.
import javax.swing.JFrame; // Frame
import javax.swing.JComboBox; // Combo box
import javax.swing.JTextArea; // Text area
import javax.swing.JButton; // Button
import javax.swing.JLabel; // Label
import java.awt.Color; // Color
import java.awt.FlowLayout; // Flow layout
import java.awt.event.ActionEvent; // Action event
import java.awt.event.ActionListener; // Action listener
import java.awt.event.MouseEvent; // Mouse event


// Declare class ColorChanger as an extension of JComboBox.
public class ColorChanger extends JFrame implements ActionListener {
    
    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);

    // Declare "Change Background Color" button.
    JButton button = new JButton("Change Background Color");

    // Declare color choice label.
    JLabel colorLabel = new JLabel("Choose a background color: ");
    
    // Declare output label.
    JTextArea outputTextArea = new JTextArea();
    
    // Declare and define colorStrings string array.
    String[] colorStrings = { "Red", "Orange", "Yellow", "Green", "Cyan", 
            "Blue", "Magenta", "White" };
    
    // Declare chosenColor string.
    String chosenColor;
    
    // Declare colorList, a JComboBox which contains the values of colorStrings.
    JComboBox colorList = new JComboBox(colorStrings);
    
    ColorChanger() {
        
        // Set GUI Layout to a flow layout.
        setLayout(new FlowLayout());
        
        // Set the background color to default: white.
        setBackground(Color.white);
        
        // Add the color label to the GUI.
        add(colorLabel);
        
        // Add the colorList combo box to the GUI.
        add(colorList);
        
        // Set properties of colorList combo box: uneditable, initially white.
        colorList.setEditable(false); // make the contents of the box uneditable
        colorList.setSelectedIndex(7); // set to white
        colorList.addActionListener(this); // add an action listener
        colorList.setVisible(true); // set it to visible
        
        // Add the "Change Background Color" button.
        add(button);
        button.addActionListener(this);
        
        // Add output text area and make it uneditable.
        add(outputTextArea);
        outputTextArea.setEditable(false);
        
        // Pack the GUI elements.
        pack();
        
        // Allow users to exit/close the GUI by the default method.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the GUI visible.
        setSize(350, 200);
        setVisible(true);
    }
    
    // Enable program to sense when users click a mouse.
    public void mouseClicked(MouseEvent m) {
    }
    
    // Enable program to sense when users press a mouse.
    public void mousePressed(MouseEvent m) {
    }

    // Enable program to sense when users release a mouse.
    public void mouseReleased(MouseEvent m) {
    }
    
    // Enable program to sense when users press "Order Pizza" button.
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Define objects source & choice based on user input.
        Object source = e.getSource();
        String choice = (String)colorList.getSelectedItem();
        
        // When the "Change Background Color" button is pressed...
        if (source == button) {
            
            // If the combo box selection is "white", set color to white.
            if ("White".equals(choice)) {
                chosenColor = "white";
                getContentPane().setBackground(Color.white);
            }
            
            // If the combo box selection is "red", set color to red.
            else if ("Red".equals(choice)) {
                chosenColor = "red";
                getContentPane().setBackground(Color.red);
            }
            
            // If the combo box selection is "orange", set color to orange.
            else if ("Orange".equals(choice)) {
                chosenColor = "orange";
                getContentPane().setBackground(Color.orange);
            }
            
            else if ("Yellow".equals(choice)) {
                chosenColor = "yellow";
                getContentPane().setBackground(Color.yellow);
            }
            
            // If the combo box selection is "green", set color to green.
            else if ("Green".equals(choice)) {
                chosenColor = "green";
                getContentPane().setBackground(Color.green);
            }
            
            // If the combo box selection is "cyan", set color to cyan.
            else if ("Cyan".equals(choice)) {
                chosenColor = "cyan"; // change output
                getContentPane().setBackground(Color.cyan); // change background
            }
            
            // If the combo box selection is "blue", set color to blue.
            else if ("Blue".equals(choice)) {
                chosenColor = "blue";
                getContentPane().setBackground(Color.blue);
            }
            
            // If the combo box selection is "magenta", set color to magenta.
            else if ("Magenta".equals(choice)) {
                chosenColor = "magenta";
                getContentPane().setBackground(Color.magenta);
            }
            
            setVisible(true);
            
            // Report the choices made by the user in the output text area.
            outputTextArea.setText("\nYou chose to change the background color" + 
                    " to " + chosenColor + "." + "\nGreat choice!");
            
            // Push the text to the GUI
            outputTextArea.getText();
            outputTextArea.setVisible(true);
            
        } // end "if button is pressed..." code section
    } // end action event code section
} // end all code in this Java class
