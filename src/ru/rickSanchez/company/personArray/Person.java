package ru.rickSanchez.company.personArray;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson(){
        System.out.print("First name: " + firstName);
        System.out.print(", Last name: "+ lastName);
        System.out.print(", Age: " + age +"\n");
    }

    public String getLastName() {
        return lastName;
    }
}

