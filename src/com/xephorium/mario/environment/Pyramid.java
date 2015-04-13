/*
  Christopher Cruzen                         LaunchCode CS50
  "Pyramid.java"                                  04.13.2015

  Problem Set #2

    This class represents a single, mario-style half pyramid
  of user specified height.

*/
package com.xephorium.mario.environment;

public class Pyramid
{
    /*--- Fields ---*/

    private int height;


    /*--- Constructors ---*/

    public Pyramid(){}

    public Pyramid(int h)
    {
        height = h;
    }


    /*--- Methods ---*/

    public void setHeight(int h)
    {
        height = h;
    }

    public int getHeight()
    {
        return height;
    }

    public String toString()
    {
        // Create Temporary Holder
        StringBuilder pyramid = new StringBuilder();

        // Generate/Concatenate Each Line of Pyramid
        for(int x = 0; x < height; x++)
        {
            StringBuilder line = new StringBuilder();

            for(int y = 1; y < height - x; y++)
                line.append(" ");
            for(int z = 0; z < x + 2; z++)
                line.append("#");
            line.append("\n");

            pyramid.append(line.toString());
        }

        /// Return Holder
        return(pyramid.toString());
    }
}
