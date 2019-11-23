package problemas;
import java.util.Scanner;

public class Ex1014 {
	public static void main (String[] args) {
			/*
			Calcule o consumo m�dio de um autom�vel 
			sendo fornecidos a dist�ncia total percorrida (em Km) 
			e o total de combust�vel gasto (em litros).
			Entrada
			O arquivo de entrada cont�m dois valores: 
			a) um valor inteiro X representando a dist�ncia total percorrida (em Km), e
			b) um valor real Y representando o total de combust�vel gasto, 
			com um d�gito ap�s o ponto decimal.
			
			Sa�da
			Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas 
			ap�s a v�rgula, seguido da mensagem "km/l".
			
			Exemplo de Entrada	Exemplo de Sa�da
			500			14.286 km/l
			35.0			
			
			2254		18.119 km/l
			124.4		
			
			4554		9.802 km/l
			464.6		
			*/
		
		int X;
		double Y, consumo;
		//X = Distancia total
		//Y = Combust�vel gasto
		Scanner teclado = new Scanner (System.in);
			X = teclado.nextInt();
			Y = teclado.nextDouble();
		teclado.close();
		consumo = (X/Y);
		
		System.out.printf("%.3f km/l\n", consumo);
	}
}
