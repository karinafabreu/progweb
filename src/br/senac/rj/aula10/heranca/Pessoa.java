package br.senac.rj.aula10.heranca;

/*
 * Classe generica
 * super classe
 * classe pai
 */

public class Pessoa {
	
	private Integer id;
	private String nome;
	private String email;
	
	//dois construtores com assinaturas iguais = sobrecarga
	
	public Pessoa() {
		
	}
	
	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public String toString() {
		return "Id: " + id + "\nNome: " + nome + "\nEmail: " + email;
	}
	
	//metodos gets e sets
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
