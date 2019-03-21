package ArrayResized;

import java.util.Scanner;

public class Main {

	private static Scanner s  = new Scanner(System.in);
	private static int[] baseData = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 10 integers: ");
		getInput();
		printArray(baseData);
		resizeArray();
//		System.out.println("Enter 12 integers: ");
//		getInput();
		baseData[10]=101;
		baseData[11]=111;
		printArray(baseData);		
	}

	
	
	public static void getInput() {
		
		for (int i=0; i<baseData.length; i++) {
			baseData[i] = s.nextInt(); 
		}
	}
	
	public static void printArray (int array[]) 
	{
		for (int i=0; i<array.length; i++) { 
			 System.out.print(array[i] + " ");
		}
			System.out.println();		
	}
	
	public static void resizeArray() {
		int[] original = baseData;
		
		baseData = new int[12];
		
		for (int i=0; i<original.length; i++) {
			baseData[i] = original[i];
		}
		
	}
}
