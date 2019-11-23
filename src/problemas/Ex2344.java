package problemas;

import java.util.Scanner;

public class Ex2344 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int nota = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		if(nota>85) {
			System.out.println("A");
		}else if(nota>60) {
			System.out.println("B");
		}else if(nota>35) {
			System.out.println("C");
		}else if(nota>0) {
			System.out.println("D");
		}else {
			System.out.println('E');
		}
		
		
	}//fim do metodo main
}//fim da classe