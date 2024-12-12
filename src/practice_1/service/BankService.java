package practice_1.service;

import data.Context;
import practice_1.model.BankAccount;
import practice_1.temp_store.Bank;
import practice_1.view.component.Input;

import java.util.List;

public class BankService {

    Context context = new Context();

    public BankService(Context context) {
        this.context = context;
    }

    public BankAccount enterInforBankAccount(){ //nhập dữ liệu vào từ phím
        String accountNumber = Input.enterAString("Enter your account number: ");
        String accountHolderName = Input.enterAString("Enter your account holder name: ");
        Double balance = Input.enterANumber("Enter your balance: ");
        String accountType = Input.enterAString("Enter your account type: ");
        return new BankAccount(accountNumber, accountHolderName, balance, accountType);
    }

    public void addBankAccount(BankAccount bankAccount){  // add a new bank account
        context.getBankAccounts().add(bankAccount);
        context.saveChange();
        System.out.println("Bank account added");
    }

    // kiem tra tai khoan co ton tai k dua tren accountNumber
//    public boolean hasBankAccount(String accountNumber){
//        return context.getBankAccounts().stream()
//                .anyMatch(account -> account.getAccountNumber().equals(accountNumber));
//    }

    public void removeBankAccount(){ // remove a bank account
        String accountNumber = Input.enterAString("Enter your account number: ");
        BankAccount accountToRemove = context.getBankAccounts().stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);

        if(accountToRemove != null){
            context.getBankAccounts().remove(accountToRemove);
            context.saveChange();
            System.out.println("Bank account removed");
        }
        else {
            System.out.println("Account not found");
        }
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
