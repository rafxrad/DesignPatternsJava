package factorymethod2;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moeda moeda1 = MoedaFactory.makeMoeda(CurrencyTypes.BR);
		Moeda moeda2 = MoedaFactory.makeMoeda(CurrencyTypes.US);
		
		System.out.println(moeda1.getPais());
		System.out.println(moeda2.getSimbolo());
		
	}

}
