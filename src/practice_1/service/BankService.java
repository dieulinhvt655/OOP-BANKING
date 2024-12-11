package practice_1.service;

import practice_1.model.BankAccount;
import practice_1.temp_store.Bank;
import practice_1.view.component.Input;

import java.awt.*;
import java.util.ArrayList;

public class BankService {

    Bank bank = new Bank();
//    List<BankAccount> accounts  =  bank.getAccounts();
    
    // add a new bank account
    public BankAccount enterInforBankAccount(){
        String accountNumber = Input.enterAString("Enter your account number: ");
        String accountHolderName = Input.enterAString("Enter your account holder name: ");
        Double balance = Input.enterANumber("Enter your balance: ");
        String accountType = Input.enterAString("Enter your account type: ");

        return new BankAccount(accountNumber, accountHolderName, balance, accountType);
    }

    // remove a bank account
    public void removeBankAccount(){



    }

    private final int minAmount = 0;

    //gui tien vao tai khoan
    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    //rut tien tu tai khoan
    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    //chuyen tien giua hai tai khoan
    public void transfer(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
        if((amount > minAmount) && (amount <= sourceAccount.getBalance())){
            sourceAccount.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transfer successful!");
        }
        else {
            System.out.println("Transfer failed!");
        }
    }

    //kiem tra so du tai khoan
    public void checkBalance(BankAccount account) {
        System.out.println("Balance is: " + account.checkBalance());
    }
}
