package practice_1.model;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount() {
    }

    public BankAccount(String acoountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = acoountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAcoountNumber(String acoountNumber) {
        this.accountNumber = acoountNumber;
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

    private final int minAmount = 0;

//    //gui tien vao tai khoan
//    public void deposit(double amount) {
//        if(amount > minAmount){
//            balance += amount;
//            System.out.println("Deposit successful! New baclance is " + balance);
//        }
//        else {
//            System.out.println("Deposit invalid!");
//        }
//    }
//    //rut tien tu tai khoan
//    public void withdraw(double amount) {
//        if(amount > minAmount && amount <= balance){
//            balance = balance - amount;
//            System.out.println("Withdraw successful! new balance is: " + balance);
//
//        }
//        else {
//            System.out.println("Withdraw invalid!");
//        }
//    }
//    //tra ve so du hien tai
//    public double checkBalance (){
//        return balance;
//    }
//    // hien thi thong tin tai khoan
//    public void getAccountInfo(){
//        System.out.println("Account Number     : " + accountNumber);
//        System.out.println("Account Holder Name: " + accountHolderName);
//        System.out.println("Account Type       : " + accountType);
//        System.out.println("Balance            : " + balance);
//    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder Name: " + accountHolderName +
                ", Balance:" + balance +
                ", Account Type: " + accountType ;
    }
}
