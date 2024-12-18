package practice_1.controller;

import practice_1.service.service_interface.UserInterface;
import practice_1.view.UserView;
import practice_1.view.component.BaseView;
import practice_1.view.component.Input;

public class UserController {

    private UserView userView;
    private UserInterface userService;

    BaseView baseView =new BaseView();

    public UserController(UserView userView, UserInterface userService) {
        this.userView = userView;
        this.userService = userService;
    }

    public void createUser(){
        baseView.baseView();
        userService.createUser();
    }

    public void updateUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.updateUser(userID);
    }

    public void removeUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.removeUser(userID);
    }

    public void addBankAccountToUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.addBankAccountToUser(userID);
    }

    public void removeBankAccountFromUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.removeBankAccountFromUser(userID);
    }

    public void displayAllBankAccountsOfUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.displayAllBankAccounts(userID);
    }

    public void displayUser(){
        baseView.baseView();
        String userID = Input.enterAString("Enter user ID");
        userService.displayUser(userID);
    }
}
