package br.senac.rj.aula06;

public class Produto {
	
	// declação dos atributos
	private long codigo;
	private String nome;
	private Integer quantidade;
	private double preco;
	
	//construtor sem argumentos (vazio)
	public Produto (){
		
	}
	
	//construtor com argumentos (cheio)
	public Produto(long codigo, String nome, Integer quantidade, double preco){
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	/**Encapsulamento - métodos gets e sets
	 *  @Get - Metodo responsável por resgatar o valor de um atributo
	 *  @Set - Metodo responsavel por atribuir um valor a um atributo
	 * */
	public long getCodigo(){
		return codigo;
	}
	
	public void setCodigo(long codigo){
		this.codigo = codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Integer getQuantidade(){
		return quantidade;
	}
	
	public void setQauntidade(Integer quantidade){
		this.quantidade = quantidade;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
}
