package problemas;
import java.util.Scanner;

public class Ex1009 {
	public static void main (String[] args) {
		/*
		Fa�a um programa que leia: 
		1 - o nome de um vendedor, //String
		2 - o seu sal�rio fixo  //Double
		3 - e o total de vendas efetuadas por ele no m�s (em dinheiro). //Double 
		Sabendo que este vendedor 
		ganha 15% de comiss�o sobre suas vendas efetuadas, 
		informar o total a receber no final do m�s, 
		com duas casas decimais.
		
		Entrada
		O arquivo de entrada cont�m um texto (primeiro nome do vendedor)
		e 2 valores de dupla precis�o (double) 
		com duas casas decimais, 
		representando o sal�rio fixo do vendedor e 
		montante total das vendas efetuadas por este vendedor, 
		respectivamente.
		
		Sa�da
		Imprima o total que o funcion�rio dever� receber, 
		conforme exemplo fornecido. 
		*/
		String nome;
		double salario_fixo, total_vendas, comissao, total;
		Scanner teclado = new Scanner(System.in);
			nome = teclado.next();
			salario_fixo = teclado.nextDouble();
			total_vendas = teclado.nextDouble();
		teclado.close();
		comissao = (total_vendas/100)*15;
		total = salario_fixo + comissao;
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
	}
}
