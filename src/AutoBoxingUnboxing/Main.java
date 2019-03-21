package AutoBoxingUnboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
	
	int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
	
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArayLIst = new ArrayList<String>();
		strArayLIst.add("Tim");
		
		
		//Line below is not valid since Int is a primitive value and cannot be used directly 
		//in an ArrayList in order to fix this Java allows user to use a Class like as parameter of an ArrayList
		//ArrayList<Int> intArrayList = new ArrayList<Int>(); 
		
	
		//Look at IntClass which will let use us implement Integer as part of an ArrayList
		
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();		
		intClassArrayList.add(new IntClass(54));
		
		
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.34);
		
		
		
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//		for (int i=0; i<=10; i++) {
//			intArrayList.add(Integer.valueOf(i));
//		}
//		
//		for (int i=0; i<=10; i++) {
//			System.out.println(i + "--> " + intArrayList.get(i).intValue());
//		}
		
		Integer myIntValue = 56; // Integer.valueOf(56);
		int myInt =   myIntValue;  //myIntValue.intValue(); 
		
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for (double dbl=0.0; dbl< 10.0; dbl +=0.5) {
			myDoubleValues.add((dbl)); // myDoubleValues.add(Double.valueOf(dbl)); both lines are the same, 
										//user is able to not used some info which is implemented by Java automatically behind scenes
		}
		
		for (int i=0; i<myDoubleValues.size(); i++) {
			double value = myDoubleValues.get(i);   //double value = myDoubleValues.get(i).doubleValue();  both lines are the same
													//user is able to not used some info which is implemented by Java automatically behind scenes
			System.out.println( (i + 1) + " --> " + value);}			
		}
}
