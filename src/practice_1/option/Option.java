package practice_1.option;

public class Option {
    public static final int BANK_ACCOUNT = 1;
    public static final int USER = 2;
    public static final int EXIT = 3;

    //option = 1
    public static class BankAccount{
        public static final int ADD_BANKACCOUNT = 1;
        public static final int REMOVE_BANKACCOUNT = 2;
        public static final int UPDATE_BANKACCOUNT = 3;
        public static final int BANK_SERVICE = 4;
        public static final int EXIT_BANKACCOUNT = 5;
//        public static final int BACK_BANKACCOUNT = 6;
    }
    //option = 4 of option = 1 :)))
    public static class BankService{
        public static final int DEPOSIT = 1;
        public static final int WITHDRAW = 2;
        public static final int TRANSFER = 3;
        public static final int CHECK_BALANCE = 4;
        public static final int EXIT_BANKSERVICE = 5;
        public static final int BACK_BANKSERVICE = 6;
    }
    //option = 2
    public static class User{
        public static final int CREATE = 1;
        public static final int REMOVE_USER = 2;
        public static final int UPDATE_USER = 3;
        public static final int USER_SERVICE = 4;
        public static final int EXIT_USER = 5;
//        public static final int BACK_USER = 6;
    }
    //option = 4 of option = 2 :)))
    public static class USERSERVICE{
        public static final int ADD_TO_USER = 1;
        public static final int REMOVE_FROM_USER = 2;
        public static final int SHOW_ACCOUNTS = 3;
        public static final int DISPLAY_USER_INFO = 4;
        public static final int EXIT_USERSERVICE = 5;
        public static final int BACK_USER_SERVICE = 6;
    }

}
