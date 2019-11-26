package problemas;

import java.util.Scanner;

public class Ex1144 {
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			int entrada = teclado.nextInt();
		teclado.close();
		
		int lacoj = 0;
		int testej = 1;
		boolean intercalar = true;
		int lacok=6;
		int testek=1;
		int somak=6;
		
		for(double i = 1; i < entrada+1; i=i+0.5) {
				System.out.println((int)i +" "+ (testej)+" "+testek);
				
				for (int j = 0; j < 1; j++) {
					if (intercalar) {
						intercalar=false;
						testej++;
						testek++;
					}else {
						intercalar=true;
						lacoj = lacoj+2;
						testej = testej+lacoj;
						testek = testek+somak;
						lacok= lacok+6;
						somak = somak+lacok;
					}
			}
		}
			
	}//fim do metodo main
}//fim da classe
