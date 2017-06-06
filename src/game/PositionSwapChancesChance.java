package game;

public class PositionSwapChancesChance extends Chance {

	public PositionSwapChancesChance(int in_position, Board in_board) {
		super(in_position, in_board, 0);
	}

	@Override
	public int activatedAction() {
		// TODO: Logic for swapping events between one another
		// SUB: Access list of Chances on Board
		// SUB: Swap according to list
		return modifier;
	}

}
