package practice_1.service.service_interface;

import practice_1.model.BankAccount;

public interface BankInterface {

    BankAccount enterInforBankAccount();

    void removeBankAccount (String accountNumber);

    void updateBankAccount(String accountNumbner);

    void deposit(String accountNumber, Double amount);

    void withdraw(String accountNumber, double amount);

    void transfer(String fromBankAccountNumber, String toBankAccountNumber, double amount);

    void checkBalance(String accountNumber);

}
