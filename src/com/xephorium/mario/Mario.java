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

public class Mario
{
    public static void main(String[] args)
    {
        // Variable Declaration
        int pyrHeight;

        // Greet User & Input Pyramid Height
        Utilities.customGreeting("Pyramid Generator!");
        pyrHeight = Utilities.integerSentinel(0, 23, "Enter your pyramid height: ");

        // Create Pyramid
        Pyramid pyr1 = new Pyramid(pyrHeight);

        // Print Pyramid
        System.out.println("");
        System.out.print(pyr1.toString());
    }
}