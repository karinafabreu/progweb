package br.senac.rj.aula10.heranca;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[]args) {
		
		Cliente cliente = new Cliente();
	
		cliente.setId(1234);
		cliente.setNome("Karina Abreu");
		cliente.setEmail("karina@gmail.com");
		cliente.setCpf("123.456.789-90");
		cliente.setFormaDePagamento("Cartão");
		
		//referencia		instancia (criacao do objeto)
		Atendente atendente = new Atendente();
		
		atendente.setId(5678);
		atendente.setNome("Leandro");
		atendente.setEmail("leandro@gmail.com");
		atendente.setLogin("ljustino");
		atendente.setSenha("12345678");
		atendente.setSalario(3.200);
		
		System.out.println(atendente + "\nSalário com a Bonificação: R$" + atendente.geraBonificacao());
		
		//referencia		instancia (criacao do objeto)
		Gerente gerente = new Gerente();
		
		gerente.setId(5678);
		gerente.setNome("Lucas");
		gerente.setEmail("lucas@gmail.com");
		gerente.setLogin("lsantana");
		gerente.setSenha("12345678");
		gerente.setSalario(3.200);
		
		System.out.println(gerente + "\nSalário com a Bonificação: R$" + gerente.geraBonificacao());
		
	}
}