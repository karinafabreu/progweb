package br.senac.rj.aula11.heranca;

public class CCEspecial extends ContaCorrente{
	
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double calcularChequeEspecial() {
		return getSaldo() * 1.20;
	}
}