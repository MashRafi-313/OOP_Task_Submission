package org.problem6;

import java.util.Date;

public class User {
    int userID;
    String userName;
    String userAddress;
    int phoneNo;

    public User(int userID, String userName, String userAddress, int phoneNo) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    public void returnBooks() {
        System.out.println("Returning books...");
    }

    public void payFine(Date dt) {
        System.out.println("Paying fine on date: " + dt.toString());
    }

    public void addNewUser() {
        System.out.println("Adding new user...");
    }

    public void deleteUser() {
        System.out.println("Deleting user...");
    }

    public void updateDetails() {
        System.out.println("Updating user details...");
    }

    public void bookPurchase() {
        System.out.println("Purchasing book...");
    }
}
