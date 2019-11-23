package problemas;
import java.util.Scanner;

public class Ex1016 {
	public static void main (String[] args) {
		/*
		Dois carros (X e Y) partem em uma mesma dire��o.
		 O carro X sai com velocidade constante de 60 Km/h e o 
		 carro Y sai com velocidade constante de 90 Km/h.
		 Em uma hora (60 minutos) o carro Y consegue se distanciar 
		 30 quil�metros do carro X, ou seja, 
		 consegue se afastar um quil�metro a cada 2 minutos.
		 Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) 
		 para o carro Y tomar essa dist�ncia do outro carro.
		 
		 Entrada
		 O arquivo de entrada cont�m um n�mero inteiro.
		 
		 Sa�da
		 Imprima o tempo necess�rio seguido da mensagem "minutos".
		 
		 Exemplo de Entrada	Exemplo de Sa�da
		 30				60 minutos
		 
		 110			220 minutos
		 
		 7				14 minutos
		*/
		
		int distancia, tempo; //tempo em minutos
		
		Scanner teclado = new Scanner (System.in);
			distancia = teclado.nextInt();
		teclado.close();
		
		tempo = distancia*2;
		
		System.out.printf("%d minutos\n", tempo);
			
	}//fim do MAIN
}//fim da classe ex1016
