//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2
package labtask9;

import java.util.*;
import javax.swing.*;

public class DictionaryMain {
    public static void main (String[]args){
        
        String word = null;
        String choice = "N";
        boolean dict = true;
        
        HashMap <String, String> dictionary = new HashMap <String, String> ();
        dictionary.put("world","the earth together");
        dictionary.put("table","Place where you keep things");
        
        while (choice.equalsIgnoreCase("N"))
        {
         do
         {
        word = JOptionPane.showInputDialog("Enter the Word ");
        JOptionPane.showMessageDialog(null, dictionary.get(word));
        dict = false;
       
        if ((dictionary.get(word)) == null){
        word = JOptionPane.showInputDialog("Enter new Word "); //if the word doesn't exist.
        String meaning = JOptionPane.showInputDialog("Enter the meaning of the new word ");
        String prevvalue = (String)dictionary.put(word , meaning);
        word = JOptionPane.showInputDialog("Enter Word ");
        JOptionPane.showMessageDialog(null, dictionary.get(word));
        dict = false;
        }
        } while (dict == true );
        choice = JOptionPane.showInputDialog("Would you like to exit the dictionary? (Y/N)"); //prompt user to exit dictionary
            if (choice.equalsIgnoreCase("N"))
            {
               dict = true;  
            }
        }
        
        
        
    }
    
}
