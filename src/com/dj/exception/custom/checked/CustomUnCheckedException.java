package com.dj.exception.custom.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomUnCheckedException {

	public static void main(String[] args) {

		String fileName = "hello.txt";
		String firstLine;

		try (Scanner file = new Scanner(new File(fileName))) {
			if (file.hasNextLine())
				firstLine = file.nextLine();
		} catch (FileNotFoundException e) {
			if (!isValidFileName(e.getMessage())) {
				throw new InvalidFileNamePatternException2("Expected file name is banks.txt but found " + fileName, e);
			}
		}

	}

	private static boolean isValidFileName(String msg) {

		if (msg.contains("bank.txt")) {
			return true;
		}

		return false;
	}

}
