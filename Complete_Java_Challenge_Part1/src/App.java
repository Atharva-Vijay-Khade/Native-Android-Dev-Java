import java.util.Scanner;

import DataBase.DataBase;

public class App {
    public static void main(String[] args) {

        DataBase database = DataBase.getInstance();

        database.addUser("atharva", "1595505");
        database.addUser("rahul", "2323234");
        database.addUser("sham", "3084039850");
        database.addUser("Ben", "15912125505");
        database.addUser("John", "232121213234");
        database.addUser("Tom", "30841212039850");

        database.addUserContactInfo("atharva", "rahul", "2323234");
        database.addUserContactInfo("atharva", "sham", "3084039850");
        database.addUserContactInfo("atharva", "Ben", "15912125505");
        database.addUserContactInfo("atharva", "John", "232121213234");
        database.addUserContactInfo("rahul", "sham", "3084039850");
        database.addUserContactInfo("rahul", "atharva", "1595505");

        database.addUserMessageInfo("atharva", "sham:3084039850", "hello hi");
        database.addUserMessageInfo("atharva", "John", "hello");
        database.addUserMessageInfo("atharva", "rahul", "hello hi");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scanner.next();

        System.out.println("Hello " + username);

        int choice;

        while (true) {

            App.showMainMenue();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Enter valid choice");
                continue;
            } else {
                if (choice == 3) {
                    System.out.println("Exiting Mobile");
                    break;
                } else if (choice == 1) {
                    App.manageContacts(username, database);
                } else if (choice == 2) {
                    App.manageMessages(username, database);
                } else {
                    continue;
                }
            }

        }

    }

    public static void showContactsOptions() {
        System.out.println("\t\t1. Show all contacts");
        System.out.println("\t\t2. Add a new contact");
        System.out.println("\t\t3. Search for a contact");
        System.out.println("\t\t4. Delete a contact");
        System.out.println("\t\t5. Go back to previous section");
    }

    public static void showMessageOptions() {
        System.out.println("\t\t1. See the list of all messages");
        System.out.println("\t\t2. Send a new message");
        System.out.println("\t\t3. Go back to previous menue");
    }

    public static void showMainMenue() {
        System.out.println("\t\t1. Manage Contacts");
        System.out.println("\t\t2. Messages");
        System.out.println("\t\t3. Quit");
    }

    public static void manageContacts(String username, DataBase database) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            App.showContactsOptions();
            choice = scanner.nextInt();
            if (choice == 5)
                return;
            else if (choice == 1) {
                database.printUserContactList(username);
            } else if (choice == 2) {
                String newname;
                String number;
                System.out.println("enter the new username to add to contact");
                newname = scanner.next();
                System.out.println("enter the new contact number of the new username added");
                number = scanner.next();
                database.addUserContactInfo(username, newname, number);
                System.out.println("Added, new contact list is :");
                database.printUserContactList(username);
            } else if (choice == 4) {
                System.out.println("enter the name to delete the contact");
                String name = scanner.next();
                database.DeleteContact(username, name);
                System.out.println("deleted, new contact list is :");
                database.printUserContactList(username);
            } else if (choice == 3) {
                System.out.println("enter the name to search the contact");
                String name = scanner.next();
                if (database.searchForContact(username, name))
                    System.out.println("Found");
                else
                    System.out.println("Not Found");
            }
            continue;
        }
    }

    private static void manageMessages(String username, DataBase database) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            App.showMessageOptions();
            choice = scanner.nextInt();
            if (choice == 3)
                return;
            else if (choice == 1) {
                database.printUserMessageList(username);
            } else if (choice == 2) {
                String newname;
                String message;
                System.out.println("enter the username to send message");
                newname = scanner.next();
                System.out.println("enter the message");
                message = scanner.next();
                database.SendMessage(username, newname, message);
                System.out.println("Message Sent");
            }
            continue;
        }
    }

}
