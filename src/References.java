import java.util.Arrays;

public class References {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue = "+ myIntValue);
		System.out.println("anotherIntValue = "+ anotherIntValue);
				
		anotherIntValue = myIntValue++;
		System.out.println("myIntValue = "+ myIntValue);
		System.out.println("anotherIntValue = "+ anotherIntValue);
		
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray :" + Arrays.toString(myIntArray));
		System.out.println("anotherArray :" + Arrays.toString(anotherArray));
		
		anotherArray[0] = 1;
		
		System.out.println("after change myIntArray :" + Arrays.toString(myIntArray));
		System.out.println("after change anotherArray :" + Arrays.toString(anotherArray));
		
	}

}
