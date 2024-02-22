package factorymethod2;

public class USCurrency extends Moeda{
	
	private String pais = "US";
	private String simbolo = "$";
	
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
