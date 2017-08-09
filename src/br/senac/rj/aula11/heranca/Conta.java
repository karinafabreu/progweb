package br.senac.rj.aula11.heranca;

//conta nao pode ser instanciada, por isso abstract (ou será conta poupanca ou corrente)
public abstract class Conta {
	
	private long numConta;
	private double saldo;
	
	public Conta() {}
	
	public long getNumConta() {
		return numConta;
	}
	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacarValor(double valor){
		return saldo - valor;
	}
	
	public double depositarValor(double valor) {
		return saldo + valor;
	}
}