package Lab1;

public class TrafficCamera implements Photographer {
	public void prepareScene() {
		System.out.println("Checking the signal lights!!!");
	}

	public String takePhotograph() {
		return "Red car breaking the rule.";
	}
}
