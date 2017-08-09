package br.senac.rj.banco;

public class Dependente {
	
	private int id;
	private String nome;
	private int idade;
	
	private Funcionario funcionario;
	
	public String toString() {
		return "\nNome do dependente: " + nome + "\nIdade: " + idade + "\n";  
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void  setIdade(int idade) {
		this.idade = idade;
	}

}
