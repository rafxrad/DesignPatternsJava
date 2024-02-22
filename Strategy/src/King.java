
public class King extends Character{

	public King() {
		weaponBehavior = new SwordBehavior();
	}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
