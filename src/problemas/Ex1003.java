package problemas;
import java.util.Scanner;

public class Ex1003 {
	public static void main (String[] args) {
		/*
		Leia dois valores inteiros, no caso para vari�veis A e B. 
		A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. 
		A seguir escrever o valor desta vari�vel.
		Entrada
		O arquivo de entrada cont�m 2 valores inteiros.
		Sa�da
		Imprima a vari�vel SOMA com todas as letras mai�sculas, 
		com um espa�o em branco antes e depois da igualdade seguido 
		pelo valor correspondente � soma de A e B. 
		Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s
		 o resultado, caso contr�rio, voc� receber� "Presentation Error".
		 */
		Scanner teclado = new Scanner(System.in);		
		int SOMA, A, B;
		A = teclado.nextInt();
		B = teclado.nextInt();
		teclado.close();
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA );
		
	
	}

}
