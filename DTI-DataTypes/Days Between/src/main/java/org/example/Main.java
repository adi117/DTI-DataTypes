package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
}