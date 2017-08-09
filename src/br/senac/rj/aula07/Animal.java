package br.senac.rj.aula07;

public class Animal {

	private Integer id;
	private String nome;
	private int idade;
	private double peso;

	private Cliente cliente;
	private Especie especie;
	private Raca raca;

	
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nEspecie: " + especie.getEspecie()
				+ "\nRaca: " + raca.getRaca();
	}

	public Animal() {
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}
}
