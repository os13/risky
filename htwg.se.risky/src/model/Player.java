package model;

public class Player implements IPlayer {
	
	private String name;
	
	Player(String name) {
		setPlayerName(name);
	}
	
	@Override
	public void setPlayerName(String name) {
		this.name = name;
	}

	@Override
	public String getPlayerName() {
		return this.name;
	}

	@Override
	public void setAvailableAmountUnits(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAvailableAmountUnits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void moveUnits(Country srcCountry, Country desCountry,
			int amountUnits) {
		// TODO Auto-generated method stub
		
	}

}
