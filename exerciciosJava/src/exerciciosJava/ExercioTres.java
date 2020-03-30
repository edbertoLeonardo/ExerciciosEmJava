/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de
 * A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
 * Exemplo: a=5,b=6,c=7,d=8/Diferença= -26
 */


package exerciciosJava;

import java.util.Scanner;

public class ExercioTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		int diferenca;

	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    d = sc.nextInt();

	    diferenca = a * b - c * d;

	    System.out.println("Diferença entre os resultados = " + diferenca);	
		sc.close();
	}
}
