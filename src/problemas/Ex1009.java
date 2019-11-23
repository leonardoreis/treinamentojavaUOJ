package problemas;
import java.util.Scanner;

public class Ex1009 {
	public static void main (String[] args) {
		/*
		Faça um programa que leia: 
		1 - o nome de um vendedor, //String
		2 - o seu salário fixo  //Double
		3 - e o total de vendas efetuadas por ele no mês (em dinheiro). //Double 
		Sabendo que este vendedor 
		ganha 15% de comissão sobre suas vendas efetuadas, 
		informar o total a receber no final do mês, 
		com duas casas decimais.
		
		Entrada
		O arquivo de entrada contém um texto (primeiro nome do vendedor)
		e 2 valores de dupla precisão (double) 
		com duas casas decimais, 
		representando o salário fixo do vendedor e 
		montante total das vendas efetuadas por este vendedor, 
		respectivamente.
		
		Saída
		Imprima o total que o funcionário deverá receber, 
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
