package br.senac.rj.aula08;

import java.util.List;

public class Aluno {
	
	private Integer id;
	private Integer matricula;
	private String nome;
	private String email;
	private Integer cpf;
	
	private List<Disciplina> disciplina;
	private Telefone telefone;
	
	public Aluno (){
		
	}
	
	public Aluno (Integer id,Integer matricula, String nome, String email, Integer cpf){
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String toString(){
		return "Matricula: " + matricula + "\nNome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nDisciplina: \n" + disciplina + "\nTelefone: \n" + telefone;
	}
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getMatricula(){
		return matricula;
	}
	public void setMatricula(Integer matricula){
		this.matricula = matricula;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public Integer getCpf(){
		return cpf;
	}
	public void setCpf(Integer cpf){
		this.cpf = cpf;
	}
	
	public List<Disciplina> getDisciplina(){
		return disciplina;
	}
	public void setDisciplina(List<Disciplina> disciplina){
		this.disciplina = disciplina;
	}
	
	public Telefone getTelefone(){
		return telefone;
	}
	public void setTelefone(Telefone telefone){
		this.telefone = telefone;
	}
	

}
