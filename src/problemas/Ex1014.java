package problemas;
import java.util.Scanner;

public class Ex1014 {
	public static void main (String[] args) {
			/*
			Calcule o consumo médio de um automóvel 
			sendo fornecidos a distância total percorrida (em Km) 
			e o total de combustível gasto (em litros).
			Entrada
			O arquivo de entrada contém dois valores: 
			a) um valor inteiro X representando a distância total percorrida (em Km), e
			b) um valor real Y representando o total de combustível gasto, 
			com um dígito após o ponto decimal.
			
			Saída
			Apresente o valor que representa o consumo médio do automóvel com 3 casas 
			após a vírgula, seguido da mensagem "km/l".
			
			Exemplo de Entrada	Exemplo de Saída
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
		//Y = Combustível gasto
		Scanner teclado = new Scanner (System.in);
			X = teclado.nextInt();
			Y = teclado.nextDouble();
		teclado.close();
		consumo = (X/Y);
		
		System.out.printf("%.3f km/l\n", consumo);
	}
}
