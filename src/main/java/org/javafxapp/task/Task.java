package org.javafxapp.task;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Task {

    private Integer taskID;
    private Integer userID;
    private String taskName;
    private String taskDescription;
    private LocalDate taskStartDate;
    private LocalDate taskEndDate;
    private Priority taskPriority;
    private Status taskStatus;

    public Task() {}

    public Task (Integer taskID, Integer userID, String taskName, String taskDescription, LocalDate taskStartDate, LocalDate taskEndDate, Priority taskPriority, Status taskStatus) {
        this.taskID = taskID;
        this.userID = userID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStartDate = taskStartDate;
        this.taskEndDate = taskEndDate;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
    }

    public Task (String taskName, String taskDescription, LocalDate taskStartDate, LocalDate taskEndDate, Priority taskPriority, Status taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStartDate = taskStartDate;
        this.taskEndDate = taskEndDate;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(LocalDate taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public LocalDate getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(LocalDate taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public static long getTaskDateDifference(LocalDate taskStartDate, LocalDate taskEndDate) {
        return ChronoUnit.DAYS.between(taskStartDate, taskEndDate);
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID=" + taskID +
                ", userID=" + userID +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStartDate=" + taskStartDate +
                ", taskEndDate=" + taskEndDate +
                ", taskPriority=" + taskPriority +
                ", taskStatus=" + taskStatus +
                '}';
    }
}
