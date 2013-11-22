package model;

import java.util.Random;

public class Dice {

	private Random dice = new Random();

	public Dice() {
		// do nothing
	}

	/**
	 * @param min
	 * @param max
	 * @return bei Erflg, die Zufallszahl, bei Misserfolg null.
	 * 
	 */
	public Integer roll(int min, int max) {

		if (!this.testmm(min, max)) {
			return null;
		}

		int dif = max - min + 1;
		return dice.nextInt() % dif + min;
	}

	/**
	 * @param min
	 * @param max
	 * @return false bei fehlerhaften uebergabewerte. true bei korekten werte.
	 * 
	 *         testmm: testet min und max.
	 */
	private boolean testmm(int min, int max) {
		if (min > max || min < 0 || max < 0 || max > 6) {
			return false;
		}
		return true;
	}

}
