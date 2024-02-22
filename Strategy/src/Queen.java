

public class Queen extends Character {
	
	public Queen() {
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}

}
