package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1924 {
	
	public static ArrayList<String> lista = new ArrayList<String>();
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int entrada = Integer.parseInt(teclado.nextLine());
			for (int i = 0; i < entrada; i++) {
				String linha = teclado.nextLine();
				lista.add(linha);
			}
			System.out.println("Ciencia da Computacao");

		teclado.close();
		
	}//fim do metodo main
}//fim da classe
