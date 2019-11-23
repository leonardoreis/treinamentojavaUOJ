package problemas;

import java.util.Scanner;

public class Ex2936 {
	public static void main (String[] Args) {
		int curupira = 300;
		int boitata = 1500;
		int boto = 600;
		int mapinguari = 1000;
		int iara = 150;
		int chica = 225;
		
		Scanner teclado = new Scanner (System.in);
			curupira 	= teclado.nextInt()*curupira;
			boitata  	= teclado.nextInt()*boitata;
			boto	 	= teclado.nextInt()*boto;
			mapinguari  = teclado.nextInt()*mapinguari;
			iara  		= teclado.nextInt()*iara;
		teclado.close();
		
		System.out.println(curupira+
				boitata+
				boto+
				mapinguari+
				iara+
				chica);
		
		
		
	}//fim do metodo main
}//fim da classe