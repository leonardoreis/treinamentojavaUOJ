package problemas;

import java.util.Scanner;

public class Ex1144 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int entrada = teclado.nextInt();
		teclado.close();
		
		int lacoj = 0;
		int testej = 1;
		boolean par = true;
		
		//System.out.println("1 1 1");
		for(double i = 1; i < entrada+1; i=i+0.5) {
			for (int j = 0; j < 1; j++) {
				if (par==true) {
					System.out.println((int)i+" "+((int)i+testej));
					par=false;
				}else { 
					lacoj = lacoj+2;
					System.out.println((int)i+" "+((int)i+lacoj));
					par=true;
				}
				
			}
				
		}
		
		
	}//fim do metodo main
}//fim da classe
