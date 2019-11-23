package problemas;
import java.util.Scanner;


public class Ex1008 {
	public static void main (String[] args) {
		/*
		Escreva um programa que leia:
		1. o número de um funcionário, 
		2. seu número de horas trabalhadas, 
		3. o valor que recebe por hora e 
		calcula o salário desse funcionário. 
		A seguir, mostre o número e o salário do funcionário, 
		com duas casas decimais.
		Entrada
		O arquivo de entrada contém 2 números inteiros e 
		1 número com duas casas decimais, representando o número, 
		quantidade de horas trabalhadas e o 
		valor que o funcionário recebe por hora trabalhada, 
		respectivamente.
		Saída
		Imprima o número e o salário do funcionário, 
		conforme exemplo fornecido, com um espaço em branco antes 
		e depois da igualdade. 
		No caso do salário, também deve haver um espaço em branco após o $.
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
