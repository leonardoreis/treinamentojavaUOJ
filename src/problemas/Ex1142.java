package problemas;

import java.util.Scanner;

public class Ex1142 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int entrada = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		for (int i=1; i < entrada*4; i=i+4) {
			if (i%2!=0) {
				System.out.println(i+" "+(i+1)+" "+(i+2)+" "+"PUM");
			}
		}
		
		
		
	}//fim do método main
}//fim da classe
