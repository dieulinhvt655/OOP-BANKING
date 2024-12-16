package practice_1.service;

import data.Context;
import practice_1.model.BankAccount;
import practice_1.view.UpdateView;
import practice_1.view.View;
import practice_1.view.component.Input;

import java.util.List;

public class BankService {

    Context context = new Context();

    public BankService(Context context) {
        this.context = context;
    }

    private final double iniDefBalance = 0.0;
    private final int minAmount = 0;


    // thêm 1 tài khoản mới
    public BankAccount enterInforBankAccount(){
        String accountNumber = Input.enterAString("Enter your account number: ");
        String accountHolderName = Input.enterAString("Enter your account holder name: ");
        String accountType = Input.enterAString("Enter your account type: ");
        BankAccount acc = new BankAccount(accountNumber, accountHolderName, iniDefBalance, accountType);
        addBankAccount(acc);
        System.out.println("Bank account added");
        return acc;
    }
    public void addBankAccount(BankAccount bankAccount){  // add a new bank account
        context.getBankAccounts().add(bankAccount);
        context.saveChange();
    }

    //remove a bank account
    public void removeBankAccount (String accountNumber){
        // remove a bank account
//        String accountNumber = Input.enterAString("Enter your account number: ");
//        BankAccount accountToRemove = context.getBankAccounts().stream()
//                .filter(account -> account.getAccountNumber().equals(accountNumber))
//                .findFirst()
//                .orElse(null);
//
//        if(accountToRemove != null){
//            context.getBankAccounts().remove(accountToRemove);
//            context.saveChange();
//            System.out.println("Bank account removed");
//        }
//        else {
//            System.out.println("Account not found");
//        }

        BankAccount bankAccountToRemove = null;
        for(BankAccount bankAccount : context.getBankAccounts()){
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                bankAccountToRemove = bankAccount;
                break;
            }
        }
        if(bankAccountToRemove != null){
            context.getBankAccounts().remove(bankAccountToRemove);
            context.saveChange();
            System.out.println("Bank account removed");
        }
        else {
            System.out.println("Bank account not found");
        }
    }

    // accountNumber is PK, can't change
    public void updateBankAccount(String accountNumbner){
        BankAccount bankAccountToUpdate = null;
        for (BankAccount bankAccount : context.getBankAccounts()){
            if (bankAccount.getAccountNumber().equals(accountNumbner)){
                bankAccountToUpdate = bankAccount;
                break;
            }
        }
        if(bankAccountToUpdate != null){
            UpdateView updateView = new UpdateView();
            updateView.updateBankView();

            int option = Input.enterNumber("Choose an option", "Invalid value", 1, 3);
            switch (option){
                case 1:
                    String newAccountHolderName = Input.enterAString("Enter new account holder name: ");
                    updateAccountHolderName(bankAccountToUpdate, newAccountHolderName);
                    System.out.println("Update successful.");
                    break;
                case 2:
                    String newAccountType = Input.enterAString("Enter new account type: ");
                    updateAccountType(bankAccountToUpdate, newAccountType);
                    System.out.println("Update successful.");
                    break;
                case 3:
                    System.out.println("program exited");
            }
        }
        else {
            System.out.println("Bank account not found");
        }
    }
    //case 1
    public void updateAccountHolderName(BankAccount bankAccount, String newAccountHolderName){
        bankAccount.setAccountHolderName(newAccountHolderName);
        context.saveChange();
        System.out.println("Account holder name update successful");
    }
    //case 2
    public void updateAccountType(BankAccount bankAccount, String newAccountType){
        bankAccount.setAccountType(newAccountType);
        context.saveChange();
        System.out.println("Account type update successful");
    }


//    kiem tra tai khoan co ton tai k dua tren accountNumber
    public boolean hasBankAccount(String accountNumber){
        return context.getBankAccounts().stream()
                .anyMatch(account -> account.getAccountNumber().equals(accountNumber));
    }

    public void deposit(BankAccount bankAccount, double amount){
        boolean account = hasBankAccount(bankAccount.getAccountNumber());
        if (account){
            if(amount > minAmount){
                double newBalance = bankAccount.getBalance() + amount;
                bankAccount.setBalance(newBalance);
                context.saveChange();
                System.out.println("Deposit successful. New balance: " + newBalance);
            }
            else {
                System.out.println("Deposit failed. Amount must exceed minimum amount.");
            }
        }
        else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(BankAccount bankAccount, double amount){
        boolean account = hasBankAccount(bankAccount.getAccountNumber());
        if (account){
            if (amount > minAmount && amount <= bankAccount.getBalance()){
                double newBalance = bankAccount.getBalance() - amount;
                bankAccount.setBalance(newBalance);
                context.saveChange();
                System.out.println("Withdraw successful. New balance: " + newBalance);
            }
            else {
                System.out.println("Withdraw failed. Amount must be greater than" +
                        " minimum amount and cannot exceed current balance.");
            }
        }
        else {
            System.out.println("Account not found");
        }
    }

    public void transfer(BankAccount fromBankAccount, BankAccount toBankAccount, double amount){
        if(amount > minAmount && amount <= fromBankAccount.getBalance()){
            double newBalanceOfFromBankAccount = fromBankAccount.getBalance() - amount;
            fromBankAccount.setBalance(newBalanceOfFromBankAccount);
            double newBalanceOfToBankAccount = toBankAccount.getBalance() + amount;
            toBankAccount.setBalance(newBalanceOfToBankAccount);
            context.saveChange();
            System.out.println("Transfer successful!");
        }
        else {
            System.out.println("Invalid amount. Transfer failed!");
        }
    }

    public void checkBalance(BankAccount bankAccount){
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
