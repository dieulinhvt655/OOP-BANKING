package practice_1.view;

import practice_1.model.BankAccount;
import practice_1.view.component.Input;

public class BankView {
    public int menuBank(){
        System.out.println("----------------------");
        System.out.println("Menu Bank");
        System.out.println("----------------------");
        System.out.println("1. Add bank account");
        System.out.println("2. Remove bank account");
        System.out.println("3. Update bank account");
        System.out.println("4. Bank service");
        System.out.println("5. Exit");
        System.out.println("6. Back");
        System.out.println("----------------------");
        return Input.enterNumber("Choose an option", "Invalid value", 1, 6);
    }

    public int menuBankService(){
        System.out.println("----------------------");
        System.out.println("Menu Bank Account");
        System.out.println("----------------------");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Transfer Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.println("6. Back");
        System.out.println("----------------------");
        return Input.enterNumber("Choose an option", "Invalid value", 1, 6);
    }
}
