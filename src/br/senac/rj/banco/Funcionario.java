package br.senac.rj.banco;

import java.util.List;

public class Funcionario {
	
	private int id;
	private String nome;
	private int matricula;
	private float salario;
	
	private List<Dependente> dependente;
	
	public String toString() {
		return "Nome: " + nome + "\nMatricula: " + matricula + "\nSalario: R$" + salario + "\n\nDependente: \n\t" + dependente; 
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
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public List<Dependente> getDependente(){
		return dependente;
	}
	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
}
