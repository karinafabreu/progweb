package br.senac.rj.aula07;

public class Endereco {
	
	private Integer id;
	private String logradouro;
	private String bairro;
	private String cidade;
	private int cep;
	
	private Cliente cliente;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Integer id, String logradouro, String bairro, String cidade, int cep) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Logradouro: " + logradouro + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nCep: " + cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
