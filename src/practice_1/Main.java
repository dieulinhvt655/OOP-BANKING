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
                            }
                        }

                    }while (bank_account_option != Option.BankAccount.BACK);
            }

        }while (option != Option.EXIT);
    }
}