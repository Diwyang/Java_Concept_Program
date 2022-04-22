package com.dj.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAllTheValuesInList {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
              .sorted()
              .forEach(System.out::println);
        
        System.out.println("In Descending Order");
        myList.stream()
        .sorted(Collections.reverseOrder())
        .forEach(System.out::println);

	}

}
