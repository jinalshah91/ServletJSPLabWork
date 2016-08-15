package Lab1;

/**
 *
 * @author Jinal Shah
 */
class Reading {
	private String day;
	private int hour;
	private double temp;
	private double windSpeed;

	public Reading(String line) {

		String[] elements = line.split(", ");

		day = elements[0];
		hour = Integer.valueOf(elements[1]);
		temp = Integer.valueOf(elements[2]);
		windSpeed = Integer.valueOf(elements[3]);

	}

	public String rateTemperature() {

		if (temp < 55) {
			return "cold";
		} else if (temp >= 80) {
			return "hot";
		} else if (temp >= 55 & temp < 65) {
			return "mild";
		} else if (temp >= 65 & temp < 80) {
			return "warm";
		} else {
			return null;
		}
	}

	public String getTime() {
		if (hour == 9)
			return (day + " morning");
		else if (hour == 15)
			return (day + " afternoon");
		else if (hour == 21)
			return (day + " evening");
		else
			return null;
	}

}