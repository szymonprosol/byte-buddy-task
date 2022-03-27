package com.kodilla.bytebuddy;

public class User {

    private String firstname;
    private String lastname;
    private int yearOfBirth;

    public User(String firstname, String lastname, int yearOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void doSomething() {
        System.out.println("I'm doing something");
    }
}
