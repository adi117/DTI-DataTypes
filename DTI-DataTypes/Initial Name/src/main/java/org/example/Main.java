package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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