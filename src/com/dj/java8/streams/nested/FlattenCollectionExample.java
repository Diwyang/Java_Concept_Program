package com.dj.java8.streams.nested;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenCollectionExample {
    public static void main(String[] args) {

        List<List<String>> nestedCollection = new ArrayList<>();

        List<String> strList1 = Arrays.asList("List 1 Str 1", "List 1 Str 2", "List 1 Str 3");

        List<String> strList2 = Arrays.asList("List 2 Str 4", "List 2 Str 5");

        List<String> strList3 = Arrays.asList("List 3 Str 6", "List 3 Str 7", "List 3 Str 8", "List 3 Str 9");

        nestedCollection.add(strList1);
        nestedCollection.add(strList2);
        nestedCollection.add(strList3);

        List<String> flattenList = new ArrayList<>();

        nestedCollection.forEach(flattenList::addAll);

        System.out.println("Flatten List : "+flattenList);




    }
}
