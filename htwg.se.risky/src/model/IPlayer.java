package model;

public interface IPlayer {
	public void setPlayerName(String name);
	public String getPlayerName();
	public void setAvailableAmountUnits(int amount);
	public int getAvailableAmountUnits();
	public void moveUnits(Country srcCountry, Country desCountry, int amountUnits);
}
