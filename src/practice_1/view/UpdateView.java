package practice_1.view;

import practice_1.view.component.Input;

public class UpdateView {
    public int updateBankView(){
        System.out.println("----------------------------------");
        System.out.println("Menu updateBankView");
        System.out.println("----------------------------------");
        System.out.println("1. Update Account Holder Name");
        System.out.println("2. Update Account Type");
        System.out.println("3. Exit");
        System.out.println("----------------------------------");
        return Input.enterNumber("Choose an option", "Invalid value", 1, 3);
    }
}
