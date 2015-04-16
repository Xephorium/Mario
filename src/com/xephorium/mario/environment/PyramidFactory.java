/*
  Christopher Cruzen                             LaunchCode CS50
  "PyramidFactory.java"                               04.16.2015

  Problem Set #2

    Employed to hide instantiation of Pyramid classes from main,
  this class creates and returns a specified Printer object to
  the calling code.

    Note: Since, at this point in the Mario application's
  development, there is only one intended function for the
  Pyramid class, the case could be made that this file serves
  no practical purpose beyond Factory Design demonstration.
    For a better example, see "PrintFactory.java".

*/
package com.xephorium.mario.environment;

public class PyramidFactory
{
    /*--- Static Methods ---*/

    // Return New Pyramid Object
    public static Pyramid newPyramid()
    {
        return new Pyramid();
    }

    // Return New Pyramid Object
    // Parameter: (int <height>)
    public static Pyramid newPyramidHeight(int height)
    {
        return new Pyramid(height);
    }

}
