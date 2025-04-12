package org.aptech.OOP;

public class OOPMain {
    public static void main(String[] args) {
        Person person = new Person(1, "Jacob", "Prince", "male");
        person.setFirstName("Ere");
        System.out.println("id: "+person.getId()+"\n"+"Fullname: "+person.getSurname()+" "+person.getFirstName());
    }
}
