package com.dj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

	public static void main(String[] args) {
		List<String> users = Arrays.asList("David", "Jack", "Duke", "Jill", "Dany", "Julia", "Peter");

		Optional<String> findFirst = users.parallelStream().filter(s -> s.startsWith("D")).findFirst();
		Optional<String> findAny = users.parallelStream().filter(s -> s.startsWith("D")).findAny();

		System.out.println(findFirst.get()); //Always print David
		System.out.println(findAny.get()); //Print David or Duke or Dany

	}

}
