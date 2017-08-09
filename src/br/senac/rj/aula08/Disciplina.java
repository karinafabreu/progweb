package br.senac.rj.aula08;

public class Disciplina {
	
	private Integer id;
	private String nome;
	private double nota01;
	private double nota02;
	
	private Aluno aluno;
	
	public Disciplina(){}	

	public Disciplina(Integer id, String nome, double nota01, double nota02){
		this.id = id;
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;		
	}
	
	public String toString(){
		return "Nome: " + nome + "\nNota 01: " + nota01 + "\nNota 02: " + nota02;
	}
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getNota01(){
		return nota01;
	}
	public void setNota01(double nota01){
		this.nota01 = nota01;
	}
	
	public double getNota02(){
		return nota02;
	}
	public void setNota02(double nota02){
		this.nota02 = nota02;
	}
	
	public Aluno getAluno(){
		return aluno;
	}
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	
	
}
