/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String inp1;
        int temp, cels, fahr;
        Scanner inp = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit.\n" + "Your choice: ");
        inp1 = inp.nextLine();

        if (inp1.equals("C") || inp1.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = inp.nextInt();
            cels = (temp - 32) * (5/9);
            System.out.print("The temperature in Celsius is " + cels + ".");
        }

        if (inp1.equals("F") || inp1.equals("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = inp.nextInt();
            fahr = ((temp*9)/5) + 32;
            System.out.print("The temperature in Fahrenheit is " + fahr + ".");
        }

    }
}
