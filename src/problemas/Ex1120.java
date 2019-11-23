package problemas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1120 {
	
	public static ArrayList<String> lista_entrada = new ArrayList<String>();
	public static String verificador = " ";
	
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
		while (verificador.equalsIgnoreCase(" ")) {
			String linha_entrada = teclado.nextLine();
			linha_entrada = linha_entrada.trim();
			lista_entrada.add(linha_entrada);
			if (linha_entrada.equalsIgnoreCase("0 0")) {
				verificador = linha_entrada;
			}
		}
	teclado.close();
	//apaga saída do while
	lista_entrada.remove(lista_entrada.size()-1);
	
	for (int i = 0; i < (lista_entrada.size()); i++) {
		String vetor[] = new String [2];
		String temp = lista_entrada.get(i);
		vetor = temp.split(" ");
		String D = vetor[0];
		String N = vetor[1];
		N = N.replaceAll(D, "");
					
		if (N.length()<1) {
			System.out.println("0");
		}else {
			BigInteger b = BigInteger.valueOf(Long.parseLong(N)); 
			System.out.println(b);	
		}
		
	}

	}//fim do método main
}//fim da classe
