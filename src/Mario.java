/*
  Christopher Cruzen                           LaunchCode CS50
  "Mario.java"                                      04.06.2015
  
  Problem Set #1, Program #1

    Output a mario-style half pyramid of user specified height.
  Validate user integer with a sentinel (0-23 inclusive).

*/

import java.util.Scanner;

public class Mario
{
    public static void main(String[] args)
    {
        // Variable Declarations
        int pyrHeight;
        Scanner reader = new Scanner(System.in);

        // Request & Input Pyramid Height
        System.out.print("\nWelcome to Pyramid Generator!\n\n");
        System.out.print("Please enter your pyramid height: ");
        pyrHeight = reader.nextInt();

        // Validate Input
        while(pyrHeight < 0 || pyrHeight > 23)
        {
            System.out.print("Invalid Height. Pyramid height must be");
            System.out.print(" greater than 0 and less than 23.\n");
            System.out.print("Please enter your pyramid height: ");
            pyrHeight = reader.nextInt();
        }

        // Print Pyramid
        System.out.println();
        for(int x = 0; x < pyrHeight; x++)
        {
            // Create Line String
            StringBuilder builder = new StringBuilder();

            // Concatenate Spaces
            for(int y = 1; y < pyrHeight - x; y++)
                builder.append(" ");

            // Concatenate Pound Signs
            for(int z = 0; z < x + 2; z++)
                builder.append("#");

            // Concatenate Newline
            builder.append("\n");

            // Print Line
            System.out.print(builder.toString());
        }
    }
}