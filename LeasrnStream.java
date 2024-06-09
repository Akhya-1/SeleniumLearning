package com.ibm.Akhya;
import java.util.*;

public class LeasrnStream {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Find the sum of all elements
		int sum = numbers.stream().mapToInt(num -> num).sum();
		System.out.println("Sum of all elements: " + sum);

		// Filter the list to find only the even numbers
		System.out.print("Even numbers: ");
		numbers.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
		//numbers.stream().filter(num -> num % 2 == 0).System.out.print(num + " ");
		//System.out.println();

		// Use the map operation to double each element in the list
		System.out.print("Doubled elements: ");
		numbers.stream().map(num -> num * 2).forEach(num -> System.out.print(num + " "));
		//System.out.println();

		// Find the maximum and minimum values in the list using streams
		// Find the maximum value in the list
		// Find the maximum value in the list;
		int max = numbers.stream().mapToInt(num -> num).max().orElse(0);
		// Find the minimum value in the list
		int min = numbers.stream().mapToInt(num -> num).min().orElse(0);

		System.out.println("Maximum value: " + max);



		

	}

}
