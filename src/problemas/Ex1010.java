package problemas;
import java.util.Scanner;

public class Ex1010 {
	public static void main (String[] args) {

		int CODA, CODB, QTEA, QTEB;
		double VALORA, VALORB, PAGAR;
		String L1, L2;
		String aL1[] = new String[3];
		String aL2[] = new String[3];
		
		Scanner teclado = new Scanner(System.in);
		L1 = teclado.nextLine();
		L2 = teclado.nextLine();
		teclado.close();
				
		aL1 = L1.split(" ");
		aL2 = L2.split(" ");
		
		aL1[2] = aL1[2].trim();
		aL1[2] = aL1[2].replace(',', '.');

		aL1[2] = aL1[2].trim();
		aL2[2] = aL2[2].replace(',', '.');
		
		CODA = Integer.parseInt(aL1[0]);
		QTEA = Integer.parseInt(aL1[1]);
		VALORA = Double.parseDouble(aL1[2]);
				
		CODB = Integer.parseInt(aL2[0]);
		QTEB = Integer.parseInt(aL2[1]);		
		VALORB = Double.parseDouble(aL2[2]);
		
		PAGAR = ((VALORA * QTEA) + (VALORB * QTEB));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", PAGAR);
	}
}
