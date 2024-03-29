package factorymethod2;

public class MoedaFactory {
	
	public static Moeda makeMoeda(CurrencyTypes currency) {
		if(currency == CurrencyTypes.BR) {
			return new BrazilCurrency();
		} else {
			return new USCurrency();
		}
	}

}
