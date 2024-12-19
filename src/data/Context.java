package data;

import practice_1.model.BankAccount;
import practice_1.model.User;

import java.io.*;
import java.util.ArrayList;

public class Context implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public Context() {
        File storageFile = new File("storage/db.bin");
        if (!storageFile.exists()) {
            System.out.println("Database file not found. Initializing new context.");
            return;
        }

        try (FileInputStream fileIn = new FileInputStream(storageFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileIn)) {
            Context context = (Context) objectInputStream.readObject();
            this.bankAccounts = context.bankAccounts;
            this.users = context.users;
            System.out.println("Load database success.");

        } catch (EOFException e) {
            System.out.println("Database is empty. Initializing new context.");
            this.bankAccounts = new ArrayList<>();
            this.users = new ArrayList<>();
        } catch (WriteAbortedException e) {
            System.out.println("Corrupted database file. Creating new context.");
            e.printStackTrace();
            this.bankAccounts = new ArrayList<>();
            this.users = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data. Initializing new context.");
            e.printStackTrace();
            this.bankAccounts = new ArrayList<>();
            this.users = new ArrayList<>();
        }
    }

    public void saveChange(){
        try{
            FileOutputStream fileOut = new FileOutputStream("storage/db.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
            objectOutputStream.writeObject(this);
            fileOut.close();
            objectOutputStream.close();
        }catch (FileNotFoundException exception){
            System.out.println("Error: save change fail. database not found");
        }catch (IOException exception){
            System.out.println("Error: save change fail.");
            exception.getMessage();
        }
    }

    public ArrayList<BankAccount> getBankAccounts(){
        return bankAccounts;
    }
    public ArrayList<User> getUsers(){
        return users;
    }
}
