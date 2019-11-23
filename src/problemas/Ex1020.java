package problemas;
import java.util.Scanner;

public class Ex1020 {//Idade em Dias
	
	public static int dias;
	public static double ano;
	public static double mes;
	public static double dia;
	
	public static void main (String[] args) {
		/*
		Leia um valor inteiro correspondente à idade de uma pessoa em dias
		e informe-a em anos, meses e dias
		Obs.: apenas para facilitar o cálculo, 
		considere todo ano com 365 dias e 
		todo mês com 30 dias. 
		Nos casos de teste nunca haverá uma situação que 
		permite 12 meses e alguns dias, como 360, 363 ou 364. 
		Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
		Entrada
		O arquivo de entrada contém um valor inteiro.
		Saída
		Imprima a saída conforme exemplo fornecido.
		Exemplo de Entrada		Exemplo de Saída
		400						1 ano(s)
								1 mes(es)
								5 dia(s)
		
		800						2 ano(s)
								2 mes(es)
								10 dia(s)
		
		30						0 ano(s)
								1 mes(es)
								0 dia(s)
		*/

		Scanner teclado = new Scanner(System.in);
			dias = teclado.nextInt();
		teclado.close();
		
		if(dias>=365) {
			ano = dias / 365;
			ano = Math.floor(ano);
			dias = dias - (int)(ano*365);
		}
		if(dias>=30) {
			mes = dias / 30;
			mes = Math.floor(mes);
			dias = dias - (int)(mes*30);
		}
		dia = dias;
		
		System.out.printf("%d ano(s)\n", (int)ano);
		System.out.printf("%d mes(es)\n", (int)mes);
		System.out.printf("%d dia(s)\n", (int)dia);
		
	}//fim do método main
}//fim da classe ex1020
