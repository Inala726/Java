package org.aptech.OOP;

public class Person {
    private int id;
    private String surname;
    private String firstName;
    private String gender;


//    public Person(){}
    public Person (int id, String surname, String firstName, String gender){
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
