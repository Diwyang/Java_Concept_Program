package com.dj.java8.streams.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstParallelExample {

	public static void main(String[] args) {

		// creating a list with string values
		List<String> values = Arrays.asList("A", "B", "C", "F", "D");

		// Getting the first value from sequential stream using findFirst() method
		Optional<String> anyValue = values.stream().parallel().findFirst();

		// printing the value
		if (anyValue.isPresent()) {
			System.out.println("First value from parallel stream : " + anyValue.get());
		} else {
			System.out.println("No value presnt in the stream.");
		}
	}
}
