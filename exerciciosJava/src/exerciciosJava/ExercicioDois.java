/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na
 * tela a soma desses n�meros com uma mensagem explicativa
 */

package exerciciosJava;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int valorUm = scanner.nextInt();
		System.out.println("Digite mais um numero inteiro:");
		int valorDois = scanner.nextInt();
		int soma = valorUm + valorDois;
		
		System.out.println("A soma dos valores �: " + soma);
		scanner.close();
	}

}
