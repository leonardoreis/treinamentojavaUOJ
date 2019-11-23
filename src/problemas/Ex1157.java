package problemas;

import java.util.Scanner;

public class Ex1157 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int entrada = teclado.nextInt();
		teclado.close();
		
		divisores(entrada);
		
	}//fim do metodo main
	
	public static void divisores (int dividendo) {
		for (int i = 1; i <=dividendo; i++ ) {
			if (dividendo %i==0) {
				System.out.println(i);
			}
		}
		
	}//fim do metodo divisores 
}//fim da classe
