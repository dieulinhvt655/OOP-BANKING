package practice_1.service;

import data.Context;
import practice_1.model.BankAccount;
import practice_1.model.User;
import practice_1.service.service_interface.UserInterface;
import practice_1.view.UpdateView;
import practice_1.view.component.Input;

public class UserService implements UserInterface {

    Context context = new Context();

    public UserService(Context context) {
        this.context = context;
    }

    // kiem tra xem co ton tai tai khoan user khong
    public User userExisted (String userID){
        User userAccount = null;
        for(User user : context.getUsers()){
            if(user.getUserID().equals(userID)){
                userAccount = user;
            }
        }
        return userAccount;
    }

    // create
    @Override
    public void createUser() {
        String userID = Input.enterAString("Enter user ID: ");
        String userName = Input.enterAString("Enter user Name: ");
        String userEmail = Input.enterAString("Enter user Email: ");
        String userPhoneNumber = Input.enterAString("Enter user Phone Number: ");

        User user = new User(userID, userName, userEmail, userPhoneNumber);

        if (userExisted(userID) == null){
            addUser(user);
            System.out.println("User " + user.getUserID() + " has been added");
            createBankAccountWhenUserCreated(user);
        }
        else{
            System.out.println("User " + user.getUserID() + " already exists");
        }

    }

    public void createBankAccountWhenUserCreated(User user){
        String accountNumber = user.getUserID();
        String accountName = user.getUserName();
        Double balance = 0.0;
        String accountType = "Saving";
        BankAccount bankAccount = new BankAccount(accountNumber, accountName, balance, accountType);

        context.getBankAccounts().add(bankAccount);
        context.saveChange();
    }

    public void addUser(User user){
        context.getUsers().add(user);
        context.saveChange();
    }

    //find user account
    public User findUser(String userID){
        User user = null;
        for(User userAccount : context.getUsers()){
            if(userAccount.getUserID().equals(userID)){
                user = userAccount;
            }
        }
        return user;
    }

    //update user name
    public void updateUserName (User user, String newUserName){
        user.setUserName(newUserName);
        context.saveChange();
    }
    //update user email
    public void updateUserEmail(User user, String newUserEmail){
        user.setEmail(newUserEmail);
        context.saveChange();
    }
    //update user phone number
    public void updateUserPhoneNumber(User user, String newUserPhoneNumber){
        user.setPhoneNumber(newUserPhoneNumber);
        context.saveChange();
    }

    //update
    @Override
    public void updateUser(String userID){
        User userToUpdate = findUser(userID);
        if(userToUpdate != null){
            UpdateView updateView = new UpdateView();
            updateView.updateUserView();

            int option = Input.enterNumber("Choose an option", "Invalid value", 1, 4);
            switch(option){
                case 1:
                    String newUserName = Input.enterAString("Enter new user name: ");
                    updateUserName(userToUpdate, newUserName);
                    System.out.println("User " + userToUpdate.getUserID() + " has been updated");
                    break;
                case 2:
                    String newUserPhoneNumber = Input.enterAString("Enter new user phone number: ");
                    updateUserPhoneNumber(userToUpdate, newUserPhoneNumber);
                    System.out.println("User " + userToUpdate.getUserID() + " has been updated");
                    break;
                case 3:
                    String newUserEmail = Input.enterAString("Enter new user email: ");
                    updateUserEmail(userToUpdate, newUserEmail);
                    System.out.println("User " + userToUpdate.getUserID() + " has been updated");
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
            }
        }
    }

    //remove
    @Override
    public void removeUser(String userID){
        User userIDToRemove = findUser(userID);
        if(userIDToRemove != null){
            context.getUsers().remove(userIDToRemove);
            context.saveChange();
            System.out.println("User " + userIDToRemove.getUserID() + " has been removed");
        }
        else {
            System.out.println("User not found");
        }
    }

    //add bank account to user account
    public void addBankAccountToUser(){

    }
    //remove bank account from user account

    //display user bank account infor
    //display user infor

}
