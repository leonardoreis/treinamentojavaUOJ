package problemas;

import java.util.Scanner;

public class Ex1070 {
	public static void main (String[] Args) {
		
		Scanner teclado = new Scanner(System.in);
			int entrada = teclado.nextInt();
		teclado.close();
		
		int contador = 0;
		while (contador < 6 ) {
			++entrada;
			if (entrada %2 != 0) {
				System.out.println(entrada);
				contador++;
			}
		}
		
	}//fim do método main
}//fim da classe Ex1070
