package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1024 {
	
	public static int quantidade_linhas;
	public static ArrayList<String> lista_linhas = new ArrayList<String>();
	public static ArrayList<String> passagem1 = new ArrayList<String>();
	public static ArrayList<String> passagem2 = new ArrayList<String>();
	public static ArrayList<String> passagem3 = new ArrayList<String>();
	public static byte[] binario2;
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
			quantidade_linhas = teclado.nextInt();
			for (int i = 0 ; i <=quantidade_linhas; i++) {
				String temp = teclado.nextLine();
				lista_linhas.add(temp);
			}
		lista_linhas.remove(0);
		teclado.close();
			
		passagem1();
		passagem2();
		passagem3();
	
		for (int i = 0; i < quantidade_linhas; i++) {
			System.out.println(passagem3.get(i));
		}
		
			
	}//fim do metodo main
	
	public static void passagem1 () {
		//ASCII = 65 a  90 (A - Z maiúsculas)
		//ASCII = 97 a 122 (a - z minúsculas)
		for (int i = 0 ; i < quantidade_linhas; i++) {
			String temp = lista_linhas.get(i);
			byte[] binario = temp.getBytes();
			for (int j = 0; j <binario.length;j++) {
				if (binario[j] >= 65 && binario[j] <= 90 || 
					binario[j] >= 97 && binario[j] <= 122 ) {
						binario[j] = (byte) (binario[j] + 3);
				}
			}
		String convertido = new String(binario);
		passagem1.add(convertido);	
		}
		
	}//fim passagem1
	
	public static void passagem2() {
		for (int i = 0 ; i < quantidade_linhas; i++) {
			String temp1 = passagem1.get(i);
			StringBuffer temp2 = new StringBuffer(temp1);
			temp2.reverse();
			String temp3 = temp2.toString();
			passagem2.add(temp3);
			}
	}//fim passagem2
	
	public static void passagem3() {
		for (int i = 0 ; i < quantidade_linhas; i++) {
			String temp = passagem2.get(i);
			binario2 = temp.getBytes();
			for (int j = (Math.round((binario2.length/2))); 
					j < binario2.length; j++) {
				binario2[j] = (byte) (binario2[j] - 1);
			}
			String convertido = new String(binario2);
			passagem3.add(convertido);	
		}
	}//fim passagem3
		
			
}//fim da classe
