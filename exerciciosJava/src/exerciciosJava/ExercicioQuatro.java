/*Fazer um programa que leia o n�mero(identifica��o) de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe 
 * por hora e calcula o sal�rio desse funcion�rio.
 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. 
 * Exemplo: numero = 25, horas = 100, valorDasHoras = 5.50
 * Funcion�rio n�mero = 25, Sal�rio = 550.00 
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
	    
	    System.out.println("Digite o n�mero do funcion�rio:");
	    numero = sc.nextInt();
	    System.out.println("Digite as horas trabalhadas:");
	    horas = sc.nextInt();
	    System.out.println("Digite o valor da hora:");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("N�mero do funcion�rio = " + numero);
	    System.out.printf("Sal�rio = U$ %.2f%n", salario);
		
		sc.close();
	}
}
