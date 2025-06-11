package org.javafxapp.Exceptions;

public class InvalidInputException extends RuntimeException {
    String fieldMessage;

    public InvalidInputException(String fieldMessage) {

        super("Invalid Input -- Please Enter A Valid " + fieldMessage);
    }
}
