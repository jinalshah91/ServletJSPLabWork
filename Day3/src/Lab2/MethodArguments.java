package Lab2;

public class MethodArguments {

	private static String[] VALUES = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten" };

	public static void main(String[] args) {
		System.out.println(addUp(3.2, 2.2));
		System.out.println(addUp(1, 4));
		System.out.println(addUp("one", "three"));
		System.out.println(addUp(2, 3.5));
		System.out.println(addUp(1, "Three"));

	}

	public static int addUp(int args1, int args2) {
		System.out.println("Int version being called");
		return args1 + args2;
	}

	public static double addUp(double args1, double args2) {
		System.out.println("Double version being called");
		return args1 + args2;
	}

	public static int addUp(String args1, String args2) {
		System.out.println("String version being called");
		return toNumber(args1) + toNumber(args2);
	}

	public static int addUp(int args1, String args2) {
		System.out.println("Int,String version being called");
		return (args1 + toNumber(args2));
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