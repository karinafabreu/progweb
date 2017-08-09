package br.senac.rj.aula08;

public class Telefone {
	
	private Integer id;
	private int ddd;
	private int numero;
	
	private Aluno aluno;
	
	public Telefone(){}
	
	public Telefone(Integer id, int ddd, int numero){
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String toString(){
		return "DDD: " + ddd + "\nNumero: " + numero;
	}
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public int getDdd(){
		return ddd;
	}
	public void setDdd(int ddd){
		this.ddd = ddd;
	}
	
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public Aluno getAluno(){
		return aluno;
	}
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	

}
