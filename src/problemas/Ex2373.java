package problemas;

import java.util.Scanner;

public class Ex2373 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner (System.in);
			int entrada = Integer.parseInt(teclado.nextLine());
			int copos_quebrados = 0;
			
			for(int i = 0; i < entrada; i++) {
				String linha = teclado.nextLine();
				String array[] = new String[2];
				array = linha.split(" ");
				array[0] = array[0].trim();
				array[1] = array[1].trim();
				int L = Integer.parseInt(array[0]);
				int C = Integer.parseInt(array[1]);
				
				
				if (L>C) {
					copos_quebrados = copos_quebrados + C;
				}
			}
				
		teclado.close();
		System.out.println(copos_quebrados);
		
	}//fim do metodo main
}//fim da classe
