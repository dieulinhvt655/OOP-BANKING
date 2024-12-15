package practice_1.Controller;

import practice_1.model.BankAccount;
import practice_1.service.BankService;
import practice_1.view.BankView;
import practice_1.view.View;
import practice_1.view.component.BaseView;
import practice_1.view.component.Input;

import javax.security.auth.login.AccountNotFoundException;

public class BankAccountController {

    BankView bankView;
    BankService bankService;

    BaseView bV = new BaseView();

    public BankAccountController(BankView bankView, BankService bankService) {
        this.bankView = bankView;
        this.bankService = bankService;
    }

    public void add(){
        bV.baseView();
        BankAccount account = bankService.enterInforBankAccount();
        System.out.println("Bank account added");
        bV.baseView();
    }

    public void remove(){
        bV.baseView();
        String input = Input.enterAString("Enter account number");
//        try {
//            bankService.removeBankAccount(input);
//            System.out.println("Bank account removed");
//        } catch (AccountNotFoundException e) {
//
//        }

        bV.baseView();
    }

}
