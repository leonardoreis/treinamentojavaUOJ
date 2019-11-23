package problemas;

import java.util.Scanner;

public class Ex1930 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			String linha = teclado.nextLine();
		teclado.close();
		
		String array[] = new String[4];
		array = linha.split(" ");
		int T1 = Integer.parseInt(array[0]);
		int T2 = Integer.parseInt(array[1]);
		int T3 = Integer.parseInt(array[2]);
		int T4 = Integer.parseInt(array[3]);
		
		T1 = T1-1;
		T2 = T2-1;
		T3 = T3-1;
		
		System.out.println(T1+T2+T3+T4);
			
		
		
	}//fim do metodo main
}//fim da classe

