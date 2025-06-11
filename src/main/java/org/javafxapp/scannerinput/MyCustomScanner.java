package org.javafxapp.scannerinput;

import org.javafxapp.Exceptions.InvalidInputException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public abstract class MyCustomScanner {
    private final Scanner scanner;

    protected MyCustomScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntInput() {
        String input = "";
        int scannerInt = 0;
        try {
            scannerInt = Integer.parseInt(getStringInput());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Number");
        }
        return scannerInt;
    }

    public String getStringInput() {
        String stringInput = scanner.nextLine();
        if (stringInput.isBlank())
            throw new InvalidInputException("Invalid Input -- Please Enter A Valid Input");
        return stringInput.trim();
    }

    public LocalDate getLocalDateInput() {
        String dateString = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDateInput = null;
        try {
            dateString = getStringInput();
            localDateInput = LocalDate.parse(dateString, formatter);
        } catch (InvalidInputException | DateTimeParseException e) {
            throw new InvalidInputException("Invalid Input -- Please Enter A Valid Date (MM/dd/yyyy)");
        }
        return localDateInput;

    }
}
