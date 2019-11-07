// Program Header Block
// - Sequential Programming Exercises With INPUT
// - Seean Islam
// - date you created the program (programmers also document the revision dates here too)
// - brief description of what the program does
// A program to calculate the Area of a Triangle given the base and height.

import javax.swing.*;

public class AreaOfTriangle
{
  public static void main (String[] args)
  {
    // Step 1 - Declaring variables
    double dblBase, dblHeight, dblArea; // initiliazes integer variables for dimensions
    String strBase; // saves base's input as a string
    String strHeight; // saves height's input as a string


    // Step 2 - (Input) Assigning values to variables
    
    strBase = JOptionPane.showInputDialog ("Enter the triangle's base: "); // prompts
    strHeight = JOptionPane.showInputDialog ("Enter the triangle's height: ");
    dblHeight = Double.parseDouble (strHeight); // changes input (string) into integer value
    dblBase = Double.parseDouble (strBase);
    dblArea = (dblBase * dblHeight)/2; // performs equation

    // Step 3 - Processing
    
    JOptionPane.showMessageDialog (null, "A triangle with base " + dblBase +
" units\nand height " + dblHeight +
" units\nhas an area of " + dblArea + " square units"); // display result on prompt 

    // Step 4 - Output
  }
}