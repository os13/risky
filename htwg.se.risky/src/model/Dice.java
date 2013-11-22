package model;

import java.util.Random;

public class Dice {

	private int min, max;
	private Random dice = new Random();

	public Dice() {
		// do nothing
	}

	/**
	 * setzt min und max
	 * 
	 * @param min
	 * @param max
	 * @return false bei Misserfolg, true bei Erfolg.
	 */
	public boolean setmm(int min, int max) {
		if (!this.testmm(min, max)) {
			return false;
		}
		this.min = min;
		this.max = max;
		return true;
	}

	/**
	 * @return Zufallszahl zwischen gesetzten min und max.
	 */
	public Integer roll() {

		int dif = this.max - this.min + 1;
		return dice.nextInt() % dif + this.min;
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
