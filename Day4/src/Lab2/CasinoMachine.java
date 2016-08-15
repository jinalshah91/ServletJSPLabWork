package Lab2;

import java.util.concurrent.ThreadLocalRandom;

public class CasinoMachine {

	public enum CasinoENUM {
		BAR, MEDAL, COIN, TRIPLE_BAR, CHERRY;
	}

	public static void main(String[] args) {
		int enumState[] = new int[3];
		for (int i = 0; i < enumState.length; i++) {
			enumState[i] = ThreadLocalRandom.current().nextInt(0, CasinoENUM.values().length);
		}
		for (int i = 0; i < enumState.length; i++) {
			System.out.print(CasinoENUM.values()[enumState[i]] + " ");
		}
	}
}