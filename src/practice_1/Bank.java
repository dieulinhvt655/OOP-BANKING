package practice_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    final int min = 0;
    public Bank() { // constructor
    }

    public Bank(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    // them tai khoan moi
    public void addAcount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

    // tim tai khoan
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
        if (account.getAccountNumber().equals(accountNumber)) {
            System.out.println("Account found: " + account);
            return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
    //xoa tai khoan
    public void removeAccount(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if(account == null){
            System.out.println("Account not found!");
        }
        else {
            accounts.remove(account);
            System.out.println("Account removed: " + account);
        }
    }
    // hien thi thong tin tat ca cac tai khoan
    public void displayAccounts() {
        if (accounts.size() > min) {
            for (BankAccount account : accounts) {
                account.getAccountInfo();
                System.out.println("---------------------");
            }
        }
        else {
            System.out.println("No bank accounts found!");
        }
    }

}
