package br.senac.rj.aula11.heranca;

//pessoa nao pode ser instanciada, por isso abstract (ou será pessoa fisica ou juridica)
public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	private String bairro;
	private String telefone;
	
	//associaçao por atributos (pega fragmento de conta para usar em pessoa)
	private Conta conta;
	
	public Pessoa() {}
	
	public String toString() {
		return "Nome: " + nome + "\nEndereço: " + endereco + "\nBairro: " + bairro + "\nTelefone" + telefone + "\nNúmero da Conta: " + conta.getNumConta() + "\nSaldo: " + conta.getSaldo();
	}
	
	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
