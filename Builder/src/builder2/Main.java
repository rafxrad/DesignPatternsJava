package builder2;


public class Main {

	public static void main(String[] args) {
		
		/* Pode-se atribuir um, vários ou nenhum objeto sem a necessidade de construtores personalizados. */
		
		Burger myburger1 = new BurgerBuilder().setBread("Parmesan bread")
				.setCheese("Gouda")
				.setMeat("Sirloin medium rare")
				.setSalad(true)
				.setSeasoning(true, false, true, false)
				.setToppings(true, true, false)
				.order();
		
		Burger myburger2 = new BurgerBuilder().setBread("Whole wheat bread")
				.setCheese("Cheddar")
				.setMeat("plain")
				.order();
		
		Burger myburger3 = new BurgerBuilder().order();
				
		
		
		System.out.println(myburger1 + " has been ordered.");
	
		System.out.println("---------------------------");
		
		System.out.println(myburger2 + " has been ordered.");
		
		System.out.println("---------------------------");
		
		System.out.println(myburger3 + " has been ordered.");
		
		
		
	
	}
}