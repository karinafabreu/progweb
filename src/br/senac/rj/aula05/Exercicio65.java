package br.senac.rj.aula05;

import java.util.Scanner;

public class Exercicio65 {
	public static void main(String[] args) {

		double valor;
		double total = 0;

		try (Scanner scan = new Scanner(System.in)) {
			do {
				System.out.print("Digite o valor: ");
				valor = scan.nextDouble();
				total += valor;
			} while (valor != 0);

			System.out.println("O valor total dos valores digitados é: " + total);
		}
	}
}
