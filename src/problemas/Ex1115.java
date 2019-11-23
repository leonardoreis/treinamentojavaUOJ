package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1115 {

	public static ArrayList<String> lista = new ArrayList<String>();
	public static boolean condicao_saida = true;
	public static int X, Y;
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
		
		while (condicao_saida) {
			String linha = teclado.nextLine();
			String array[] = new String[2];
			array = linha.split(" ");
			array[0] = array[0].trim();
			array[0] = array[0].replaceAll(" ","");
			array[1] = array[1].trim();
			array[1] = array[1].replaceAll(" ","");
			
			X = Integer.parseInt(array[0]);
			Y = Integer.parseInt(array[1]);
			
			
			if(X>0 && Y>0) {
				lista.add("primeiro");
			}else if(X<0 && Y>0) {
				lista.add("segundo");
			}else if(X<0 && Y<0) {
				lista.add("terceiro");
			}else if(X>0 && Y<0) {
				lista.add("quarto");
			}
									
			if (X==0 || Y==0) {
				condicao_saida = false;
			}
		}
		teclado.close();
		
		lista.forEach((n) -> System.out.println(n));

		
	}//fim do método main
}//fim da classe