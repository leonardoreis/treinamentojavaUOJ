package problemas;
import java.util.Scanner;

public class Ex1007 {
	public static void main (String[] args) {
		/*
		Leia quatro valores inteiros A, B, C e D. 
		A seguir, calcule e mostre a diferen�a do produto de A e B 
		pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		Entrada
		O arquivo de entrada cont�m 4 valores inteiros.
		Sa�da
		Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo 
		abaixo, com um espa�o em branco antes e depois da igualdade.
		*/
		
		Scanner teclado = new Scanner (System.in);
		int A, B, C, D, DIFERENCA;
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		teclado.close();
		DIFERENCA = ((A * B) - (C * D));
		System.out.println("DIFERENCA = " + DIFERENCA);

	}
}
