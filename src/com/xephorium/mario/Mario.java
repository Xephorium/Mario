/*
  Christopher Cruzen                           LaunchCode CS50
  "Mario.java"                                      04.13.2015
  
  Problem Set #2

    Output a mario-style half pyramid of user specified height
  to either the console or a text file. Validate user integer
  with a sentinel (0-23 inclusive).

*/
package com.xephorium.mario;
import com.xephorium.mario.environment.*;
import com.xephorium.mario.output.*;

public class Mario
{
    public static void main(String[] args)
    {
        // Variable Declaration
        int pyrHeight;
        int outputMethod;
        Printer print = PrintFactory.getInstance().toConsole();

        // Greet User & Input Pyramid Height
        Utilities.customGreeting("Pyramid Generator!");
        pyrHeight = Utilities.integerSentinel(0, 23, "Enter your pyramid height: ");

        // Create Pyramid
        Pyramid pyr1 = PyramidFactory.getInstance().newPyramidHeight(pyrHeight);

        // Prompt User for Output Method
        System.out.println("Would you like to print to the console (1) or a file (2)?");
        outputMethod = Utilities.integerSentinel(1, 2, "Selection: ");

        // Print Pyramid
        if(outputMethod == 2)
            print = PrintFactory.getInstance().toFile();
        print.print(pyr1);
    }
}