package problemas;

import java.util.Scanner;

public class Ex2339 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner (System.in);
			String linha = teclado.nextLine();
		teclado.close();
		
		String array[] = new String[3];
		linha = linha.replace("  ", " ");
		linha = linha.replace("   ", " ");
		linha = linha.replace(",", " ");
		linha = linha.replace(".", " ");
		linha = linha.replace(";", " ");
		array = linha.split(" ");
		
		int C = Integer.parseInt(array[0]);
		int P = Integer.parseInt(array[1]);
		int F = Integer.parseInt(array[2]);
		
		if(C*F<=P) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
			
		
		
		
	}//fim do metodo main
}//fim da classe
