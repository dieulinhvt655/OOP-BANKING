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
        try{
            FileInputStream fileIn = new FileInputStream("storage/db.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileIn);
            Context context = (Context) objectInputStream.readObject();
            this.bankAccounts = context.bankAccounts;
            this.users = context.users;
            objectInputStream.close();
            fileIn.close();
            System.out.println("Load database success.");
        }catch (EOFException exception){
            System.out.println("Database is empty.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data.");
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
