package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1589 {
	
	public static ArrayList<Integer> raio1 = new ArrayList<Integer>();
	public static ArrayList<Integer> raio2 = new ArrayList<Integer>();
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int quantidade_entradas = Integer.parseInt(teclado.nextLine());
			
			for (int i = 0; i < quantidade_entradas; i++) {
				String linha = teclado.nextLine();
				String array[] = new String[2];
				array = linha.split(" ");
				
				int R1 = Integer.parseInt(array[0]);
				raio1.add(R1);
				int R2 = Integer.parseInt(array[1]);
				raio2.add(R2);
			}
			
			for (int i = 0; i < quantidade_entradas; i++) {
				System.out.println(raio1.get(i)+raio2.get(i));
			}
			
		teclado.close();
	}//fim do metodo main
}//fim da classe
