package br.senac.rj.banco;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		Funcionario funcionario;
		Dependente dependente;
		
		funcionario = new Funcionario();
		dependente = new Dependente();
		
		funcionario.setId(1);
		funcionario.setNome("Roberto");
		funcionario.setMatricula(12345);
		funcionario.setSalario(2340);
funcionario.setDependente(Arrays.asList(dependente));

		dependente.setId(2);
		dependente.setNome("Julia");
		dependente.setIdade(21);
		
		JOptionPane.showMessageDialog(null, funcionario);
		
	}

}
