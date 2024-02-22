package builder;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pedido pedido = new PedidoBuilder()
						.setPedido("R10")
						.setCliente("Rafa", "weiss@", "Rua Jose")
						.setVendedor("Carlos", 2)
						.setProduto("Limao", 1, 1)
						.setProduto("Manga", 2, 2).builder();
		
		
		pedido.informacoes();
						

	}

}
