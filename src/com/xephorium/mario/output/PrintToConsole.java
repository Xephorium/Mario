/*
  Christopher Cruzen                           LaunchCode CS50
  "Printer.java"                                    04.14.2015

  Problem Set #2

    A specific execution of the Printer interface, this class
  outputs the specified data to the console.

*/
package com.xephorium.mario.output;

public class PrintToConsole implements Printer
{
    /*--- Constructor ---*/

    public PrintToConsole() {}


    /*--- Methods ---*/

    // Prints Output to Console
    // Parameter: (String <output data>)
    public void print(String output)
    {
        System.out.print(output);
    }
}
