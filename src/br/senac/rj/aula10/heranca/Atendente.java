package br.senac.rj.aula10.heranca;

public class Atendente extends Funcionario{
	
	public Double geraBonificacao() {
		return getSalario() * 1.25;
	}

}
