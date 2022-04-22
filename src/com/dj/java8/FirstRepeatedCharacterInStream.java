package com.dj.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterInStream {

	public static void main(String args[]) {

		System.out.println(""+repeatedChar("Java Love is Awesome"));
		System.out.println(""+repeatedChar("DJ Coding is perfect"));
		System.out.println(""+repeatedChar("Deejay is smart"));
	}
	
	private static Character repeatedChar(String input) {
		return input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
				// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();
	}
}
