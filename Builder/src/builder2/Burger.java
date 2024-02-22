package builder2;

// Definindo a classe concreta do objeto Burger.

public class Burger {

	private String bread;
	private String meat;
	private String cheese;
	private boolean salad;
	private Seasoning seasoning;
	private Toppings toppings;
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public boolean isSalad() {
		return salad;
	}
	public void setSalad(boolean salad) {
		this.salad = salad;
	}
	public Seasoning getSeasoning() {
		return seasoning;
	}
	public void setSeasoning(Seasoning seasoning) {
		this.seasoning = seasoning;
	}
	public Toppings getToppings() {
		return toppings;
	}
	public void setToppings(Toppings toppings) {
		this.toppings = toppings;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	@Override
	public String toString() {
		return "Burger [bread=" + bread + ", meat=" + meat + ", cheese=" + cheese + ", salad=" + salad + ", seasoning="
				+ seasoning + ", toppings=" + toppings + "]";
	}
	
	
	
	
}
