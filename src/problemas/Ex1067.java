package problemas;

import java.util.Scanner;

public class Ex1067 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner (System.in);
			int entrada = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		for (int i = 0; i <= entrada; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}//fim do metodo main
}//fim da classe
