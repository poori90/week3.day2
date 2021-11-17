package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		//1) Arrange the array in ascending order
		List<Integer> val = new ArrayList<Integer>();
		val = Arrays.asList(data);
		Collections.sort(val);
		
		// 2) Pick the	 2nd element from the last and print it
		
		System.out.println("The Second Largest Number is " + val.get(val.size() - 2));
	}

}
