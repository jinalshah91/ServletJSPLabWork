package Lab3;

public class MethodVArguments {

	private static String[] VALUES = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten" };

	public static void main(String[] args) {
		System.out.println(addUp(3.2, 2.2,5.9));
		System.out.println(addUp(3, 4,5));
		System.out.println(addUp("Eigth","One", "Three"));
		System.out.println(addUp(2, 3.5,59));
		System.out.println(addUp(1));

	}

	public static int addUp(int... args) {
		System.out.println("Int version being called");
		int sum =0;
		for (int i : args) {
			sum +=i;
		}
		return sum;
	}

	public static double addUp(double... args) {
		System.out.println("Double version being called");
		double sum =0;
		for (double i : args) {
			sum +=i;
		}
		return sum;
	}

	public static int addUp(String... args) {
		System.out.println("String version being called");
		int sum =0;
		for (String str : args) {
			sum +=toNumber(str);
		}
		return sum;
	}



	private static int toNumber(String str) {
		int digit = 0;
		switch (str) {
		case "Zero":
			digit = 0;
			break;
		case "One":
			digit = 1;
			break;
		case "Two":
			digit = 2;
			break;
		case "Three":
			digit = 3;
			break;
		case "Four":
			digit = 4;
			break;
		case "Five":
			digit = 5;
			break;
		case "Six":
			digit = 6;
			break;
		case "Seven":
			digit = 7;
			break;
		case "Eight":
			digit = 8;
			break;
		case "Nine":
			digit = 9;
			break;
		case "Ten":
			digit = 10;
			break;
		}
		return digit;
	}

}