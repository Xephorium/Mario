/*
  Christopher Cruzen                           LaunchCode CS50
  "Printer.java"                                    04.14.2015

  Problem Set #2

    A specific execution of the Printer interface, this class
  outputs the specified data to the console.

*/
package com.xephorium.mario.output;
import com.xephorium.mario.environment.*;

public class PrintToConsole implements Printer
{
    /*--- Constructor ---*/

    public PrintToConsole() {}


    /*--- Methods ---*/

    // Prints Pyramid to Console
    // Parameter: (Pyramid <pyramid obj>)
    public void print(Pyramid p)
    {
        System.out.print(p.toString());
    }
}
