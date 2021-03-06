package com.dj.java8.compare.set;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoSetsInJava8 {

    public static void main(String[] args) {

        Set<Integer> sectionAMarks = new HashSet<>();

        sectionAMarks.add(100);
        sectionAMarks.add(99);
        sectionAMarks.add(98);
        sectionAMarks.add(97);
        sectionAMarks.add(96);

        System.out.println("Section A marks : " + sectionAMarks);

        Set<Integer> sectionBMarks = new HashSet<>();

        sectionBMarks.add(96);
        sectionBMarks.add(97);
        sectionBMarks.add(98);
        sectionBMarks.add(99);
        sectionBMarks.add(100);

        System.out.println("Section B marks : " + sectionBMarks);

        boolean anySectionAMarksMatchesWithSecBMarks = sectionAMarks.stream().anyMatch(marks -> sectionBMarks.contains(marks));

        boolean noSectionAMarksMatchesWithSecBMarks = sectionAMarks.stream().noneMatch(marks -> sectionBMarks.contains(marks));

        boolean allSectionAMarksMatchesWithSecBMarks = sectionAMarks.stream().allMatch(marks -> sectionBMarks.contains(marks));

        System.out.println("Comparing the section A marks matches with the following cases");

        System.out.println("If any one marks matches with the section b marks: " + anySectionAMarksMatchesWithSecBMarks);

        System.out.println("If no marks matches with the section b marks: " + noSectionAMarksMatchesWithSecBMarks);

        System.out.println("If all matches with the section b marks: " + allSectionAMarksMatchesWithSecBMarks);

    }
}
