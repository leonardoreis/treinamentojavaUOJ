package problemas;
import java.util.Scanner;

public class Ex1013 {
	//vari�vel global
	public static int MAIOR = 0;
	
	public static void main (String[] args) {
		/*
		Fa�a um programa que leia tr�s valores 
		e apresente o maior dos tr�s valores lidos 
		seguido da mensagem �eh o maior�. 
		Utilize a f�rmula:
		MAIORAB = (A+B+ABS(A-B))/2;
		Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). 
		Um segundo passo, portanto � necess�rio para chegar no resultado esperado.
		
		Entrada
		O arquivo de entrada cont�m tr�s valores inteiros.
		
		Sa�da
		Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem " eh o maior".
		 */
		
		int A, B, C;
		String array[] = new String[3];
		String Linha;
		
		Scanner teclado = new Scanner(System.in);
			Linha = teclado.nextLine();
		teclado.close();
		
		array = Linha.split(" ");
		for (int i = 0; i < 3; i++) {
			array[i] = array[i].trim();
			array[i] = array[i].replace(',', '.');
		}
		
		A = Integer.parseInt(array[0]);
		B = Integer.parseInt(array[1]);
		C = Integer.parseInt(array[2]);
				
		if (A >= B && A >= C && A >= MAIOR){ 
			MAIOR = A;
		}
		if (B >= A && B >= C && B >= MAIOR){
			MAIOR = B;
		}
		if (C >= A && C >= B && C >= MAIOR){
			MAIOR = C;
		}
		
		System.out.printf("%d eh o maior\n", MAIOR);
			
	}
}
