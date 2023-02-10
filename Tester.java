package com.cogent.codePractice1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodePractice1 C = new CodePractice1();
		C.biggerNumberAmongTwo(2.5f, 65.2f);
		C.swapTwoNumbers(56.5f, 12.3f);
		C.swapWithoutUsingThirdVariable(23.4f, 45.5f);
		C.EvenOrOdd(67);
		C.EvenOrOdd(654);
		C.biggerOfThreeNumbers(22.5f, 55.5f, 456.12f);
		C.vowelOrConsonant('f');
		C.vowelOrConsonant('u');
		
		System.out.println("::::::::::::::::::::");
		
		int[] array = {135, 76, 46, 5, 214, 96, 11, 32};
		C.minAndMax(array);
		
		System.out.println("::::::::::::::::::::");
		
		C.anagramCheck("Abhinav", "bhnaviA");
		C.anagramCheck("Abhi", "Harroop");
	}

}
