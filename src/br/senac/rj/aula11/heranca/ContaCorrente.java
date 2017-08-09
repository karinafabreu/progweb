package br.senac.rj.aula11.heranca;

//conta nao pode ser instanciada, por isso abstract (ou será conta especial ou salario)
public abstract class ContaCorrente extends Conta {
	
	public void pagarTaxa(double taxa) {
		setSaldo(getSaldo() - taxa);
		
	}
}