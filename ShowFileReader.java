/*
 * Abbie Wolff
 * August 2015
 * Java Programming Week 11 Assignment:
 * a GUI program that uses JFileChooser to select a file, open the file, 
 * read it line by line, and display the contents of the file in a JTextArea.
 */

package filereader;

// Java Package imports.
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowFileReader {
    
    public static void ReadMyFile(String path) {
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(path));
            String myFile = "";
            String l;
            while ((l = inputStream.readLine()) != null) {
                myFile = myFile + l + '\n'; //read line from text file into temporary string (include newlines)
            }
        
        FileReader1.setOutputText(myFile); // set output text to the string read from the file
        FileReader1.getOutputText(); // push new contents of output to GUI.
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShowFileReader.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(ShowFileReader.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(ShowFileReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    // Command line arguments.   
    public static void main (String[] args) throws IOException {
        
        // Initialize ShowFileReader class.
        new ShowFileReader();
        
        // Initialize FileReader1 class to show GUI;
        new FileReader1();
    }
}
