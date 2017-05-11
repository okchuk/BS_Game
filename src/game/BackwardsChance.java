package game;

public class BackwardsChance extends Chance {

	public BackwardsChance(int in_modifier) {
		super(in_modifier);
	}

	@Override
	public int activatedAction() {
		// TODO: Move player backwards by modifier
		return modifier;
	}

}
