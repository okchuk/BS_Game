package game;

public class PositionSwapPlayerChance extends Chance {

	public PositionSwapPlayerChance(int in_position, Board in_board) {
		super(in_position, in_board, 0);
	}

	@Override
	public int activatedAction() {
		// TODO: Logic for swapping positions between players
		return modifier;
	}

}
