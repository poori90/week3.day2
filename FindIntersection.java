package week3.day2;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
		//a) Declare An array for {3,2,11,4,6,7};
		
		
		Integer[] Array1 = { 3, 2, 11, 4, 6, 7 };
		// b) Declare another array for {1,2,8,4,9,7};
		Integer[] Array2 = { 1, 2, 8, 4, 9, 7 };
		
		//c) Declare for loop iterator from 0 to array length	

		HashSet<Integer> set = new HashSet<Integer>();

		set.addAll(Arrays.asList(Array1));

		set.retainAll(Arrays.asList(Array2));

		System.out.println(set);
		
		// d) Declare a nested for another array from 0 to array length
		
		//e) Compare Both the arrays using a condition statement
		
		//f) Print the first array (shoud match item in both arrays)

	}

}
