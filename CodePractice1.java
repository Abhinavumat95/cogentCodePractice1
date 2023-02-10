package com.cogent.codePractice1;

import java.util.Arrays;

public class CodePractice1 {
	
	void biggerNumberAmongTwo(float a, float b) {
		//Find Bigger number among two 
		if(a < b) {
			System.out.println("b is bigger than a.");
		}else {
			System.out.println("a is bigger than b.");
		}
	}

	void swapTwoNumbers(float a, float b) {
		//Swap two number 
		float c;
		c = a;
		a = b;
		b = c;
		System.out.println("a = "+a + " " + "b = "+b);
	}
	
	void swapWithoutUsingThirdVariable(float a, float b) {
		//Swap two numbers without using extra variable 
		a = a + b;
		b = a - b; 
		a = a - b;
		System.out.println("a = "+a + " " + "b = "+b);
	}
	
	void EvenOrOdd(int c) {
		//Check number is even or odd using ternary operator
		String result = (c % 2 == 0) ? "Number is Even" : "Number is Odd"; 
		System.out.println(result);
	}
	
	void biggerOfThreeNumbers(float a, float b, float c) {
		//Find Bigger number among three numbers
		
		if(a > b) {
			if(a > c) {
				System.out.println("a is bigger than b and c.");
			}else {
				System.out.println("c is bigger than a and b.");
			}
		}else {
			if(b > c) {
				System.out.println("b is bigger than a and c.");
			}else {
				System.out.println("c is bigger than a and b.");
			}
		}
		
	}
	
	void vowelOrConsonant(char Ch) {
		//Find a character is vowel or consonant
		if(Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
			System.out.println("Character is a Vowel.");
		}else {
			System.out.println("Character is a Consonant.");
		}
	}
	
	void minAndMax(int array[]) {
		//Write a method that accepts an array and return the second min and max number.
		int n = array.length;
		Arrays.sort(array);
		System.out.println("Second Minimum mumber is = "+array[1]);
		System.out.println("Maximum mumber is = "+array[n - 1]);
	}
	
	void anagramCheck(String a, String b) {
		//Write a method that accepts two string arguments and returns true if they are anagram and false if they 
		//are not. An anagram is when all the letters in one string exist in another but the order of letters 
		//does not matter.
		
		char[] aArray = a.toCharArray();
	    char[] bArray = b.toCharArray();
	    
	    Arrays.sort(aArray);
	    Arrays.sort(bArray);
	    
	    if(Arrays.equals(aArray, bArray)) {
	    	System.out.println("Two Strings are an Anagram.");
	    }else {
	    	System.out.println("Two Strings are not an Anagram.");
	    }
	}
	
}
