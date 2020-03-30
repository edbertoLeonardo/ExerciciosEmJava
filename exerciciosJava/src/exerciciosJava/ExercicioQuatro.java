/*Fazer um programa que leia o número(identificação) de um funcionário, seu número de horas trabalhadas, o valor que recebe 
 * por hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 
 * Exemplo: numero = 25, horas = 100, valorDasHoras = 5.50
 * Funcionário número = 25, Salário = 550.00 
 * 
 */


package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;
	    
	    System.out.println("Digite o número do funcionário:");
	    numero = sc.nextInt();
	    System.out.println("Digite as horas trabalhadas:");
	    horas = sc.nextInt();
	    System.out.println("Digite o valor da hora:");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("Número do funcionário = " + numero);
	    System.out.printf("Salário = U$ %.2f%n", salario);
		
		sc.close();
	}
}
