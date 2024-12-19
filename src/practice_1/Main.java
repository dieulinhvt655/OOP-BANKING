package practice_1;

import data.Context;
import jdk.javadoc.doclet.Doclet;
import practice_1.controller.BankAccountController;
import practice_1.controller.UserController;
//import practice_1.option.BankAccount;
import practice_1.model.BankAccount;
import practice_1.model.User;
import practice_1.option.Option;
import practice_1.service.BankService;
import practice_1.service.UserService;
import practice_1.view.BankView;
import practice_1.view.UserView;
import practice_1.view.View;

import java.util.List;
import java.util.Scanner;

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

                                break;
                            }
                        }

                    }while (bank_account_option != Option.BankAccount.BACK);

                // test case user
                case Option.USER:
                    int user_option = 0;
                    do {
                        user_option = userView.menuUser();
                        switch (user_option){
                            case Option.User.ADD -> {
                                User user = getUser();

                                userService.addUser(user);
                                break;
                            }
                            case Option.User.REMOVE -> {

                                // test find user thay vi remove
                                System.out.println("id :");
                                Scanner scanner = new Scanner(System.in);

                                System.out.println(
                                        userService.findUser(scanner.nextLine())
                                );

                                break;
                            }
                        } 
                    } while (user_option != Option.BankAccount.BACK);
            }

        }while (option != Option.EXIT);
    }

    private static User getUser() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        user.setUserID(scanner.nextLine());
        user.setUserName(scanner.nextLine());
        user.setEmail(scanner.nextLine());
        user.setPhoneNumber(scanner.nextLine());

        BankAccount newBankAccount = new BankAccount(
                user.getPhoneNumber(), user.getUserName(), 0.0, "Saving"
        );

        List<BankAccount> userAccounts = user.getAccounts();
        userAccounts.add(newBankAccount);

        user.setAccounts(userAccounts);
        return user;
    }
}