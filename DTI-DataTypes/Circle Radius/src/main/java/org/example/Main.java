package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input radius : ");
        int radius = input.nextInt();

        System.out.println("Diameter : " + (radius * 2));;
        System.out.println("Circumstance : " + getCircumstance(radius));
        System.out.println("Area : " + getArea(radius));
    }

    public static double getCircumstance(int radius){
        return radius * 2 * Math.PI;
    }

    public static double getArea(int radius){
        return Math.PI * Math.pow(radius, 2);
    }
}