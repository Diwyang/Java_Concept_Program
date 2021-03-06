package com.dj.java8.collectors.tolist;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectToListExample2 {

	public static void main(String[] args) {
		Stream<String> vowels2 = Stream.of("A", "E", "I", "O", "U");

		List<String> list = vowels2.collect(Collectors.toCollection(LinkedList::new));

		if(list instanceof LinkedList) {
			System.out.println("Returned list is a instacne of LinkedList");
		}
		System.out.println("stream collect to LinkedList output : " + list);

	}
}
