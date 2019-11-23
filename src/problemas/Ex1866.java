package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1866 {

	public static int S = 0;
	public static ArrayList<Integer> saida = new ArrayList<Integer>();
	
	
	public static void main (String[] Args) {

		Scanner teclado = new Scanner(System.in);
			int C = teclado.nextInt();
				
		for (int i = 0; i < C; i++) {
			int N = teclado.nextInt();			
			Grandi(N);
		}
		teclado.close();
		for (int i = 0; i < saida.size(); i++) {
			System.out.println(saida.get(i));
		}
		
		
	}//fim do metodo main
	
	public static void Grandi (int C) {
		for (int i = 0; i < (C-1); i++) {
			if (C%2==0) {
				S = 0;				
			}else {
				S = 1;
			}
			
		}
		saida.add(S);
				
	}//fim da função
	
	
}//fim da classe
