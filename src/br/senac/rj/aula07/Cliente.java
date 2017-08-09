package br.senac.rj.aula07;

import java.util.List;

public class Cliente {
	
	private Integer id;
	private String nome;
	
	private Endereco endereco;
	private Telefone telefone;
	
	private List<Animal> animal;
	
	@Override
	public String toString() {
		return "Cliente:\nID: " + id + "\nNome: " + nome + "\nTelefone: " + telefone.getNumero() + "\nEndereco:\n" + endereco
				+ "\nAnimal:\n" + animal;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
}
