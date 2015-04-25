/*
  Christopher Cruzen                             LaunchCode CS50
  "PyramidFactory.java"                               04.16.2015

  Problem Set #2

    Employed to hide instantiation of Pyramid classes from main,
  this class creates and returns a specified Pyramid object to
  the calling code. As of v0.4 (pset4), it is coded as a
  Singleton class.

    Note: Since, at this point in the Mario application's
  development, there is only one intended function for the
  Pyramid class, the case could be made that this file serves
  no practical purpose beyond Factory Design and Singleton
  Class demonstration.
    For a better example, see "PrintFactory.java".

*/
package com.xephorium.mario.environment;

public class PyramidFactory
{
    /*--- Field ---*/

    private static PyramidFactory factory = null;


    /*--- Constructor ---*/

    private PyramidFactory() {}


    /*--- Methods ---*/

    // Return Reference to Static PyramidFactory Object
    public static PyramidFactory getInstance()
    {
        if(factory == null)
            factory = new PyramidFactory();
        return factory;
    }

    // Return New Pyramid Object
    public Pyramid newPyramid()
    {
        return new Pyramid();
    }

    // Return New Pyramid Object
    // Parameter: (int <height>)
    public Pyramid newPyramidHeight(int height)
    {
        return new Pyramid(height);
    }

}
