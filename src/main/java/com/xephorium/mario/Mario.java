/*
  Christopher Cruzen                           LaunchCode CS50
  "Mario.java"                                      04.13.2015
  
  Problem Set #2

    Output a mario-style half pyramid of user specified height
  to either the console or a text file. Validate user integer
  with a sentinel (0-23 inclusive).

*/
package com.xephorium.mario;
import com.xephorium.mario.environment.*;
import com.xephorium.mario.output.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mario
{
    /*--- Field ---*/

    @Autowired
    private PrintFactory printFactory;


    /*--- Constructor ---*/
    // Not neccessary with printFactory Autowired
    // public Mario(PrintFactory pF)
    //{
    //    printFactory = pF;
    //}


    /*--- Methods ---*/

    public static void main(String[] args)
    {
        // Not necessary with Mario AutoWired
        // Mario app1 = new Mario(PrintFactory.getInstance());
        //app1.start();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        Mario app1 = (Mario) context.getBean("mario");
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