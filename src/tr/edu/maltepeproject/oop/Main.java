package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Username: ");
        userName = inp.nextLine();

        System.out.print("password: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Login successful");

        } else if (!(userName.equals("patika")) && !(password.equals("java123"))){
            System.out.println("Incorrect Username and password. Please try again. ");

        } else if (!(userName.equals("patika")) && (password.equals("java123"))){
            System.out.println("Incorrect Username. Please check your Username.");

        } else if ((userName.equals("patika")) && !(password.equals("java123"))){
            System.out.println("Incorrect password.");
            System.out.println("Forget your password?\n To reset your password press 'R'.\n To leave the Log-in page press 'Q'.");
            System.out.println("Selection: ");
            select = inp.nextLine();

            if ( select.equals("R") || select.equals("r") ){
                System.out.print("Enter your new password(must be different from previous password): ");
                newPassword = inp.nextLine();

                if (!newPassword.equals("java123")){
                    password = newPassword;
                    System.out.println("Password changed successfully. ");
                    System.out.print("Username: ");
                    userName = inp.nextLine();

                    System.out.print("password: ");
                    password = inp.nextLine();

                    if (userName.equals("patika") && password.equals(newPassword)){
                        System.out.println("Login successful");

                    } else {
                        System.out.println("Incorrect password!!");
                    }

                } else {
                    System.out.println("New password can not be same with previous password!!! ");
                }
            } else if (select.equals("Q") || select.equals("q")){
                System.out.print("Disconnected from Login page. Have a nice day! ");

            } else {
                System.out.println("Pressed wrong key!!! Please select from given keys 'E' and 'Q'. ");
            }
        }

    }
}
