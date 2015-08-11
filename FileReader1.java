/*
 * Abbie Wolff
 * August 2015
 * Java Programming Week 11 Assignment:
 * a GUI program that uses JFileChooser to select a file, open the file, 
 * read it line by line, and display the contents of the file in a JTextArea.
 */
package filereader;

// Import Java input/output packages.
import java.io.*;
import java.nio.file.*;

// Import Java utility scanner.
import java.util.Scanner;

// Import Java swing, awt & event packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileReader1 extends JFrame implements
        ActionListener {
    
    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    
    // DECLARATIONS
    
    // Declare major content pane panel.
    public JPanel ContentPanel = new JPanel();  
            
    // Label
        // Declare label.
        JLabel label = new JLabel("        ");
        
    // Combo box 
        // Declare JPanel for combo box.
        JPanel ComboBoxPanel = new JPanel();
   
        // Declare combo box label.
        JLabel ComboBoxLabel = new JLabel("Please select a file: ");
        
        // Declare and define itemStrings string array.
        String[] itemStrings = { "EmilyDickinson.txt", "RobertFrost.txt"};
   
        // Declare itemList, a combo box using the values of itemStrings.
        JComboBox itemList = new JComboBox(itemStrings);
    
    // Results
        // Declare output panel.
        JPanel OutputPanel = new JPanel();
        
        // Declare output text area to show confirmation of user selection.
        JTextArea outputTextArea1 = new JTextArea();
        
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
        // Declare results string.
        String chosenAuthor;
    
    
FileReader1() {
    
    // Set GUI Layout to a flow layout.
    setLayout(new FlowLayout());
        
    // Set the background color to default: white.
    setBackground(Color.white);
    
    // Set GUI title to "Inventory Manager".
    setTitle("File Reader");
    
    // Add content pane panel, ContentPanel.
    add(ContentPanel);
    setContentPane(ContentPanel);
    ContentPanel.setVisible(true);
        
    // Add the label to the GUI.
    ContentPanel.add(label);
    add(label);
        
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

            // Add output text area 1 and make it uneditable.
            OutputPanel.add(outputTextArea1);
            add(outputTextArea1);
            outputTextArea1.setEditable(false);
            
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
    
    // Enable program to sense when users enter the GUI area with a mouse.
    public void mouseEntered(MouseEvent m) {
    }
    
    // Enable program to sense when users exit the GUI area with a mouse.
    public void mouseExited(MouseEvent m) {
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
    
    // Enable program to sense when users press "SUBMIT" button.
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Define objects source & choice based on user input.
        Object source = e.getSource();
        String choice = (String)itemList.getSelectedItem();
        
        // When the " " button is pressed...
        if (source == button) {
            
            // If the combo box selection is "EmilyDickinson.txt"...
            if ("EmilyDickinson.txt".equals(choice)) {
                chosenAuthor = "Emily Dickinson"; // set output text
                ShowFileReader.ReadMyFile("txt\\EmilyDickinson.txt"); 
            }
            
            // If the combo box selection is "RobertFrost.txt"...
            else if ("RobertFrost.txt".equals(choice)) {
                chosenAuthor = "Robert Frost"; // set output text
                ShowFileReader.ReadMyFile("txt\\RobertFrost.txt");
            }
            
            // Report the choices made by the user in the output text area.
            outputTextArea1.setText("\nYou chose to read a poem by " + chosenAuthor + 
                "." + "\nEnjoy!");
            
            // Push the text to the GUI
            outputTextArea1.getText();
            outputTextArea1.setVisible(true);
            
        } // end "if button is pressed..." code section
    } // end action event code section
} // end all code in this Java class  
