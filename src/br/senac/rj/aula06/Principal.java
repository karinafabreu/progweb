package br.senac.rj.aula06;

public class Principal {
	
	public static void main(String[] args){
		
		//criação de referencia
		Produto teclado;
		
		// Instancia do objeto
		teclado = new Produto();
		
		teclado.setCodigo(1);
		teclado.setNome("Teclado Razer");
		teclado.setQauntidade(10);
		teclado.setPreco(150.00);
		
		System.out.println(teclado.getCodigo());
		System.out.println(teclado.getNome());
		System.out.println(teclado.getQuantidade());
		System.out.println(teclado.getPreco());
	}

}
