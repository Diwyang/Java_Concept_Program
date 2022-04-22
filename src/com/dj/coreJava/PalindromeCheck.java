package com.dj.coreJava;

public class PalindromeCheck {

	public static void main(String args[]) {
		System.out.println("Is axa palindrom?: " + isPalindromString("axa"));
		System.out.println("Is Level palindrom?: " + isPalindromString("Level"));
		System.out.println("Is A dog! A panic in a pagoda. palindrom?: " + isPalindromString("A dog! A panic in a pagoda."));
		System.out.println("Is Rotavator palindrom?: " + isPalindromString("Rotavator"));
	}

	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

}
