package factorymethod;

public class SamsungCelular extends Celular{
	
	String nome = "Galaxy";
	String marca = "Samsung";
	String versao = "10";
	
	public void ligar() {
		System.out.println("Ligando celular " + nome);
	}
	
	public void desligar() {
		System.out.println("Desligando celular " + nome);
	}
	
	
}