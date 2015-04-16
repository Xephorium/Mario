/*
  Christopher Cruzen                           LaunchCode CS50
  "Printer.java"                                    04.14.2015

  Problem Set #2

    This class represents a generic object of type Printer
  that can be polymorphically defined in a number of ways
  to print Pyramids at runtime.

*/
package com.xephorium.mario.output;
import com.xephorium.mario.environment.*;

public interface Printer
{
    public void print(Pyramid p);
}
