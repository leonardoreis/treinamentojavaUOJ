package problemas;
import java.util.Scanner;

public class Ex1019 {// Conversão de Tempo
	
	//variáveis globais
	public static int horas = 0;
	public static int minutos = 0;
	public static int segundos = 0;
	public static String thoras, tminutos, tsegundos;

	public static void main(String[] args) {
		/*
		Leia um valor inteiro, 
		que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
		e informe-o expresso no formato horas:minutos:segundos.
		Entrada
		O arquivo de entrada contém um valor inteiro N.
		Saída
		Imprima o tempo lido no arquivo de entrada (segundos), 
		convertido para horas:minutos:segundos, conforme exemplo fornecido.
		Exemplo de Entrada			Exemplo de Saída
		556							0:9:16
		1							0:0:1
		140153						38:55:53
		*/

		//declaração das variáveis
		int tempo_em_segundos;

		
		//leitura do teclado.
		Scanner teclado = new Scanner(System.in);
			tempo_em_segundos = teclado.nextInt();
		teclado.close();
		if (tempo_em_segundos >= 3600) {
			horas = (int)Math.floor((double)((tempo_em_segundos/60)/60));
			tempo_em_segundos = tempo_em_segundos - (horas*60*60);
		}
		if (tempo_em_segundos >= 60) {
			minutos = (int)Math.floor((double)(tempo_em_segundos/60));
			tempo_em_segundos = tempo_em_segundos - (minutos*60);
		}
		segundos = tempo_em_segundos;
		
		
		if (horas<=9) {
			thoras = ("0"+Integer.toString(horas));
		}
		else {
			thoras = (Integer.toString(horas));
		}
		
		if (minutos<=9) {
			tminutos = ("0"+Integer.toString(minutos));
		}
		else {
			tminutos = (Integer.toString(minutos));
		}
		
		if (segundos<=9) {
			tsegundos = ("0"+Integer.toString(segundos));
		}
		else {
			tsegundos = (Integer.toString(segundos));
		}

		
		//com "PADLEFT"
		System.out.println(thoras+":"+tminutos+":"+tsegundos);
		//System.out.println(horas+":"+minutos+":"+segundos);
		
	}//Fim do método main
}//Fim da CLASSE ex1019
