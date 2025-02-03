package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        findRectangleArea();
        circleRadius();
        triangleAngle();
        comparingDates();
        getInitial();
    }

    //Find Rectangle Area
    public static void findRectangleArea() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input length : ");
        int length = input.nextInt();
        System.out.print("Input width : ");
        int width = input.nextInt();

        System.out.println("The are of the rectangle : " + (length * width));
    }

    //Find Diameter, Circumstance, and Area of Circle
    public static void circleRadius() {
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

    //Triangle Angle
    public static void triangleAngle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angle 'a' : ");
        int angleA = input.nextInt();
        System.out.print("Input angle 'b; : ");
        int angleB = input.nextInt();

        System.out.println("Angle 'c' : " + (180 - angleA - angleB));
    }

    //Compare 2 Dates
    public static void comparingDates() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Date 1 (yyyy/MM/dd) : ");
        String date1 = input.next();

        System.out.print("Input Date 2 (yyyy/MM/dd) : ");
        String date2 = input.next();

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate localDate1 = LocalDate.parse(date1, formatDate);
        LocalDate localDate2 = LocalDate.parse(date2, formatDate);

        System.out.println("Day Difference : " + Math.abs(localDate1.toEpochDay() - localDate2.toEpochDay()));
    }

    //Get Name Initial
    public static void getInitial() {

        Scanner inputName = new Scanner(System.in);

        System.out.print("Input your name : ");
        String name = inputName.nextLine();

        String[] arrayName = name.split(" ");

        ArrayList<String> intialName = new ArrayList<>();

        for (int i = 0; i < arrayName.length; i++) {
            intialName.add(arrayName[i].split("")[0]);
        }

        System.out.println(String.join("", intialName).toUpperCase());
    }
}

