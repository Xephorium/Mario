/*
  Christopher Cruzen                             LaunchCode CS50
  "PrintFactory.java"                                 04.16.2015

  Problem Set #2

    Employed to hide instantiation of specific PrintType classes
  from main, this class creates and returns a specified Printer
  object to the calling code. As of v0.4 (pset4), it no longer
  needs to be coded as a Singleton class since the default
  behavior of Spring is to instantiate only one object
  of classes annotated by @Component in the context.

*/
package com.xephorium.mario.output;
import org.springframework.stereotype.Component;

// Tell Spring Framework to automatically instantiate PrintFactory
// object of name "printFactory" in the context to be fetched
// elsewhere in the code.
@Component (value = "printFactory")
public class PrintFactory
{
    /*--- Methods ---*/

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
