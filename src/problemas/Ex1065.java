package problemas;

import java.util.Scanner;

public class Ex1065 {
	
	public static Integer array [] = new Integer[5];
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			array[0] = Integer.parseInt(teclado.nextLine());
			array[1] = Integer.parseInt(teclado.nextLine());
			array[2] = Integer.parseInt(teclado.nextLine());
			array[3] = Integer.parseInt(teclado.nextLine());
			array[4] = Integer.parseInt(teclado.nextLine());
			
		teclado.close();
		
		int conta_pares = 0;
		for (int i = 0; i < array.length; i++ ) {
			if (array[i]%2==0) {
				conta_pares++;
			}
		}
		
		System.out.println(conta_pares + " valores pares");
		
	}//fim do metodo main
}//fim da classe
