package model;

public interface IPlayer {
	public String getPlayerName();

	public void setAmountAvailableUnits(int amountUnits);

	public int getAmountAvailableUnits();

	public void decAvailableUnit();

	public void moveUnits(Country srcCountry, Country desCountry,
			int amountUnits);
}