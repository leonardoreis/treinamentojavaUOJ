package problemas;

import java.util.Scanner;

public class Ex2454 {
	public static void main (String[] Args) {
		String array[] = new String[2];
		Scanner teclado = new Scanner(System.in);
			String linha = teclado.nextLine();
			array = linha.split(" ");
		teclado.close();
		
		//tratamento
		array[0] = array[0].trim();
		array[1] = array[1].trim();
		
		int P = Integer.parseInt(array[0]);
		int R = Integer.parseInt(array[1]);
		
		if (P==0) {
			System.out.println("C");
		}else if(R==0) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}

	}//fim do método main
}//fim da classe
