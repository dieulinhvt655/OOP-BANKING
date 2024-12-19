package practice_1.view;

import practice_1.view.component.Input;

public class UserView {

    public int menuUser(){
        System.out.println("----------------------");
        System.out.println("Menu User");
        System.out.println("----------------------");
        System.out.println("1. Add user");
        System.out.println("2. Remove user");
        System.out.println("3. Update user");
        System.out.println("4. User service");
        System.out.println("5. Exit");
//        System.out.println("6. Back");
        System.out.println("----------------------");
        return Input.enterNumber("Choose an option", "Invalid value", 1, 5);
    }

    public int menuUserService(){
        System.out.println("----------------------");
        System.out.println("Menu User");
        System.out.println("----------------------");
        System.out.println("1. Add an account to the list");
        System.out.println("2. Remove an account from the list");
        System.out.println("3. Show all accounts");
        System.out.println("4. Display user information ");
        System.out.println("5. Exit");
        System.out.println("6. Back");
        System.out.println("----------------------");
        return Input.enterNumber("Choose an option", "Invalid value", 1, 6);
    }
}
