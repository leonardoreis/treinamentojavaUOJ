package problemas;
import java.util.Scanner;

public class Ex1017 { //Gasto de Combust�vel
	public static void main (String[] args) {
		//Explica��o do problema:
		/*
		Joaozinho quer calcular e mostrar a 
		quantidade de litros de combust�vel 
		gastos em uma viagem, ao utilizar um autom�vel que 
		faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
		Para efetuar o c�lculo, deve-se fornecer 
		a) o tempo gasto na viagem (em horas) e 
		b) a velocidade m�dia durante a mesma (em km/h). 
		Assim, pode-se obter dist�ncia percorrida e, em seguida, 
		calcular quantos litros seriam necess�rios. 
		Mostre o valor com 3 casas decimais ap�s o ponto.
		
		Entrada
		O arquivo de entrada cont�m dois inteiros. 
		a) O primeiro � o tempo gasto na viagem (em horas) e o 
		b) segundo � a velocidade m�dia durante a mesma (em km/h).
		
		Sa�da
		Imprima a quantidade de litros necess�ria para realizar a viagem, 
		com tr�s d�gitos ap�s o ponto decimal
		
		Exemplo de Entrada		Exemplo de Sa�da
		10						70.833
		85
		
		2						15.333
		92
		
		22						122.833
		67

		*/
		
		//in�cio do programa
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
