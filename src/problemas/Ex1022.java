package problemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1022 {
	public static void main (String[] args) {
		//declaração de variáveis e arrays
		int quantidade_entradas;
		ArrayList<String> linhas_temporarias= new ArrayList<String>();
		
		//entrada
		Scanner teclado = new Scanner(System.in);
			quantidade_entradas = teclado.nextInt();
			for (int i = 0; i <= quantidade_entradas; i++) {
				String temp = teclado.nextLine();
				linhas_temporarias.add(temp);
			}
		teclado.close();
		
		//tratamento da entrada e separação das variáveis (numeradores e denominadores)
		
		for (int i = 1; i <=quantidade_entradas;i++) {
			String temp = linhas_temporarias.get(i);
			temp = temp.trim();
			temp = temp.replaceFirst("/", "");
			temp = temp.replaceAll("  ", " ");
			int N1 = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring((temp.indexOf(" ")+1), temp.length());
			int D1 = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring((temp.indexOf(" ")+1), temp.length());
			String Operador = (temp.substring(0, temp.indexOf(" ")));
			temp = temp.replaceAll("/", "");
			temp = temp.replaceAll("  ", " ");
			temp = temp.substring((temp.indexOf(" ")+1), temp.length());
			int N2 = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			temp = temp.substring((temp.indexOf(" ")+1), temp.length());
			int D2 = Integer.parseInt(temp.substring(0, temp.length()));
			temp = temp.substring((temp.indexOf(" ")+1), temp.length());
			//aqui já temos todas as variáveis e operador (N1, N2, D1, D1 e Operador).
			
			if (Operador.equalsIgnoreCase("+")) {
				String soma_racionais = soma(N1, D1, N2, D2);
				String soma_racionais_simplificado = simplificacao(soma_racionais);
				soma_racionais = soma_racionais.replaceAll(" ", "");
				soma_racionais_simplificado = soma_racionais_simplificado.replaceAll(" ", "");
				System.out.println(soma_racionais
						+ " = "
						+ soma_racionais_simplificado);
				
			}
			if (Operador.equalsIgnoreCase("-")) {
				String subtracao_racionais = subtracao(N1, D1, N2, D2);
				String subtracao_racionais_simplificado = simplificacao(subtracao_racionais);
				subtracao_racionais = subtracao_racionais.replaceAll(" ", "");
				subtracao_racionais_simplificado = subtracao_racionais_simplificado.replaceAll(" ", "");
				System.out.println(subtracao_racionais 
						+  " = "
						+ subtracao_racionais_simplificado);
				
			}
			if (Operador.equalsIgnoreCase("*")) {
				String multiplicacao_racionais = multiplicacao(N1, D1, N2, D2);
				String multiplicacao_racionais_simplificado = simplificacao(multiplicacao_racionais);
				multiplicacao_racionais = multiplicacao_racionais.replaceAll(" ", "");
				multiplicacao_racionais_simplificado = multiplicacao_racionais_simplificado.replaceAll(" ", "");
				System.out.println(multiplicacao_racionais 
						+ " = "
						+ multiplicacao_racionais_simplificado);
				
			}
			if (Operador.equalsIgnoreCase("/")) {
				String divisao_racionais = divisao(N1, D1, N2, D2);
				String divisao_racionais_simplificado = simplificacao(divisao_racionais);
				divisao_racionais = divisao_racionais.replaceAll(" ", "");
				divisao_racionais_simplificado = divisao_racionais_simplificado.replaceAll(" ", "");	
				System.out.println(divisao_racionais 
							+ " = "
							+ divisao_racionais_simplificado);

				
			}
			
		}
		
	}
	
	public static String soma (int N1, int D1, int N2, int D2) {
		int numerador = (N1*D2 + N2*D1);
		int denominador = (D1*D2);
		String soma = Integer.toString(numerador) + " / " + Integer.toString(denominador);
		return soma;
	}
	
	public static String subtracao (int N1, int D1, int N2, int D2) {
		int numerador = (N1*D2 - N2*D1);
		int denominador = (D1*D2);
		String subtracao = Integer.toString(numerador) + " / " + Integer.toString(denominador);
		return subtracao;
	}
	
	public static String multiplicacao (int N1, int D1, int N2, int D2) {
		int numerador = (N1*N2);
		int denominador = (D1*D2);
		String multiplicacao = Integer.toString(numerador) + " / " + Integer.toString(denominador);
		return multiplicacao;
	}
	
	public static String divisao (int N1, int D1, int N2, int D2) {
		int numerador = (N1*D2);
		int denominador = (N2*D1);
		String divisao = Integer.toString(numerador) + " / " + Integer.toString(denominador);
		return divisao;
	}
	
	public static String simplificacao (String fracao) {
		fracao = fracao.trim();
		fracao = fracao.replaceAll("/", "");
		fracao = fracao.replaceAll("  ", " ");
		int N1 = Integer.parseInt(fracao.substring(0, fracao.indexOf(" ")));
		int D1 = Integer.parseInt(fracao.substring((fracao.indexOf(" ")+1), fracao.length()));
		double divisor = mdc(N1, D1);
		double N2 = N1/divisor;
		double D2 = D1/divisor;
		int N3 = (int) N2;
		int D3 = (int) D2;
		return Integer.toString(N3) + " / " + Integer.toString(D3);
	}
	
    public static double mdc (double dividendo, double divisor){
        if ((dividendo % divisor == 0 )){
            return Math.abs(divisor);
        }else{
        	return mdc(Math.abs(divisor),(dividendo % Math.abs(divisor)));
        } 
    }
	
	
}
