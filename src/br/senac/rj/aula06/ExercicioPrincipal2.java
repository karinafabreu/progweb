package br.senac.rj.aula06;

public class ExercicioPrincipal2 {
	
	public static void main(String[] args) {
		ExercicioAluno Karina;
		
		Karina = new ExercicioAluno();
		
		Karina.setMatricula("1234");
		Karina.setNome("Karina Abreu");
		Karina.setCpf("123.456.789-98");
		Karina.setIdade(20);
		Karina.setNota01(7.5);
		Karina.setNota02(9.0);
		
		System.out.println("ID: " + Karina.getMatricula());
		System.out.println("Nome: " + Karina.getNome());
		System.out.println("CPF: " + Karina.getCpf());
		System.out.println("Idade: " + Karina.getIdade());
		System.out.println("Nota 01: " + Karina.getNota01());
		System.out.println("Nota 02: " + Karina.getNota02());
		System.out.println("Média: " + Karina.getMedia());
		
		
	}

}
