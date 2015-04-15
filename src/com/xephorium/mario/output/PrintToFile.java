/*
  Christopher Cruzen                          LaunchCode CS50
  "PrintToFile.java"                               04.14.2015

  Problem Set #2

    A specific execution of the Printer interface, this class
  outputs the specified data to a text file.

*/
package com.xephorium.mario.output;
import java.io.*;

public class PrintToFile implements Printer
{
    /*--- Fields ---*/

    String fileName;


    /*--- Constructors ---*/

    // Default Constructor
    public PrintToFile()
    {
        fileName = "output.txt";
    }

    // Overloaded Constructor
    // Parameter: (String <file name>)
    public PrintToFile(String name)
    {
        fileName = name;
    }


    /*--- Methods ---*/

    // Set New File Name
    // Parameter: (String <file name>)
    public void setFileName(String name)
    {
        fileName = name;
    }

    // Get File Name
    // Returned: (String <file name>)
    public String getFileName()
    {
        return fileName;
    }

    // Prints Output to Text File
    // Parameter: (String <output data>)
    public void print(String output)
    {
        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(output);
            writer.flush();
        }
        catch(IOException e)
        {
            System.out.println("File writing failed.");
        }
    }
}
