package org.javafxapp.task;

import org.javafxapp.Exceptions.InvalidInputException;
import org.javafxapp.scannerinput.MyCustomScanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TaskInput extends MyCustomScanner {


    public TaskInput(Scanner taskScanner) {
        super(taskScanner);
    }

    public Integer taskIDInput() {
        int taskID = Integer.MIN_VALUE;
        while (taskID <= 0) {
            try {
                System.out.print("\nEnter Task ID: ");
                taskID = getIntInput();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
        return taskID;
    }

   public String taskNameInput() {
        String taskName = "";
        while (taskName.isEmpty()) {
            try {
                System.out.print("\nEnter Task Name: ");
                taskName = getStringInput();
            } catch (InvalidInputException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
        return taskName;
   }

   public String taskDescriptionInput() {
        String taskDescription = "";
        while (taskDescription.isEmpty()) {
            try {
                System.out.print("\nEnter Task Description: ");
                taskDescription = getStringInput();
            } catch (InvalidInputException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
        return taskDescription;
   }

   public LocalDate taskDateInput() {
        return LocalDate.now();
   }

   public LocalDate taskEndDateInput() {
        LocalDate dateInput = null;
        while (dateInput == null) {
            try {
                System.out.print("\nEnter Task End Date (MM/dd/yyyy): ");
                dateInput = getLocalDateInput();
            } catch (InvalidInputException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
        return dateInput;
   }


    public static void main(String[] args) {
        TaskInput taskInput = new TaskInput(new Scanner(System.in));
        LocalDate startDate = taskInput.taskDateInput();
        LocalDate endDate = taskInput.taskEndDateInput();
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Day Left: " + Task.getTaskDateDifference(startDate, endDate));
    }

}
