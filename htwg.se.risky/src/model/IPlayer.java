package model;

public interface IPlayer {
	String getPlayerName();

	void setAmountAvailableUnits(int amountUnits);

	int getAmountAvailableUnits();

	void decAvailableUnit();

	void moveUnits(Country srcCountry, Country desCountry, int amountUnits);
}