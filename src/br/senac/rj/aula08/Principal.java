package br.senac.rj.aula08;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args){
		
		Aluno aluno;
		Telefone telefone;
		Disciplina disciplina;
		
		aluno = new Aluno();
		telefone = new Telefone();
		disciplina = new Disciplina();
		
		aluno.setId(1);
		aluno.setMatricula(123);
		aluno.setNome("Karina");
		aluno.setEmail("karina@gmail.com");
		aluno.setCpf(123456789-90);
		
		disciplina.setId(1);
		disciplina.setNome("Matemática");
		disciplina.setNota01(6.7);
		disciplina.setNota02(8.2);
		
		telefone.setId(1);
		telefone.setDdd(21);
		telefone.setNumero(26169999);
		
		aluno.setDisciplina(Arrays.asList(disciplina));
		aluno.setTelefone(telefone);
		
		disciplina.setAluno(aluno);
		telefone.setAluno(aluno);
		
		JOptionPane.showMessageDialog(null, aluno);
		
	}
}
