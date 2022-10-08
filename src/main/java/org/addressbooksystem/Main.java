package org.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> Book = new ArrayList<>();
    static  Scanner sc = new Scanner(System.in);

    public void addDetails(){
        System.out.println("Create Your Address Book");

        Contact contact = new Contact();

        System.out.println("Enter Your First Name");
        String firstName = sc.nextLine();
        contact.setFirstname(firstName);

        System.out.println("Enter Your Last Name");
        String lastName = sc.nextLine();
        contact.setLastname(lastName);

        System.out.println("Add Your Address Details");
        String address = sc.nextLine();
        contact.setAddress(address);

        System.out.println("Add Your City");
        String city = sc.nextLine();
        contact.setCity(city);

        System.out.println("Add Your State");
        String state = sc.nextLine();
        contact.setState(state);

        System.out.println("Add Your Email Address");
        String email = sc.nextLine();
        contact.setEmail(email);

        System.out.println("Add Your zip");
        int zip = sc.nextInt();
        contact.setZip(zip);

        System.out.println("Add Your Phone Number");
        long phonenumber = sc.nextLong();
        contact.setPhonenumber(phonenumber);

        Book.add(contact);
        System.out.println(Book);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System.");
        Main addressbook = new Main();
        addressbook.addDetails();
    }
}