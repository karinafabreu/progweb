package br.senac.rj.aula06;

public class ExercicioAluno {
	
	// declação dos atributos
	private long id;
	private String matricula;
	private String nome;
	private String cpf;
	private int idade;
	private double nota01;
	private double nota02;
	
	//construtor sem argumentos (vazio)	
	public ExercicioAluno (){
		
	}
	
	//gets e sets
	public long getId(){
		return id;
	}
	public void setId (long id){
		this.id = id;
	}
	
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula (String matricula){
		this.matricula = matricula;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getCpf (){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public double getNota01 (){
		return nota01;
	}
	public void setNota01(double nota01){
		this.nota01 = nota01;
	}
	
	public double getNota02 (){
		return nota02;
	}
	public void setNota02(double nota02){
		this.nota02 = nota02;
	} 
	
	public double getMedia(){
		return (nota01 + nota02)/2;
	}
	
}
