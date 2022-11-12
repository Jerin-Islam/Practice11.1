import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.Scanner;

//definition of "Test" class

public class Test1

{

    //definition of main method

    public static void main(String[] args)

    {

        //open a file name hello.txt

        try (Scanner in = new Scanner(new File("hello.txt")))

        {

            //read message in string variable

            String message = in.nextLine();

            //display the message

            System.out.println(message);

        }

        //catch block

        catch (FileNotFoundException e)

        {

            //throw an exception

            e.printStackTrace();

        }
        //file auto close at the end by try and catch block

        //try block

        try (PrintWriter out = new PrintWriter("hello.txt"))

        {

            //store the message Hello, World! in the file

            out.println("Hello, World!");

        }

        //catch block

        catch (FileNotFoundException e)

        {

            //throw an exception

            e.printStackTrace();

        }

    }

}