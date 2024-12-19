package practice_1.model;

import java.io.Serial;
import java.io.Serializable;

public class BankAccount implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder Name: " + accountHolderName +
                ", Balance:" + balance +
                ", Account Type: " + accountType ;
    }
}
