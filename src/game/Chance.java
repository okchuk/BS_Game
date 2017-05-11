package game;

public abstract class Chance {
	
	int modifier;
	Field field;
	
	public Chance(int in_modifier) {
		modifier = in_modifier;
	}
	
	public abstract int activatedAction();
}
