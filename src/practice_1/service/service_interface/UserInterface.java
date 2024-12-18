package practice_1.service.service_interface;

public interface UserInterface {

    void createUser();

    void updateUser(String userID);

    void removeUser(String userID);

    void addBankAccountToUser(String userID);

    void removeBankAccountFromUser(String userID);

    void displayAllBankAccounts(String userId);

    void displayUser(String userId);
}
