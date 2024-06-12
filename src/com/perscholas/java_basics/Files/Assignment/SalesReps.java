package com.perscholas.java_basics.Files.Assignment;

public class SalesReps {

    private String userID = "";
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String phone = "";
    private String dateOfBirth = "";

    public SalesReps(String userID,
                     String firstName,
                     String lastName,
                     String email,
                     String phone,
                     String dateOfBirth) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public SalesReps(String[] dataArray) {
        this.userID = dataArray[0];
        this.firstName = dataArray[1];
        this.lastName = dataArray[2];
        this.email = dataArray[3];
        this.phone = dataArray[4];
        this.dateOfBirth = dataArray[5];
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getKeyParameter() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
