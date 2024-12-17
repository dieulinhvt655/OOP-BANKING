package practice_1.Controller;

import practice_1.model.BankAccount;
import practice_1.service.BankService;
import practice_1.view.BankView;
import practice_1.view.component.BaseView;
import practice_1.view.component.Input;

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
        bV.baseView();
    }

    public void remove(){
        bV.baseView();
        String input = Input.enterAString("Enter account number");
        bankService.removeBankAccount(input);
        bV.baseView();
    }

    public void update(){
        bV.baseView();
        String accountNumber = Input.enterAString("Enter account number you want to update");
        bankService.updateBankAccount(accountNumber);
        bV.baseView();
    }

    public void deposit(){
        bV.baseView();
        String accountNumber = Input.enterAString("Enter account number you want to deposit");
        Double amount = Input.enterANumber("Enter amount you want to deposit");
        bankService.deposit(accountNumber, amount);
        bV.baseView();
    }

    public void withdraw(){
        bV.baseView();
        String accountNumber = Input.enterAString("Enter account number you want to withdraw");
        Double amount = Input.enterANumber("Enter amount you want to withdraw");
        bankService.withdraw(accountNumber, amount);
        bV.baseView();
    }

    public void transfer(){
        bV.baseView();
        String fromAccountNumber = Input.enterAString("Enter account number you want to transfer");
        String toAccountNumber = Input.enterAString("Enter the account number to receive money");
        Double amount = Input.enterANumber("Enter amount you want to transfer");
        bankService.transfer(fromAccountNumber, toAccountNumber, amount);
        bV.baseView();
    }

    public void checkBalance(){
        bV.baseView();
        String accountNumber = Input.enterAString("Enter account number you want to check balance");
        bankService.checkBalance(accountNumber);
        bV.baseView();
    }
}
