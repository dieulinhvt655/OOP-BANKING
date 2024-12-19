package practice_1;

import data.Context;
import jdk.javadoc.doclet.Doclet;
import practice_1.controller.BankAccountController;
import practice_1.controller.UserController;
//import practice_1.option.BankAccount;
import practice_1.option.Option;
import practice_1.service.BankService;
import practice_1.service.UserService;
import practice_1.view.BankView;
import practice_1.view.UserView;
import practice_1.view.View;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        Option options = new Option();
        // view
        View view = new View();
        BankView bankView = new BankView();
        UserView userView = new UserView();
        //service
        BankService bankService = new BankService(context);
        UserService userService = new UserService(context);
        //controller
        BankAccountController bankAccountController = new BankAccountController(bankView, bankService);
        UserController userController = new UserController(userView, userService);

        //main code
        int option = 0;
        do {
            option = view.menu();
            switch (option) {
                case Option.BANK_ACCOUNT:
                    int bank_account_option = 0;
                    do {
                        bank_account_option = bankView.menuBank();
                        switch (bank_account_option){
                            case Option.BankAccount.ADD_BANKACCOUNT:{
                                bankAccountController.add();
                                break;
                            }
                            case Option.BankAccount.REMOVE:{
                                bankAccountController.remove();
                                break;
                            }
                            case Option.BankAccount.UPDATE:{
                                bankAccountController.update();
                                break;
                            }
                            case Option.BankAccount.BANK_SERVICE:{
                                int bank_service_option = 0;
                                do {
                                    bank_service_option = bankView.menuBankService();
                                    switch (bank_service_option){
                                        case Option.BankService.DEPOSIT: {
                                            bankAccountController.deposit();
                                            break;
                                        }
                                        case Option.BankService.WITHDRAW: {
                                            bankAccountController.withdraw();
                                            break;
                                        }
                                        case Option.BankService.TRANSFER: {
                                            bankAccountController.transfer();
                                            break;
                                        }
                                        case Option.BankService.CHECK_BALANCE: {
                                            bankAccountController.checkBalance();
                                            break;
                                        }
                                        case Option.BankService.EXIT: {
                                            bank_account_option = bankView.menuBank();
                                        }
                                    }
                                }while (bank_service_option != Option.BankService.BACK);
                            }
                            case Option.BankAccount.EXIT_BANKACCOUNT:{
                                option = view.menu();
                            }
                        }
                    }while (bank_account_option != Option.BankAccount.BACK);
                case Option.USER: {
                    int user_option = 0;
                    do {
                        user_option = userView.menuUser();
                        switch (user_option){
                            case Option.User.ADD: {
                                userController.createUser();
                                break;
                            }
                            case Option.User.REMOVE: {
                                userController.removeUser();
                                break;
                            }
                            case Option.User.UPDATE: {
                                userController.updateUser();
                                break;
                            }
                            case Option.User.USER_SERVICE: {
                                int user_service_option = 0;
                                do {
                                    user_service_option = userView.menuUserService();
                                    switch (user_service_option){
                                        case Option.USERSERVICE.ADD: {
                                            userController.addBankAccountToUser();
                                            break;
                                        }
                                        case Option.USERSERVICE.REMOVE: {
                                            userController.removeBankAccountFromUser();
                                            break;
                                        }
                                        case Option.USERSERVICE.SHOW_ACCOUNTS: {
                                            userController.displayAllBankAccountsOfUser();
                                            break;
                                        }
                                        case Option.USERSERVICE.DISPLAY_USER_INFO: {
                                            userController.displayUser();
                                            break;
                                        }
                                        case Option.USERSERVICE.EXIT: {
                                            user_option = userView.menuUser();
                                        }
                                    }
                                }while (user_service_option != Option.USERSERVICE.BACK_USER_SERVICE);
                            }
                            case Option.User.EXIT: {
                                option = view.menu();
                            }
                        }
                    }while (user_option != Option.User.BACK_USER);
                }
            }
        }while (option != Option.EXIT);
    }
}