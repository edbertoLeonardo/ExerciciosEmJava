/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois 
 * mostrar o valor da �rea deste c�rculo com quatro casas decimais conforme exemplos:
 * 
 *  Entrada:2.00 Sa�da: �rea = 12.5664
 *  Entrada:100.64 Sa�da: �rea = 31819.3103 
 */


package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicoDoPi {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner scanner = new Scanner(System.in);
		
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio:");
		raio = scanner.nextDouble();

		area = pi * (raio * raio);
		
		System.out.printf("O valor da �rea � =%.4f%n", area);
		scanner.close();

	}

}
