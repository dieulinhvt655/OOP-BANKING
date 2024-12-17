package practice_1.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String userName;
    private String email;
    private String phoneNumber;
    private List<BankAccount> accounts = new ArrayList<>();

    public User() {
    }
    public User(String userID, String userName, String email, String phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

//    // thêm tài khoản ngân hàng vào danh sách
//    public void addAccount (BankAccount account){
//        accounts.add(account);
//        System.out.println("Account added successfully to user: " + userName);
//    }

    // xoá tài khoản ra khỏi danh sách
//    public void removeAccount(String accountNumber){
//       if(bank.findAccount(accountNumber) != null){
//            accounts.remove(bank.findAccount(accountNumber));
//            System.out.println("Account removed successfully!");
//        }
//        else {
//            System.out.println("Account not found!");
//        }
//        BankAccount account = null;
//        for (BankAccount acc : accounts) {
//            if (acc.getAccountNumber().equals(accountNumber)) {
//                account = acc;
//                break;
//            }
//        }
//        if(account == null){
//            System.out.println("Account not found!");
//        }
//        else {
//            accounts.remove(account);
//            System.out.println("Account removed successfully!");
//        }
//    }
//
//    //hiển thị thông tin các tài khoản của người dùng
//    public void display() {
//        if (accounts.size() > 0) {
//            for (BankAccount account : accounts) {
//                System.out.println(account);
//            }
//        }
//        else{
//            System.out.println("Account list is empty!");
//        }
//    }
//
//    //hiển thị thông tin người dùng
//    public String displayUser(){
//        return "ID: " + userID +
//                ", Name: " + userName +
//                ", Email: " + email +
//                ", Phone number: " + phoneNumber;
//    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
