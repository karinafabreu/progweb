package br.senac.rj.aula11.heranca;

import java.time.LocalDate;
import java.util.Date;

public class ContaPoupanca extends Conta {
	
	private Date dataDeposito;
	
	public Date getDataDeposito() {
		return dataDeposito;
	}
	public void setDataDeposito(Date dataDeposito) {
		this.dataDeposito = dataDeposito;
	}
	
	public void receberJuros(double valorDepositado, LocalDate dataDeposito){
		setSaldo(getSaldo() + valorDepositado);
		dataDeposito = LocalDate.now();
	}
}