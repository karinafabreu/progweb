package br.senac.rj.aula10.heranca;

public abstract class Teste extends Pessoa{
	
	private String login;
	private String senha;
	private Double salario;
	
	public Teste() {
		super();
	}
	public Teste(Integer id, String nome, String email, String login, String senha, Double salario) {
		super(id, nome, email);
		this.login = login;
		this.senha = senha;
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "\nLogin: " + login + "\nSenha: " + senha + "\nSalario: " + salario;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public abstract Double geraBonificacao();
	
}