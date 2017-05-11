package game;

public class ForwardChance extends Chance {

	public ForwardChance(int in_modifier) {
		super(in_modifier);
	}
	
	public int activatedAction() {
		// TODO: Move player forward by modifier
		return modifier;
	}

}
