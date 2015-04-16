/*
  Christopher Cruzen                             LaunchCode CS50
  "PrintFactory.java"                                 04.16.2015

  Problem Set #2

    Employed to hide instantiation of specific PrintType classes
  from main, this class creates and returns a specified Printer
  object to the calling code.

*/
package com.xephorium.mario.output;

public class PrintFactory
{
    /*--- Static Methods ---*/

    // Return New PrintToConsole Object
    public static Printer toConsole()
    {
        return new PrintToConsole();
    }

    // Return New PrintToFile Object
    public static Printer toFile()
    {
        return new PrintToFile();
    }

    // Return New PrintToFile Object
    // Parameter: (string <file name>)
    public static Printer toFileName(String name)
    {
        return new PrintToFile(name);
    }
}
