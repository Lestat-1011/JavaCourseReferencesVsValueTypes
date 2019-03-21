package linkedList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("Tim", 45.34);
		Customer anothercustomer;
		anothercustomer = customer;
		anothercustomer.setBalance(12.24);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(34);
		intList.add(55);
			
		for (int i=0; i< intList.size(); i++) {
			System.out.println((i+1) + ": " + intList.get(i) );
		}
		
		intList.add(1,2);
		
		for (int i=0; i< intList.size(); i++) {
			System.out.println((i+1) + ": " + intList.get(i) );
		}
		
	}

}
