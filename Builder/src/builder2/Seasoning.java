package builder2;

public class Seasoning {
	
	// Definindo a classe concreta do objeto Seasoning.
	
	private boolean spicy;
	private boolean ranch;
	private boolean ketchup;
	private boolean mayonaise;
	
	
	public boolean isSpicy() {
		return spicy;
	}
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	public boolean isRanch() {
		return ranch;
	}
	public void setRanch(boolean ranch) {
		this.ranch = ranch;
	}
	public boolean isKetchup() {
		return ketchup;
	}
	public void setKetchup(boolean ketchup) {
		this.ketchup = ketchup;
	}
	public boolean isMayonaise() {
		return mayonaise;
	}
	public void setMayonaise(boolean mayonaise) {
		this.mayonaise = mayonaise;
	}
	@Override
	public String toString() {
		return "Seasoning [spicy=" + spicy + ", ranch=" + ranch + ", ketchup=" + ketchup + ", mayonaise=" + mayonaise
				+ "]";
	}
	
	
}
