package com.dj.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapVsFlatMapSample {

	public static void main(String[] args) {
		Map<String, List<String>> user = new HashMap<>();
		
		user.put("John", Arrays.asList("555-1123", "555-3389"));
		user.put("Mary", Arrays.asList("555-2243", "555-5264"));
		user.put("Steve", Arrays.asList("555-6654", "555-3242"));

		List<String> names = user.keySet().stream()
		  .map(String::toUpperCase)
		  .collect(Collectors.toList());
		System.out.print(names);

		List<String> phones = user.values().stream()
		  .flatMap(Collection::stream)
		  .collect(Collectors.toList());
		System.out.println(phones);

	}

}
