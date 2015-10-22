package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet{
	
	public RedBlackBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}

}
