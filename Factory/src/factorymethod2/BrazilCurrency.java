package factorymethod2;

public class BrazilCurrency extends Moeda {
	
	private String pais = "Brazil";
	private String simbolo = "R$";
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	

}
