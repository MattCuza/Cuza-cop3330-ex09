/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args ){
        final double gallon = 350;
        Scanner sc= new Scanner(System.in);
        System.out.println("What is the length of the ceiling? ");
        double length = sc.nextDouble();

        System.out.println("What is the width of the ceiling? ");
        double width = sc.nextDouble();

        double paintAmount = ((length * width) / gallon);

        System.out.println("You will need to purchase " + (int)Math.ceil(paintAmount) + " gallons of paint to cover " + (int)(length * width) +
                " square feet." );
    }
}
