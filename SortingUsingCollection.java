package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> values = new ArrayList<String>();
		
		System.out.println("Converting the Array of Elements to String ");
		
		for (String eachData : input) {
			values.add(eachData);
		}
		System.out.println("Printing the Array List using For Each method "+ values);
		int length = values.size();
		
		System.out.println("The Length of the list   : " +length);
		
		Collections.sort(values);
		
		System.out.println("Printing the Sorted list:"  + values);
		
		System.out.println("Printing the Values of ArrayLsit in Reverse Order : ");
		for (int i = length -1 ; i >=0; i-- ) {
			System.out.println( values.get(i));
		}
		
	}

}
