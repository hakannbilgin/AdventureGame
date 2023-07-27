package simpleadventuregame.utils;

import java.util.Scanner;

public class PlayerScanner {

	private static Scanner scanner = new Scanner(System.in);

	private PlayerScanner() {

	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static int intScanner() {

		return scanner.nextInt();

	}

	public static String stringScanner() {

		return scanner.next();
	}

	public static char StringToFirstcharScanner() {

		char firstChar = stringScanner().charAt(0);

		return firstChar;

	}

}
