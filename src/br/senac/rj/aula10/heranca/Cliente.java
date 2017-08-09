package br.senac.rj.aula10.heranca;

/*
 * Classe especialista
 * sub classe
 * classe filha
 */

public class Cliente extends Pessoa{
	
	private String cpf;
	private String formaDePagamento;
	
	public Cliente() {
		super(); //vai chamar o construtor vazio do pai(Pessoa)
	}
	
	public Cliente(Integer id, String nome, String email, String cpf, String formaDePagamento) {
		super(id, nome, email); //chama o construtor cheio do pai que possui a carga de entrada de inteiro, string string
		this.cpf = cpf;
		this.formaDePagamento = formaDePagamento;
	}
	
	//chama todo o toString de Pessoa + cpf de Cliente
	
	public String toString() {
		return super.toString() + "\nCpf: " + cpf + "\nForma de Pagamento: " + formaDePagamento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}

