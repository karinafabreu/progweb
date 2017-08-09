package br.senac.rj.aula07;

import java.util.Arrays;
import javax.swing.JOptionPane;

	public class Principal {
	
	public static void main(String[] args) {

		// Criação das referências
		Cliente cliente;
		Telefone telefone;
		Endereco endereco;
		Animal animal;
		Raca raca;
		Especie especie;

		// Instanciação dos objetos
		cliente = new Cliente();
		endereco = new Endereco();
		telefone = new Telefone();
		animal = new Animal();
		raca = new Raca();
		especie = new Especie();
		
/*-----------------------------------------------------*/

		// Atribuição dos dados de cliente
		cliente.setId(1);
		cliente.setNome("Karina");

		// Atribuição dos dados de telefone
		telefone.setId(1);
		telefone.setNumero("21 99927-5383");

		// Atribuição dos dados de endereço
		endereco.setLogradouro("Rua Santa Luzia, 735");
		endereco.setBairro("Centro");
		endereco.setCidade("RJ");
		endereco.setCep(20030041);

		// Atribuição dos dados de animal
		animal.setId(1);
		animal.setIdade(2);
		animal.setNome("Mia");
		animal.setPeso(1.4);

		// Atribuição dos dados de especie
		especie.setId(1);
		especie.setEspecie("Cachorro");
		
		// Atribuição dos dados de raca
		raca.setId(1);
		raca.setRaca("Pinscher 1");
		
/*-----------------------------------------------------*/

		// Relacionamento entre as entidades
		cliente.setTelefone(telefone);
		cliente.setEndereco(endereco);
		cliente.setAnimal(Arrays.asList(animal));

		telefone.setCliente(cliente);
		endereco.setCliente(cliente);

		animal.setCliente(cliente);
		animal.setEspecie(especie);
		animal.setRaca(raca);

		especie.setAnimal(animal);
		raca.setAnimal(animal);

		JOptionPane.showMessageDialog(null, cliente);
	}
}
