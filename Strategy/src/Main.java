
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character king = new King();
		Character troll = new Troll();
		Character queen = new Queen();
		
		king.fight();
		troll.fight();
		queen.fight();

		queen.setWeaponBehavior(new KnifeBehavior());
		
		queen.fight();
	}

}
