package game;

public class ForwardChance extends Chance {

	public ForwardChance(int in_position, Board in_board, int in_modifier) {
		super(in_position, in_board, in_modifier);
	}
	
	public int activatedAction() {
		return modifier;
	}

}
