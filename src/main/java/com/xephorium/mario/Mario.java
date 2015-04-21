/*
  Christopher Cruzen                           LaunchCode CS50
  "Mario.java"                                      04.13.2015
  
  Problem Set #2

    Output a mario-style half pyramid of user specified height
  to either the console or a text file. Validate user integer
  with a sentinel (0-23 inclusive).
    As of Problem Set #4, this class includes Spring Framework
  annotations to inject instantiated objects where it results
  in cleaner code.

*/
package com.xephorium.mario;
import com.xephorium.mario.environment.*;
import com.xephorium.mario.output.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

// Tell Spring Framework to automatically instantiate Mario
// object of name "marioObject" in the context to be fetched
// elsewhere in the code.
@Component (value = "marioObject")
public class Mario
{
    /*--- Field ---*/

    // Tell Spring Framework to fetch PrintFactory object
    // named "printFactory".
    @Autowired
    private PrintFactory printFactory;


    /*--- Methods ---*/

    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        Mario app1 = (Mario) context.getBean("marioObject");
        app1.start();
    }

    public void start()
    {
        // Variable Declaration
        int pyrHeight;
        int outputMethod;
        Printer print = printFactory.toConsole();

        // Greet User & Input Pyramid Height
        Utilities.customGreeting("Pyramid Generator!");
        pyrHeight = Utilities.integerSentinel(0, 23, "Enter your pyramid height: ");

        // Create Pyramid
        Pyramid pyr1 = PyramidFactory.getInstance().newPyramidHeight(pyrHeight);

        // Prompt User for Output Method
        System.out.println("Would you like to print to the console (1) or a file (2)?");
        outputMethod = Utilities.integerSentinel(1, 2, "Selection: ");

        // Print Pyramid
        if(outputMethod == 2)
            print = printFactory.toFile();
        print.print(pyr1);
    }
}