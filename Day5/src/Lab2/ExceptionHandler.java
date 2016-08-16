package Lab2;

import java.util.Scanner;

public class ExceptionHandler {

	public enum MONTHS {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMER, DECEMEBER;
	}

	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean verify(String month, int day) throws BadMonth, BadDay {
		boolean isValid = false;
		try {
			MONTHS mon = MONTHS.valueOf(month);
			if (days[mon.ordinal()] != day) {
				throw new BadDay("BadDay Exception. Please enter the valid number of days.");
			}
		} catch (Exception e) {
			throw new BadMonth(e);
		}
		isValid = true;
		return isValid;
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Please enter the month name: ");
			Scanner sc = new Scanner(System.in);
			String month = sc.nextLine();
			System.out.println("Please enter the day of that month: ");
			int day = sc.nextInt();
			try {
				if (verify(month, day)) {
					System.out.println("Entered combinations are vaild!!!");
					break;

				} else {
					System.out.println("Please try again");
				}
			} catch (BadMonth e) {
				// TODO: handle exception
				System.out.println(e.getCause());
			} catch (BadDay e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Oops... Someting went wrong!! Try again!");
				e.printStackTrace();
			}
		}

	}
}
