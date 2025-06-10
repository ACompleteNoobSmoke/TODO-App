package org.javafxapp.scannerinput;

import java.util.Scanner;

public abstract class MyCustomScanner {
    private Scanner scanner;

    protected MyCustomScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntInput() {
        String input = "";
        int scannerInt = 0;
        try {
            scannerInt = Integer.parseInt(getStringInput());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid Input -- Please Enter A Valid Number");
        }
        return scannerInt;
    }

    public String getStringInput() {
        String stringInput = scanner.nextLine();
        if (stringInput.isBlank())
            throw new RuntimeException("Invalid Input -- Please Enter A Valid Input");
        return stringInput.trim();
    }
}
