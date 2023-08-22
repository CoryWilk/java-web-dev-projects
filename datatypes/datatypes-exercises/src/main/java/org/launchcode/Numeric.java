package org.launchcode;

import java.util.Scanner;
public class Numeric {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");

        Double recLength = input.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        Double recWidth = input.nextDouble();

        Double recArea = recLength * recWidth;
        System.out.println("The area of the rectangle is: " + recArea);
    }
}
