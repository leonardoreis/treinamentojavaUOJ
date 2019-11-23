package problemas;
import java.util.Scanner;

public class Ex1010 {
	public static void main (String[] args) {
		/*
		Neste problema, deve-se ler o 
		1- c�digo de uma pe�a 1, 
		2- o n�mero de pe�as 1, 
		3- o valor unit�rio de cada pe�a 1, 
		4- o c�digo de uma pe�a 2, 
		5- o n�mero de pe�as 2 e 
		6- o valor unit�rio de cada pe�a 2. 
		Ap�s, calcule e mostre o valor a ser pago.
		Entrada
		O arquivo de entrada cont�m duas linhas de dados. 
		Em cada linha haver� 3 valores, 
		respectivamente dois inteiros e um valor com 2 casas decimais.
		Sa�da
		A sa�da dever� ser uma mensagem conforme o exemplo 
		fornecido abaixo, lembrando de deixar 
		um espa�o ap�s os dois pontos e 
		um espa�o ap�s o "R$". 
		O valor dever� ser apresentado com 2 casas ap�s o ponto.
		*/
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
