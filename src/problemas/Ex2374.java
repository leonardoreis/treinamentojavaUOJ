package problemas;

import java.util.Scanner;

public class Ex2374 {
	
	public static int N=0, M=0;
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
		while (N<1 || N>40 && M<1 || M>40) {
			N = teclado.nextInt();
			M = teclado.nextInt();
		}
			
		teclado.close();
		
		System.out.println(N-M);
		
	}//fim do metodo main	
}//fim da classe
