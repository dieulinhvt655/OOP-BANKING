package practice_1.view.component;

import java.util.Scanner;

    public class Input {
        public static int enterNumber(String message, String error, int min, int max) {
            System.out.print(message + ": ");
            Scanner scanner = new Scanner(System.in);
            try{
                int option = scanner.nextInt();
                    if ( option < min || option > max) {
                    System.out.println("Error: "+error);
                    return enterNumber(message, error, min, max);
                }
                return option;
            }
            catch(Exception exception) {
                System.out.println("Error: " + error);
                return enterNumber(message, error, min, max);
            }
        }

        public static Double enterANumber(String message){
            System.out.println(message + ": ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }

        public static String enterAString(String message) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(message + ": ");
            String input = scanner.nextLine();
            return input;
        }

    }
