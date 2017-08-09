package br.senac.rj.aula10.heranca;

public class Gerente extends Funcionario{
	
	public Double geraBonificacao() {
		return getSalario() * 1.35;
	}

}
