package builder2;


public class BurgerBuilder {
	
	/* 
	 
	 A classe BurgerBuilder cuidará de construir todos os atributos presentes em Burger.
	 Ao criar um objeto BurgerBuilder, cria-se um objeto Burger.
	 Em cada método deve-se receber os atributos da classe Burger e setá-los na instância burger.
	 Por fim, retorna-se o objeto construído com o método order().
	
	*/
	
	
	private Burger burger;
	
	
	
	public BurgerBuilder(){
		
		this.burger = new Burger();
	}
	
	public BurgerBuilder setBread(String bread) {
		
		burger.setBread(bread);
		
		return this;
		
	}

	public BurgerBuilder setCheese(String cheese) {
			
		burger.setCheese(cheese);
			
		return this;
			
		}
	
	public BurgerBuilder setMeat(String meat) {
		
		burger.setMeat(meat);
			
		return this;
	}
	
	public BurgerBuilder setSalad(boolean salad) {
		
		burger.setSalad(salad);
		
		return this;
	}
	
	public BurgerBuilder setSeasoning(boolean spicy, boolean ranch, boolean ketchup,boolean mayonaise) {
		
		Seasoning seasoning = new Seasoning();
		
		seasoning.setSpicy(spicy);
		seasoning.setRanch(ranch);
		seasoning.setKetchup(ketchup);
		seasoning.setMayonaise(mayonaise);
		
		burger.setSeasoning(seasoning);
		
		return this;
	}
	
	public BurgerBuilder setToppings(boolean bacon, boolean crispyOnions, boolean caramelOnions) {
		
		Toppings toppings = new Toppings();
		
		toppings.setBacon(bacon);
		toppings.setCaramelOnions(caramelOnions);
		toppings.setCrispyOnions(crispyOnions);
		
		burger.setToppings(toppings);
		
		
		return this;
	}
	
	public Burger order() {
		
		return burger;
	}

	
	
	
}
