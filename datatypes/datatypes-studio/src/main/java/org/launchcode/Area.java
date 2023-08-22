package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double userRadius = input.nextDouble();

        double area = Circle.getArea(userRadius);
        System.out.println("The area of a circle with radius " + userRadius + " is: " + area);

        input.close();
    }

}
