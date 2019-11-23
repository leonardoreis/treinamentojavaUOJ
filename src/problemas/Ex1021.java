package problemas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex1021 {//Notas e Moedas
	
	public static double valor;
	public static int n100;
	public static int n050;
	public static int n020;
	public static int n010;
	public static int n005;
	public static int n002;
	public static int m100;
	public static int m050;
	public static int m025;
	public static int m010;
	public static int m005;
	public static int m001;
	
	public static void main (String[] args) {
		/*
		Leia um valor de ponto flutuante com duas casas decimais. 
		Este valor representa um valor monetário. 
		A seguir, calcule o menor número de notas e moedas possíveis 
		no qual o valor pode ser decomposto. 
		a) As notas consideradas são de 100, 50, 20, 10, 5, 2. 
		b) As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
		A seguir mostre a relação de notas necessárias.
		
		Entrada
		O arquivo de entrada contém um valor de ponto flutuante N (0 <= N <= 1000000.00).
		
		Saída
		Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
		conforme exemplo fornecido.
		
		Obs: Utilize ponto (.) para separar a parte decimal.
		576.73			NOTAS:
						5 nota(s) de R$ 100.00
						1 nota(s) de R$ 50.00
						1 nota(s) de R$ 20.00
						0 nota(s) de R$ 10.00
						1 nota(s) de R$ 5.00
						0 nota(s) de R$ 2.00
						MOEDAS:
						1 moeda(s) de R$ 1.00
						1 moeda(s) de R$ 0.50
						0 moeda(s) de R$ 0.25
						2 moeda(s) de R$ 0.10
						0 moeda(s) de R$ 0.05
						3 moeda(s) de R$ 0.01
		
		*/
		
		Scanner teclado = new Scanner(System.in);
			valor = teclado.nextDouble();
		teclado.close();
		
		if(valor>=100) {
			n100 = (int)Math.floor(valor/100);
			valor = valor - (n100*100);
			System.out.println("100: "+valor);
		}
		if(valor>=50) {
			n050 = (int)Math.floor(valor/50);
			valor = valor - (n050*50);
			System.out.println("50: "+valor);
		}
		if(valor>=20) {
			n020 = (int)Math.floor(valor/20);
			valor = valor - (n020*20);
			System.out.println("20: "+valor);
		}
		if(valor>=10) {
			n010 = (int)Math.floor(valor/10);
			valor = valor - (n010*10);
			System.out.println("10: "+valor);
		}
		if(valor>=5) {
			n005 = (int)Math.floor(valor/5);
			valor = valor - (n005*5);
			System.out.println("05: "+valor);
		}
		if(valor>=2) {
			n002 = (int)Math.floor(valor/2);
			valor = valor - (n002*2);
			System.out.println("02: "+valor);
		}
		if(valor>=1) {
			m100 = (int)Math.floor(valor/1);
			valor = valor - (m100*1);
			System.out.println("01: "+valor);
		}
		if(valor>=0.50) {
			m050 = (int)Math.floor(valor/0.50);
			valor = valor - (m050*0.50);
			System.out.println("0,50: "+valor);
		}
		if(valor>=0.25) {
			m025 = (int)Math.floor(valor/0.25);
			valor = valor - (m025*0.25);
			System.out.println("0,25: "+valor);
		}
		if(valor>=0.10) {
			m010 = (int)Math.floor(valor/0.10);
			valor = valor - (m010*0.10);
			System.out.println("0.10: "+valor);
		}
		if(valor>=0.05) {
			m005 = (int)Math.floor(valor/0.05);
			valor = valor - (m005*0.05);
			System.out.println("0,05: "+valor);
			
			BigDecimal bd = new BigDecimal(valor).setScale(3, RoundingMode.HALF_EVEN);
			valor = bd.doubleValue();
			System.out.println("0,05 arredondando: "+valor);
		}
		if(valor>=0.01) {
			m001 = (int)Math.floor(valor/0.01);
			valor = valor - (m001*0.01);
			System.out.println("0,01: "+valor);
		}
		

		System.out.println(valor);
		System.out.println("NOTAS");
		System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n050 + " nota(s) de R$ 50.00");
		System.out.println(n020 + " nota(s) de R$ 20.00");
		System.out.println(n010 + " nota(s) de R$ 10.00");
		System.out.println(n005 + " nota(s) de R$ 5.00");
		System.out.println(n002+  " nota(s) de R$ 2.00");
		System.out.println("MOEDAS");
		System.out.println(m100 + " moeda(s) de R$ 1.00");
		System.out.println(m050 + " moeda(s) de R$ 0.50");
		System.out.println(m025 + " moeda(s) de R$ 0.25");
		System.out.println(m010 + " moeda(s) de R$ 0.10");
		System.out.println(m005 + " moeda(s) de R$ 0.05");
		System.out.println(m001 + " moeda(s) de R$ 0.01");
	
		
	}//fim do método main
}//fim da classe
