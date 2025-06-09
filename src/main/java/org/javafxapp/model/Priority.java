package org.javafxapp.model;

public enum Priority {
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    DEFCON1("DEFCON 1"),
    NUCLEAR("NUCLEAR");

    private final String priorityString;

    Priority(String priorityString) {
        this.priorityString = priorityString;
    }

    @Override
    public String toString() {
        return priorityString;
    }
}
