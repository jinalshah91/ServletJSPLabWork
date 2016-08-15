package Lab1;

import java.util.Scanner;

/**
 * Created by jinashah on 8/3/2016.
 */
public class ZellersCongruence {
	Scanner sc = new Scanner(System.in);

	private static String getDay(int day, int month, int year) {
		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}

		int a = (int) (13 * ((double) month + 1) / 5);
		int b = (int) ((double) year / 4);
		int c = 6 * (int) (((double) year / 100));
		int d = (int) ((double) year / 400);
		int total = a + b + c + d + day + year;
		int result = total % 7;
		switch (result) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 0:
			return "Saturday";
		}
		return null;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean timeToQuit = false;
		String input;
		int day = 0, month = 0, year = 0;
		while (!timeToQuit) {
			System.out.println("Please enter the day");
			input = sc.nextLine();
			day = Integer.valueOf(input);
			System.out.println("Please enter the month");
			input = sc.nextLine();
			month = Integer.valueOf(input);
			System.out.println("Please enter the year");
			input = sc.nextLine();
			year = Integer.valueOf(input);
			System.out.println("The Day is : " + getDay(day, month, year));
			System.out.println("Type 'Quit' to exit. or Press any key to continue...");
			input = sc.nextLine();
			timeToQuit = checkExit(input);
		}
	}

	public static boolean checkExit(String input) {
		return "quit".equalsIgnoreCase(input);
	}
}
