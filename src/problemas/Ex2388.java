package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2388 {
	//variáveis globais
	public static int N = 0;
	public static int T = 0;
	public static int V = 0;
	public static int distancia_total=0;
	public static ArrayList<String> lista = new ArrayList<String>();
	public static String array[] = new String[2];
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			while (N<1||N>1000) {
				//System.out.println("Insira a quantidade de entradas: ");
				N = Integer.parseInt(teclado.nextLine());
			}
			
			for (int i = 0; i < N; i++) {
				//System.out.println("digite o item" + (i+1));
				String linha = teclado.nextLine();
				lista.add(linha);
			}			

			for (int i = 0; i < N; i++) {
				String linha = lista.get(i);
				linha = linha.trim();
				array = linha.split(" ");
				T = Integer.parseInt(array[0]);
				V = Integer.parseInt(array[1]);
				distancia_total = (distancia_total + (T*V));
				

			}

			System.out.println(distancia_total);
			
		teclado.close();
		
	}//fim do método main
}//fim da classe
