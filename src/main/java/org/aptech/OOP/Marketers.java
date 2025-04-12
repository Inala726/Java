package org.aptech.OOP;

public class Marketers extends Employee{
    private String[] tasks;
    private double bonus;

    public Marketers (int empId, String firstName, String lastName, int age, String[] tasks, double bonus){
        super(empId, firstName, lastName, age);

    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
