package practice_1;

import data.Context;
import practice_1.controller.BankAccountController;
import practice_1.controller.UserController;
import practice_1.option.Option;
import practice_1.service.BankService;
import practice_1.service.UserService;
import practice_1.view.BankView;
import practice_1.view.UserView;
import practice_1.view.View;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        //view
        View view = new View();
        BankView bankView = new BankView();
        UserView userView = new UserView();
        //service
        BankService bankService = new BankService(context);
        UserService userService = new UserService(context);
        //controller
        BankAccountController bankAccountController = new BankAccountController(bankView, bankService);
        UserController userController = new UserController(userView, userService);

        int option;
        do {
            option = view.menu(); //main menu
            switch (option) {
                case Option.BANK_ACCOUNT:
                    handleBankAccount(bankView, bankAccountController);
                    break;
                case Option.USER:
                    handleUser(userView, userController);
                    break;
                case Option.EXIT:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != Option.EXIT);
    }

    private static void handleBankAccount(BankView bankView, BankAccountController bankAccountController) {
        int bank_account_option;
        do {
            bank_account_option = bankView.menuBank(); // menu BankAccount
            switch (bank_account_option) {
                case Option.BankAccount.ADD_BANKACCOUNT:
                    bankAccountController.add();
                    break;
                case Option.BankAccount.REMOVE_BANKACCOUNT:
                    bankAccountController.remove();
                    break;
                case Option.BankAccount.UPDATE_BANKACCOUNT:
                    bankAccountController.update();
                    break;
                case Option.BankAccount.BANK_SERVICE:
                    handleBankService(bankView, bankAccountController);
                    break;
//                case Option.BankAccount.BACK_BANKACCOUNT:
//                    System.out.println("Returning to main menu...");
//                    return;
                case Option.BankAccount.EXIT_BANKACCOUNT:
                    System.out.println("Exiting Bank Account menu...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    }

    private static void handleBankService(BankView bankView, BankAccountController bankAccountController) {
        int bank_service_option;
        do {
            bank_service_option = bankView.menuBankService(); // menu BankService
            switch (bank_service_option) {
                case Option.BankService.DEPOSIT:
                    bankAccountController.deposit();
                    break;
                case Option.BankService.WITHDRAW:
                    bankAccountController.withdraw();
                    break;
                case Option.BankService.TRANSFER:
                    bankAccountController.transfer();
                    break;
                case Option.BankService.CHECK_BALANCE:
                    bankAccountController.checkBalance();
                    break;
                case Option.BankService.BACK_BANKSERVICE:
                    System.out.println("Returning to Bank Account menu...");
                    return;
                case Option.BankService.EXIT_BANKSERVICE:
                    System.out.println("Exiting Bank Service menu...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    }

    private static void handleUser(UserView userView, UserController userController) {
        int user_option;
        do {
            user_option = userView.menuUser(); // menu User
            switch (user_option) {
                case Option.User.CREATE:
                    userController.createUser();
                    break;
                case Option.User.REMOVE_USER:
                    userController.removeUser();
                    break;
                case Option.User.UPDATE_USER:
                    userController.updateUser();
                    break;
                case Option.User.USER_SERVICE:
                    handleUserService(userView, userController);
                    break;
//                case Option.User.BACK_USER:
//                    System.out.println("Returning to main menu...");
//                    return;
                case Option.User.EXIT_USER:
                    System.out.println("Exiting User menu...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    }

    private static void handleUserService(UserView userView, UserController userController) {
        int user_service_option;
        do {
            user_service_option = userView.menuUserService(); // menu UserService
            switch (user_service_option) {
                case Option.USERSERVICE.ADD_TO_USER:
                    userController.addBankAccountToUser();
                    break;
                case Option.USERSERVICE.REMOVE_FROM_USER:
                    userController.removeBankAccountFromUser();
                    break;
                case Option.USERSERVICE.SHOW_ACCOUNTS:
                    userController.displayAllBankAccountsOfUser();
                    break;
                case Option.USERSERVICE.DISPLAY_USER_INFO:
                    userController.displayUser();
                    break;
                case Option.USERSERVICE.BACK_USER_SERVICE:
                    System.out.println("Returning to User menu...");
                    return;
                case Option.USERSERVICE.EXIT_USERSERVICE:
                    System.out.println("Exiting User Service menu...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    }
}
