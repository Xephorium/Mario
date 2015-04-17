/*
  Christopher Cruzen                             LaunchCode CS50
  "PrintFactory.java"                                 04.16.2015

  Problem Set #2

    Employed to hide instantiation of specific PrintType classes
  from main, this class creates and returns a specified Printer
  object to the calling code. As of v0.4 (pset4), it is coded as
  a Singleton class.

*/
package com.xephorium.mario.output;

public class PrintFactory
{
    /*--- Fields ---*/

    private static PrintFactory factory = null;


    /*--- Constructor ---*/

    private PrintFactory() {}


    /*--- Methods ---*/

    // Return Reference to Static PrintFactory Object
    public static PrintFactory getInstance()
    {
        if(factory == null)
            factory = new PrintFactory();
        return factory;
    }

    // Return New PrintToConsole Object
    public Printer toConsole()
    {
        return new PrintToConsole();
    }

    // Return New PrintToFile Object
    public Printer toFile()
    {
        return new PrintToFile();
    }

    // Return New PrintToFile Object
    // Parameter: (string <file name>)
    public Printer toFileName(String name)
    {
        return new PrintToFile(name);
    }
}
