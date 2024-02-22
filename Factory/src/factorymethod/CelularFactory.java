package factorymethod;

public class CelularFactory {

	
	public static Celular create(CelularTypes CelularTypes) throws ClassNotFoundException {
		switch (CelularTypes){
		case IPHONE -> {
			return new IphoneCelular();
		} 
		case SAMSUNG -> {
			return new SamsungCelular();
		}
		default -> {
			throw new ClassNotFoundException("This is not a celular type supported.");
		}
	} 
}
} 
	

	



