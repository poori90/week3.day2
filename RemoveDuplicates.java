package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

		public static void main(String[] args) {

	// a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
	
	Set<String> ch = new LinkedHashSet<String>();
	
	
	//b) Initialize an integer variable as count
	int count=0 ;
	
	// c) Split the String into array and iterate over it 
	String[] stringarr = text.split(" ");
	
	//d) Initialize another loop to check whether the word is there in the array
	//e) if it is available then increase and count by 1. 
	for (String eachValue : stringarr) {
		
		ch.add(eachValue);
		count++;
		
	}	
		System.out.println("The No  of times the loops iterates: " + count);
		System.out.println("The Set without Duplciate words are   : "  +  ch) ;

		
	//f) if the count > 1 then replace the word as "" 
		
	//g) Displaying the String without duplicate words	 
       
}
}

