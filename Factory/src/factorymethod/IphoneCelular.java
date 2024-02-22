package factorymethod;

public class IphoneCelular extends Celular{
	
	
	String nome = "Iphone";
	String marca = "Apple";
	String versao = "13";
	
	public void ligar() {
		System.out.println("Ligando celular " + nome);
	}
	
	public void desligar() {
		System.out.println("Desligando celular " + nome);
	}
	

}
