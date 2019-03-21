package ArayListChallenge01;

import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);	
	private static MobilePhone mobilphone = new MobilePhone("9944 234 801");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a program that implements a simple mobile phone with the following capabilities.
		// Able to store, remove, modify and query contact names.
		// You will want to create a separate class for Contacts (name and phone number)
		// Create a master class (MobilePhone) that holds the ArrayList of Contacts
		// The MobilePhone class has the functionality listed above.
		// Add a menu of options that are available.
		// Option: Quit, print list of contacts, add new contact, update exiting contact, remove contact
		// and search/find contact
		// When adding or updating be sure to check if the contact already exists (use name)
		// Be sure not to expose the inner working on the ArrayList to MobilePhone
		//e.g. no ints, no .get(i) etc
		// MobilePhone should to everything with Contact objects only.
		//		
		
		
		boolean quit = false;
		startPhone();
		printActions();
		while (!quit) {
			System.out.println("\nEnter action: (6 to show available actions.)");
			int action = s.nextInt();
			s.nextLine();
			
			switch (action) {
				case 0:
					System.out.println("\nShutting down....");
					quit=true;
					break;
				
				case 1:
					mobilphone.printContacts();		
					break;
				
				case 2:
					addNewContact();
					break;
				
				case 3:
					updateContact();
					break;
					
				case 4: 
					removeContact();
					break;
					
				case 5:
					queryContact();
					break;
					
				case 6:
					printActions();
					break;
				
			}
			
		}		
	}
	
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = s.nextLine();
		System.out.println("Enter phone number: ");
		String phone = s.nextLine();
		
		Contact newContact = Contact.createContact(name, phone);  // This code doesn't need "new" (to create a new instance) to make reference for Contact createContact  
																  // since inContact class method createContact was set as "public static"
		if (mobilphone.addNewContact(newContact)) {
			System.out.println("New contact added: Name " + name + ", phone " + phone);
		} else {
			 System.out.println("Cannot add" + name + " already on file.");
		}
	}
	
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingContactRecord = mobilphone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}  
		System.out.println("Enter new contact name: ");
		String newName = s.nextLine();
		System.out.println("Enter new contact phone number: ");
		String newPhone = s.nextLine();
		
		Contact newContact = Contact.createContact(newName, newPhone);
		
		if (mobilphone.updateContact(existingContactRecord, newContact)){
			System.out.println("Successfuly updated record.");
		} else {
			System.out.println("Error updating record.");
		}
	}
		
	
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingContactRecord = mobilphone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		} 
		if (mobilphone.removeContact(existingContactRecord)) {
			System.out.println("Record successfully deleted.");
		} else {
			System.out.println("Error deleting contact.");
		}
	}
	
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingContactRecord = mobilphone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}		
		System.out.println("Name: " + existingContactRecord.getName() + " phone number is: " + existingContactRecord.getPhoneNumber());	
	}
	
	
	
		
	
	private static void startPhone() {
		System.out.println("Starting phone...");
	}
	
	private static void printActions() {
		System.out.println("\nAvailable action: \npress");
		System.out.println("0 - to shutdown\n" +
						   "1 - to print contact\n" + 
						   "2 - to add new contact\n" +
						   "3 - to update existing contact\n" +
						   "4 - to remove contact\n" +
						   "5 - query if an existing contact exists\n" +
						   "6 - to print a list of available contacts");
		
		System.out.println("Choose your option:");
	}

}
