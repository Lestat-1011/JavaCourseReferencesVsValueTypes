package AutoBoxingUnboxingChallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Your job is to create a simple banking application.
		//There should be a Bank class
		//It should have an ArrayList of Branches
		//Each branch should have an ArrayList of Customers
		//The Customer class should have an ArrayList of Doubles (transactions)
		//Customer:
		//Name, and the ArrayList of doubles
		//Branch: 
		//Need to be able to add a new customer and initial transaction amount.
		//Also needs to add additional transactions for the customer/branch
		//Bank: 
		//Add a new branch
		//Add a customer to that branch with initial transaction
		//Add a transaction for an existing customer for that branch 
		//Show a list of customers for a particular branch and optionally a list of their transactions
		//Demonstration autoboxing and unboxing in your code
		//Hint: Transactions
		//Add data validation
		//e.g. check if exists, or does not exist, etc.
		//Think where you are adding the code for certain actions
		//

		
		Bank bank = new Bank("National Australia Bank");
		
		if ( bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch created.");
		}
		
		bank.addCustomer("Adelaide", "Tim", 11.12);
		bank.addCustomer("Adelaide", "Mike", 44.21);
		bank.addCustomer("Adelaide", "Percy", 111.44);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Bob", 222.64);
		
		
		bank.addCustomerTransaction("Adelaide", "Tim", 45.52);
		bank.addCustomerTransaction("Adelaide", "Mike", 498.45);
		bank.addCustomerTransaction("Adelaide", "Percy", 25.90);
		
		bank.listCustomers("Adelaide", true);
		bank.listCustomers("Sydney", true);
		
		bank.addBranch("Melbourne");
		
		if(!bank.addCustomer("Melbourne", "Brian", 555.34)) {
			System.out.println("Error Melbourne branch does not exist.");
		}
		
		if(!bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch already exists.");
		}
		
		if (!bank.addCustomerTransaction("Adelaide", "John", 22.22)) {
			System.out.println("Customer does not exist at branch.");
		}
		
		
		if(!bank.addCustomer("Adelaide", "Tim", 555.34)) {
			System.out.println("Customer Tim already exists.");
		}
		
	}

}
