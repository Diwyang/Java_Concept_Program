package com.dj.java8.intstream.toList;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamToListExample2 {

	public static void main(String[] args) {

		IntStream evenIntStream = IntStream.iterate(0, i -> i + 2);

		List<Integer> list = ((Stream<Integer>) evenIntStream.limit(100).boxed()).toList();

		System.out.println("list size : " + list.size());
	}
}
