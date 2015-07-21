/*
 * Abbie Wolff
 * June 2015
 * 
 * Java Programming Week 8 Assignment:
 * This program calculates commission based on user input in a GUI.
 * When users input a sales earnings amount and commission rate,
 * the program 1) calculates their earned commission amount, 
 * 2) calculates their total income (including commission), and 
 * 3) displays the results of these calculations in the GUI.
 */

package commission_gui;

// Import Java Utility Scanner & Number Format Packages.
import java.util.Scanner;
import java.text.NumberFormat;

// Import Java GUI event handlers and display settings.
import java.awt.Color; // Set GUI color.
import java.awt.FlowLayout; // Flow layout.
import java.awt.event.ItemEvent; // Item event.
import java.awt.event.ItemListener; // Item listener.
import java.awt.event.KeyEvent; // Key event.
import java.awt.event.KeyListener; // Key listener.
import java.awt.event.MouseEvent; // Mouse event.
import java.awt.event.MouseListener; // Mouse listener.
import java.awt.event.ActionEvent; // Action event.
import java.awt.event.ActionListener; // Action listener.

// Import Java GUI Swing package.
import javax.swing.JButton; // Button
import javax.swing.JFrame; // Frame
import javax.swing.JLabel; // Label
import javax.swing.JTextField; // Text field
import javax.swing.*;

// Declare main class as an extension of JFrame (Swing) & Listeners.
public class Commission_GUI extends JFrame implements
    KeyListener, ItemListener, MouseListener, ActionListener {
private static final long serialVersionUID = 1L;
            
    // Utilize Java library packages to enable user input.
    Scanner userInput = new Scanner (System.in);
    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

    // Declare button.
    JButton button = new JButton("Calculate");

    // Declare salesEarningsLabel with accompanying text field (10 columns).
    JLabel salesEarningsLabel = new JLabel("Sales Earnings: ");
    JTextField textField1 = new JTextField(10);
    
    // Declare commissionRateLabel with accompanying text field (10 columns).
    JLabel commissionRateLabel = new JLabel("Commission Rate: ");
    JTextField textField2 = new JTextField(10);
    
    // Declare earnedCommissionLabel with accompanying text field (10 columns).
    JLabel earnedCommissionLabel = new JLabel("Total Commission Earned... ");
    JTextField textField3 = new JTextField(10);
    //textField3.setEditable(false); #This line doesn't work...
    
    // Declare totalEarningsLabel with accompanying text field (10 columns).
    JLabel totalEarningsLabel = new JLabel(" Total Earnings " +
            "(including commission)... ");
    JTextField textField4 = new JTextField(10);
    //textField4.setEditable(false); #This line doesn't work...
    
    // Declare label.
    JLabel label = new JLabel("            ");
    
    // Declare earnings. 
    double earnings;
        
    // Declare rate.
    double rate;
        
    // Declare earnedCommission.
    double earnedCommission;
    
    // Declare totalEarnings. 
    double totalEarnings;         
            
    // Specify settings & add labels, textFields 1 & 2, etc. to GUI.
    Commission_GUI() {
        setLayout(new FlowLayout());
        
        // Add salesEarningsLabel and accompanying text field to GUI.
        add(salesEarningsLabel);
        add(textField1);
        
        // Add commissionRateLabel and accompanying text field to GUI.
        add(commissionRateLabel);
        add(textField2);
       
        // Add label to GUI.
        add(label);
        
        // Add button to GUI.
        add(button);
        
        // Add earnedCommissionLabel and accompanying text field to GUI.
        add(earnedCommissionLabel);
        add(textField3);
        
        // Ad totalEarningsLabel and accompanying text field to GUI.
        add(totalEarningsLabel);
        add(textField4);
        
        // Initialize keyboard and mouse input.
        textField1.addKeyListener(this);
        textField2.addKeyListener(this);
        label.addMouseListener(this);
        
        // Do not allow input into text fields 3 & 4 (where answers go).
        
        // Initialize button and check if user clicked the button.
        button.addActionListener(this);
        pack();
        
        // Allow users to exit/close the app gui by default method.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the GUI size and make it visible.
        setSize(250, 400);
        setVisible(true);
        
    }
    
    // Declare SetTextOnLabel method.
    void setTextOnLabel() {
        
        // Set earnings to value of user input in text field 1. 
        earnings =
            Double.parseDouble(textField1.getText());
        
        // Set rate to value of user input into text field 2.
        rate =
            Double.parseDouble(textField2.getText());
        
        // Set label to blank value.
        label.setText(" ");                
    }
    
    // Enable program to sense when users release a key.
    @Override
    public void keyReleased(KeyEvent k) {
        setTextOnLabel();
    }
    
    // Enable program to sense when users press a key.
    @Override
    public void keyPressed(KeyEvent k) {
    }
    
    // Enable program to sense when users type a key.
    @Override
    public void keyTyped(KeyEvent k) {
    }
    
    // Enable program to sense when users change the state of an item.
    @Override
    public void itemStateChanged(ItemEvent i) {
        setTextOnLabel();
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
    
    // Enable program to sense when users press "Calculate" button.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            
            // Calculate value of earnedCommission to: earnings & rate.
            earnedCommission =
                earnings * rate;
            
            // Set text field #3 to calculated earnedCommission value.
            textField3.setText(Double.toString(earnedCommission));
                                   
            // Calculate value of totalEarnings to: earnedCommission + earnings.
            totalEarnings =
                earnedCommission + earnings;
        
            // Set text field #4 to calculated totalEarnings value.
            textField4.setText(Double.toString(totalEarnings));
        }
    }
}            
