package org.aptech.OOP;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int empId, String firstName, String lastName, int age, int teamSize) {
        super(empId, firstName, lastName, age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
