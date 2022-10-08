package org.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> Book = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addDetails() {
        System.out.println("Create Your Address Book");

        System.out.println("Enter the number of books you want to create: ");
        int num_of_book = sc.nextInt();

        for (int i = 0; i < num_of_book; i++) {
            Contact contact = new Contact();

            System.out.println("Enter Your First Name : ");
            String firstName = sc.next();
            contact.setFirstname(firstName);

            System.out.println("Enter Your Last Name : ");
            String lastName = sc.next();
            contact.setLastname(lastName);

            System.out.println("Add Your Address Details : ");
            String address = sc.next();
            contact.setAddress(address);

            System.out.println("Add Your City : ");
            String city = sc.next();
            contact.setCity(city);

            System.out.println("Add Your State : ");
            String state = sc.next();
            contact.setState(state);

            System.out.println("Add Your Email Address : ");
            String email = sc.next();
            contact.setEmail(email);

            System.out.println("Add Your zip");
            int zip = sc.nextInt();
            contact.setZip(zip);

            System.out.println("Add Your Phone Number");
            long phonenumber = sc.nextLong();
            contact.setPhonenumber(phonenumber);

            Book.add(contact);
        }
    }

    public void editDetails() {

        System.out.println("Enter the name whose details you want to edit ");
        String name = sc.next();

        for (int i = 0; i < Book.size(); i++) {
            if (Book.get(i).getFirstname().equals(name)) {
                System.out.println("Select form below, to change: ");
                System.out.println(
                        "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email" +
                                "\n7.Zip\n8.Phone number");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter first name");
                        Book.get(i).setFirstname(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name");
                        Book.get(i).setLastname(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter address");
                        Book.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter city");
                        Book.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter state");
                        Book.get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter email");
                        Book.get(i).setEmail(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter Zip");
                        Book.get(i).setZip(sc.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter phone number");
                        Book.get(i).setPhonenumber(sc.nextInt());
                        break;
                }
            } else {
                System.out.println("Enter the valid or existing name");
            }
        }
    }

    public void Display() {
        System.out.println(Book);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System.");
        Main addressbook = new Main();

        while (true) {
            System.out.println("1.AddDetails\t3:Edit Detaild\t2:Display");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressbook.addDetails();
                    break;
                case 2:
                    addressbook.editDetails();
                    break;
                case 3:
                    addressbook.Display();
                    break;
            }
        }
    }
}