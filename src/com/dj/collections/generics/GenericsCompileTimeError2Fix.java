package com.dj.collections.generics;

import java.util.Map;
import java.util.TreeMap;

import com.dj.models.Employee;

public class GenericsCompileTimeError2Fix {

	public static void main(String[] args) {
		
		Map<Employee, Boolean> integers = null;
		
		integers = new TreeMap<Employee, Boolean>();
	}
}
