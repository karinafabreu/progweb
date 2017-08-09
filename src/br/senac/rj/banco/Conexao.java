package br.senac.rj.banco;

public class Conexao {
	
	public Conexao() {
		try {
			//Necessário para utilizar o drive JDBC do MySQL
			Class.forName("com.myswl.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			//Erro de driver JDBC
			e.printStackTrace();
		}
		
		//CONTINUAR
	}

}
