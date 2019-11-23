package problemas;

import java.util.Scanner;

public class Ex2006 {
	public static void main (String[] Args) {
		
		Scanner teclado = new Scanner(System.in);
			int T = Integer.parseInt(teclado.nextLine());
			String linha = teclado.nextLine();
		teclado.close();
		
		String array [] = new String [5];
		array = linha.split(" ");
		
		int A = Integer.parseInt(array[0]);
		int B = Integer.parseInt(array[1]);
		int C = Integer.parseInt(array[2]);
		int D = Integer.parseInt(array[3]);
		int E = Integer.parseInt(array[4]);
		
		int acertos=0;
				
		if (A == T) {
			acertos = acertos + 1;
		}
		
		if (B == T) {
			acertos = acertos + 1;
		}
		
		if (C == T) {
			acertos = acertos + 1;
		}
		
		if (D == T) {
			acertos = acertos + 1;
		}
		
		if (E == T) {
			acertos = acertos + 1;
		}
	
		System.out.println(acertos);
		
		
	}//fim do metodo main
}//fim da classe
