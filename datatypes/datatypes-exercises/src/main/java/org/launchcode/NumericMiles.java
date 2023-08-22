package org.launchcode;

import java.util.Scanner;
public class NumericMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input miles drive:");
        Double numMiles = input.nextDouble();

        System.out.println("Input gas consumed in gallons:");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + "mpg.");

    }
}
