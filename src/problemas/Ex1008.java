package problemas;
import java.util.Scanner;


public class Ex1008 {
	public static void main (String[] args) {
		/*
		Escreva um programa que leia:
		1. o n�mero de um funcion�rio, 
		2. seu n�mero de horas trabalhadas, 
		3. o valor que recebe por hora e 
		calcula o sal�rio desse funcion�rio. 
		A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
		com duas casas decimais.
		Entrada
		O arquivo de entrada cont�m 2 n�meros inteiros e 
		1 n�mero com duas casas decimais, representando o n�mero, 
		quantidade de horas trabalhadas e o 
		valor que o funcion�rio recebe por hora trabalhada, 
		respectivamente.
		Sa�da
		Imprima o n�mero e o sal�rio do funcion�rio, 
		conforme exemplo fornecido, com um espa�o em branco antes 
		e depois da igualdade. 
		No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
		*/
		Scanner teclado = new Scanner(System.in);		
		int A, B;
		float C, SALARIO;
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextFloat();
		teclado.close();
		SALARIO = B * C;
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = U$ %.2f\n", SALARIO);
	}
}
