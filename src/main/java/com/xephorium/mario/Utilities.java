/*
  Christopher Cruzen                             LaunchCode CS50
  "Utilities.java"                                    04.13.2015

  Problem Set #2

    Functionally static, this class contains a number of methods
  that can be cleanly implemented in the main class of the
  application Mario.

    Note: As this class falls well outside the object oriented
  organization structure of the rest of the program and will
  never need to be extended, I've opted not to make it a
  Singleton along with PrintFactory and PyramidFactory in v0.4
  (pset 4).

*/
package com.xephorium.mario;
import java.util.Scanner;

public final class Utilities
{
    /*--- Constructor ---*/

    private Utilities(){}


    /*--- Static Methods ---*/

    // Output A Generic Greeting
    public static void defaultGreeting()
    {
        System.out.println("##############");
        System.out.println("## Welcome! ##");
        System.out.println("##############\n");
    }

    // Output A Program-Specific Greeting
    // Parameter: (String "Program Name!")
    public static void customGreeting(String s)
    {
        StringBuilder output = new StringBuilder();

        output.append("##############");
        for(int x = 0; x < (s.length() + 3); x++)
            output.append("#");
        output.append("\n## Welcome to ");
        output.append(s);
        output.append(" ##\n");
        output.append("##############");
        for(int x = 0; x < (s.length() + 3); x++)
            output.append("#");
        output.append("\n");

        System.out.println(output);
    }

    // Input User Integer; Check for Valid Data
    // Parameters: (int <lowest valid #>, int <highest valid #>,
    //             String "prompt: ")
    // Returned:   int <user number>
    public static int integerSentinel(int x, int y, String s)
    {
        Scanner reader = new Scanner(System.in);
        int input;

        System.out.print(s);
        input = reader.nextInt();
        while(input < x || input > y)
        {
            System.out.println("Input must be greater than " + (x-1) +
                               " and less than " + (y+1) + ".");
            System.out.print(s);
            input = reader.nextInt();
        }

        return input;
    }
}
