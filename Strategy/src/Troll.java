
public class Troll extends Character {
	
	public Troll() {
		weaponBehavior = new AxeBehavior();
	}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	

}
