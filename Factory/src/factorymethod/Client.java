package factorymethod;

public class Client {

		public static void main(String[] args) throws ClassNotFoundException {
			Celular celular = CelularFactory.create(CelularTypes.SAMSUNG);
			Celular celular2 = CelularFactory.create(CelularTypes.IPHONE);
			
			celular.ligar();
			celular2.desligar();
		}
}
