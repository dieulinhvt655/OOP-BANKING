package practice_1.view;

import practice_1.view.component.Input;

public class View {
    public int menu() {
        System.out.println("----------------------");
        System.out.println("Menu");
        System.out.println("----------------------");
        System.out.println("1. Bank Account");
        System.out.println("2. User");
        System.out.println("3. Exit");
        System.out.println("----------------------");
        return Input.enterNumber("Choose an option: ", "Invalid value", 1, 3);
    }
}
