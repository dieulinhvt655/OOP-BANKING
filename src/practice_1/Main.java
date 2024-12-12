package practice_1;

import data.Context;
import practice_1.model.BankAccount;
import practice_1.model.User;
import practice_1.service.BankService;
import practice_1.temp_store.Bank;

public class Main {


    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("23010545", "Oggy", 20000, "Saving");
//        BankAccount account2 = new BankAccount("23010000", "Olavie", 19999, "Saving");
//        BankAccount account3 = new BankAccount("23010001", "Jackie", 18000, "Saving");
//        BankAccount account4 = new BankAccount("23010002", "Bobie", 170000, "Saving");
//        Bank bank = new Bank();
//        BankAccount bankAccount = new BankAccount();
//        BankService bankService = new BankService();
//        User user_1 = new User("a123", "dlvt_655", "linh@gmail.com", "0865060505");
//        User user_2 = new User();

//        bank.addAcount(account1);
//        bank.addAcount(account2);
//        bank.addAcount(account3);
//        bank.addAcount(account4);
//
//        System.out.println("---------------------------");
//        bank.findAccount("2138dha8w");
//        bank.findAccount("23010545");
//
//        System.out.println("---------------------------");
//        bank.removeAccount("23010545");
//
//        System.out.println("---------------------------");
//        bank.displayAccounts();
//
//        double amount = 5000;
//        BankAccount account = bank.findAccount("23010001");
//        BankAccount sourceAccount = bank.findAccount("23010000");
//        BankAccount targetAccount = bank.findAccount("23010002");
//        View view = new View();
//        view.menu();
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose an option: ");
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            //deposit
//            case 1 -> {
//                if (account != null) {
//                    bankService.deposit(account, amount);
//                }
////                else {
////                    System.out.println("Account not found!");
////                }
//            }
//            //withdraw
//            case 2 -> {
//                if (account != null) {
//                    bankService.withdraw(account, amount);
//                }
//            }
//            // transfer
//            case 3 -> {
//                if (account != null) {
//                    bankService.transfer(sourceAccount, targetAccount, amount);
//                }
//            }
//            //check balance
//            case 4 -> {
//                if (account != null) {
//                    bankService.checkBalance(account);
//                }
//            }
//        }

        Context context = new Context();
        BankService bankService = new BankService(context);

        BankAccount bankAccount = bankService.enterInforBankAccount();

        bankService.addBankAccount(bankAccount);

    }
}