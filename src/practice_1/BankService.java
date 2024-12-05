package practice_1;

public class BankService {
    private final int minAmount = 0;
    //gui tien vao tai khoan
    public void deposit(BankAccount account, double amount) {
        account.deposit( amount);
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
