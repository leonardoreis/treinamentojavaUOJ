/*
Programa: Exercício 2413 UriOnlineJudge
Programador: Leonardo Reis
Data: 05/11/2019 
*/


package problemas;

import java.util.Scanner;

public class Ex2413 {
	
	public static int t;
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			while(t<1||t>1000) {
				t = teclado.nextInt();
			}
		teclado.close();

		int link1 = 0;
		int link2 = 0;
		int link3 = t;
			
		//t = número de pessoas que apertaram link 3.
		
		link2 = 2 * (link3);
		link1 = 2 * (link2); //link 2 é a metade do link 1.
		
		System.out.println(link1);

	}//fim do método main
}//fim da classe