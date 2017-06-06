package game;

public class BackwardsChance extends Chance {

	public BackwardsChance(int in_position, Board in_board, int in_modifier) {
		super(in_position, in_board, in_modifier);
	}

	@Override
	public int activatedAction() {
		return modifier;
	}

}
