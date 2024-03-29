package builder;

import java.util.ArrayList;

public class PedidoBuilder {

	
	// Construindo o builder de Pedido, adicionando todos os campos para um pedido como um método isolado.
	
	private Pedido instancia;
	
	public PedidoBuilder() {
		
		// Centraliza a instância de pedido para setar os atributos.
		
		this.instancia = new Pedido();
		
	}
	
	public PedidoBuilder setPedido(String idPedido) {
		instancia.setIdPedido(idPedido);
		return this;
	}
	
	public PedidoBuilder setCliente(String nome, String email, String endereco) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);
		
		instancia.setCliente(cliente);
		
		return this;
	}
	
	public PedidoBuilder setVendedor(String nome, int idVendedor) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(nome);
		vendedor.setNome(nome);
		
		instancia.setVendedor(vendedor);;
		
		return this;
	}
	
	public PedidoBuilder setProduto(String nome, int quantidade,float valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(valor);
		
		
		// Verifica se a lista de produtos já foi criada.
		
		if (instancia.getProdutos() == null) {
			instancia.setProdutos(new ArrayList<Produto>());
			
		}
		
		instancia.getProdutos().add(produto);
		
		return this;
		
	}
	
	public Pedido builder() {
		return instancia;
	}

}

