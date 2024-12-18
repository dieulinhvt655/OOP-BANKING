package practice_1.option;

public class Option {
    public static final int BANK_ACCOUNT = 1;
    public static final int USER = 2;
    public static final int EXIT = 3;

    //option = 1
    public static class BankAccount{
        public static final int ADD_BANKACCOUNT = 1;
        public static final int REMOVE = 2;
        public static final int UPDATE = 3;
        public static final int BANK_SERVICE = 4;
        public static final int EXIT = 5;
        public static final int BACK = 6;
    }
    //option = 4 of option = 1 :)))
    public static class BankService{
        public static final int DEPOSIT = 1;
        public static final int WITHDRAW = 2;
        public static final int TRANSFER = 3;
        public static final int CHECK_BALANCE = 4;
        public static final int EXIT = 5;
        public static final int BACK = 6;
    }
    //option = 2
    public static class User{
        public static final int ADD = 1;
        public static final int REMOVE = 2;
        public static final int UPDATE = 3;
        public static final int USER_SERVICE = 4;
        public static final int EXIT = 5;
    }
    //option = 4 of option = 2 :)))
    public static class USERSERVICE{
        public static final int ADD = 1;
        public static final int REMOVE = 2;
        public static final int SHOW_ACCOUNTS = 3;
        public static final int DISPLAY_USER_INFO = 4;
        public static final int EXIT = 5;
    }

}
