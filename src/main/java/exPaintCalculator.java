/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
import java.lang.*;
public class exPaintCalculator {
    public static void main(String[] args)
    {
        final double constRate = 0.00285714285; //1/350
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the ceiling?");
        double len = sc.nextDouble();
        System.out.println("What is the width of the ceiling?");
        double width = sc.nextDouble();
        double area = len*width;
        double paint = constRate*area;

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil(paint), area);
    }
}
