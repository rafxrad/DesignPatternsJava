package builder2;

public class Toppings {
	
	// Definindo a classe concreta do objeto Toppings.
	
	private boolean bacon;
	private boolean crispyOnions;
	private boolean caramelizedOnions;
	
	
	public boolean isBacon() {
		return bacon;
	}
	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}
	public boolean isCrispyOnions() {
		return crispyOnions;
	}
	public void setCrispyOnions(boolean crispyOnions) {
		this.crispyOnions = crispyOnions;
	}
	public boolean isCaramelOnions() {
		return caramelizedOnions;
	}
	public void setCaramelOnions(boolean caramelOnions) {
		this.caramelizedOnions = caramelOnions;
	}
	@Override
	public String toString() {
		return "Toppings [bacon=" + bacon + ", crispyOnions=" + crispyOnions + ", caramelOnions=" + caramelizedOnions + "]";
	}
	
	
	
	
}
