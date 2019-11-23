package problemas;

import java.util.Scanner;

public class Ex2763 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner (System.in);
			String linha = teclado.nextLine();
			linha = linha.replace("-", ".");
			linha = linha.replace(".", " ");
						
			String array[] = new String[4];
			array = linha.split(" ");
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		teclado.close();
	}//fim do metodo main
}//fim da classe
