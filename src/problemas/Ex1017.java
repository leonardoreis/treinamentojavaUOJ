package problemas;
import java.util.Scanner;

public class Ex1017 { //Gasto de Combustível
	public static void main (String[] args) {
		//Explicação do problema:
		/*
		Joaozinho quer calcular e mostrar a 
		quantidade de litros de combustível 
		gastos em uma viagem, ao utilizar um automóvel que 
		faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
		Para efetuar o cálculo, deve-se fornecer 
		a) o tempo gasto na viagem (em horas) e 
		b) a velocidade média durante a mesma (em km/h). 
		Assim, pode-se obter distância percorrida e, em seguida, 
		calcular quantos litros seriam necessários. 
		Mostre o valor com 3 casas decimais após o ponto.
		
		Entrada
		O arquivo de entrada contém dois inteiros. 
		a) O primeiro é o tempo gasto na viagem (em horas) e o 
		b) segundo é a velocidade média durante a mesma (em km/h).
		
		Saída
		Imprima a quantidade de litros necessária para realizar a viagem, 
		com três dígitos após o ponto decimal
		
		Exemplo de Entrada		Exemplo de Saída
		10						70.833
		85
		
		2						15.333
		92
		
		22						122.833
		67

		*/
		
		//início do programa
		int tempo_horas, velocidade_media;
		double distancia, consumo, combustivel;
		consumo = 12.0;
		
		//entrada dos dados em INTEIROS
		Scanner teclado = new Scanner(System.in);
			tempo_horas = teclado.nextInt();
			velocidade_media = teclado.nextInt();
		teclado.close();
		
		distancia = tempo_horas * velocidade_media;
		combustivel = distancia/consumo;
		
		System.out.printf("%.3f\n", combustivel);
				
		
	}//fim do MAIN().
} // fim da classe ex1017
