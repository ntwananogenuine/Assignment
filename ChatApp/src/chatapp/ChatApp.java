package chatapp;

import java.util.Scanner;

public class ChatApp {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Login login = new Login();
     
     
     System.out.println("Register a new user: ");
     System.out.print("Enter a username: ");
     String username = scanner.nextLine();
     System.out.print("Enter your password: ");
     String password = scanner.nextLine();
     System.out.print("Enter South African (+27...):");
     String phone = scanner.nextLine();
     
     String regMsg = login.registerUser(username, password, phone);
     
     System.out.println(regMsg);
     System.out.println("\nNow login: ");
     System.out.print("Enter your username: ");
     String loginUser = scanner.nextLine();
     System.out.print("Enter your password: ");
     String loginPass = scanner.nextLine();
     
     boolean isLoggedIn = login.loginUser(loginUser, loginPass);
     System.out.print("Enter your first name: ");
     String fname = scanner.nextLine();
     System.out.print("Enter your last name: ");
     String lname = scanner.nextLine();
     
     System.out.println(login.returnLoginStatus(isLoggedIn, fname, lname));
     
    if (isLoggedIn) { 
     Message      
         msg = new Message("+27634897463", "Hello, how are you doing?");
     System.out.println("\nMessage created...");
     System.out.println(msg.displayMessageStatus());
     
     msg.markAsReceived();
     System.out.println(msg.displayMessageStatus());
     
     
     msg.markAsRead();
     System.out.println(msg.displayMessageStatus());
    }
     
     scanner.close();
    }
}
