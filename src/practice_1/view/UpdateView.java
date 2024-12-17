package practice_1.view;

import practice_1.view.component.Input;

public class UpdateView {
    public void updateBankView(){
        System.out.println("----------------------------------");
        System.out.println("Menu updateBankView");
        System.out.println("----------------------------------");
        System.out.println("1. Update Account Holder Name");
        System.out.println("2. Update Account Type");
        System.out.println("3. Exit");
        System.out.println("----------------------------------");
//        return Input.enterNumber("Choose an option", "Invalid value", 1, 3);
    }

    public void updateUserView(){
        System.out.println("-----------------------------------");
        System.out.println("Menu updateUserView");
        System.out.println("-----------------------------------");
        System.out.println("1. Update User name");
        System.out.println("2. Update User phone number");
        System.out.println("3. Update User email");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------");
    }
}
