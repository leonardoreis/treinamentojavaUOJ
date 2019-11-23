package problemas;

import java.util.Scanner;

public class Ex1153 {
	
	public static int N;
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			N = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		for (int i = N; i > 1;i--) {
			N = N*(i-1);
		}
		System.out.println(N);
		
	}//fim do metodo main
}//fim da classe
