package builder3;

public class OrdemDeServicoBuilder {
	
	private OrdemDeServico ordemdeservico;
	
	public OrdemDeServicoBuilder() {
		this.ordemdeservico = new OrdemDeServico();
	}
	

	public OrdemDeServicoBuilder setDescricao(String descricao) {
		
		ordemdeservico.setDescricao(descricao);
	
		return this;
	}
	
	public OrdemDeServicoBuilder setValor (Double valor) {
		ordemdeservico.setValor(valor);
		
		return this;
	}
	
	public OrdemDeServicoBuilder setCliente(String nome, String endereco, String email) {
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setEmail(email);
		
		ordemdeservico.setCliente(cliente);
		
		return this;
	}
	
	
	public OrdemDeServicoBuilder setAtendente(String nome, String idFuncionario) {
		Atendente atendente = new Atendente();
		
		atendente.setNome(nome);
		atendente.setIdFuncionario(idFuncionario);
		
		ordemdeservico.setAtendente(atendente);
		
		return this;
	}
	
	public OrdemDeServico build() {
		
		return ordemdeservico;
	}
	
	
}
