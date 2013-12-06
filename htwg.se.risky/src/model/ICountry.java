package model;

public interface ICountry {

	String getCountryName();

	void setControlPlayer(Player cp);

	Player getControlPlayer();

	void setUnits(int amount);

	int getUnits();

	void addUnit(int amount);

	void removeUnit(int amount);

	void setNeighbour(Country c);

	boolean isNeighbourOf(Country c);
}
