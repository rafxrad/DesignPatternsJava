package builder;


import java.util.ArrayList;

public class Pedido {

	private String idPedido;
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<Produto> Produtos;	
	
	
	
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public ArrayList<Produto> getProdutos() {
		return Produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		Produtos = produtos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

		
	public void informacoes() {
		
		
		float valorTotal = 0;
		
		System.out.println("------- Pedido " + getIdPedido() + " -------------");
		for (Produto p : getProdutos()) {
			valorTotal += p.getValor();
			System.out.println(p.getNome() +  " " + p.getQuantidade() + " " + p.getValor());
		}
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Email do cliente: " + cliente.getEmail());
		System.out.println("Informações do vendedor: " + vendedor.getNome());
		System.out.println("Valor total: " + valorTotal);
				
	}
	
	
	
}
