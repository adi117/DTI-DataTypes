package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angle 'a' : ");
        int angleA = input.nextInt();
        System.out.print("Input angle 'b; : ");
        int angleB = input.nextInt();

        System.out.println("Angle 'c' : " + (180 - angleA - angleB));
    }
}