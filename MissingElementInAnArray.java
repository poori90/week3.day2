package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				Integer[] arr = {1,2,3,4,7,6,8};

				// Sort the array
				List<Integer> val = new ArrayList<Integer>();
				val.addAll(Arrays.asList(arr));
				Collections.sort(val);
				
				// loop through the array (start i from arr[0] till the length of the array)

				// check if the iterator variable is not equal to the array values respectively
				for (int i=0; i< val.size(); i++)
				{
					if (val.get(i)!=i+1)
					{
						System.out.println("Missing Element in Array is : " +(i+1));
						break;
					}
						
				}
					
				
					// print the number
					
					// once printed break the iteration
					
				

	}

}
