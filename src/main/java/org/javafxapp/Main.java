package org.javafxapp;

import org.javafxapp.scannerinput.MyCustomScanner;

import java.util.Scanner;

public class Main extends MyCustomScanner {

    public Main() {
        super(new Scanner(System.in));
    }
    public static void main(String[] args) {
        Main main = new Main();
//        String firstName = main.getStringInput();
//        System.out.println(firstName);
        int age = main.getIntInput();
        System.out.println(age);
    }
}