/*
 * Sean Luo 13/09/2018
 * Palindrome.java
 * This progrem calculates the Palindrome.
 */

package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a word
        String Palindrome = JOptionPane.showInputDialog("Words that are the same "
                + "forwards and backards are called palindrmes.\n This program "
                + "determines if a words is a palindome.\n\nEnter a word");
        
        String word = Palindrome;
        String backwardsWord = "";
         for (int pos = word.length() - 1; pos >= 0; pos--) {
         backwardsWord += word.charAt(pos);
         }
         if(word.equals(backwardsWord)){
         JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
          + ".\nIt IS a palindrome.");
         }
         else{
         JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
          + ".\nIt ISn't a palindrome.");
                 
                 }
    }
    }

       
    

