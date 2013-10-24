package model;

public class Player implements IPlayer {

	private final String name;
	private int amountAvailableUnits;

	Player(String name) {
		this.name = name;
	}

	@Override
	public String getPlayerName() {
		return this.name;
	}

	@Override
	public void setAmountAvailableUnits(int amountUnits) {
		this.amountAvailableUnits = amountUnits;
		
	}

	@Override
	public int getAmountAvailableUnits() {
		return this.amountAvailableUnits;
	}

	@Override
	public void moveUnits(Country srcCountry, Country desCountry,
			int amountUnits) {
		srcCountry.removeUnit(amountUnits);
		desCountry.addUnit(amountUnits);
	}

	@Override
	public void decAvailableUnit() {
		this.amountAvailableUnits--;
	}
}