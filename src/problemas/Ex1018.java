package problemas;
import java.util.Scanner;

public class Ex1018 {
		
	public static void main (String[] args) {
		/*
		Leia um valor inteiro. 
		A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) 
		no qual o valor pode ser decomposto. 
		As notas consideradas s�o de 
		a) 100, 50, 20, 10, 5, 2 e 1. 
		A seguir mostre o valor lido e a 
		rela��o de notas necess�rias.
		Entrada
		O arquivo de entrada 
		cont�m um valor inteiro N (0 < N < 1000000).
		Sa�da
		a) Imprima o valor lido e, em seguida, 
		b) a quantidade m�nima de notas de cada tipo necess�rias, 
		conforme o exemplo fornecido. 
		N�o esque�a de imprimir o fim de linha ap�s cada linha, 
		caso contr�rio seu programa 
		apresentar� a mensagem: �Presentation Error�.
		Exemplo de Entrada		Exemplo de Sa�da
		576						576
								5 nota(s) de R$ 100,00
								1 nota(s) de R$ 50,00
								1 nota(s) de R$ 20,00
								0 nota(s) de R$ 10,00
								1 nota(s) de R$ 5,00
								0 nota(s) de R$ 2,00
								1 nota(s) de R$ 1,00
		
		11257					11257
								112 nota(s) de R$ 100,00
								1 nota(s) de R$ 50,00
								0 nota(s) de R$ 20,00
								0 nota(s) de R$ 10,00
								1 nota(s) de R$ 5,00
								1 nota(s) de R$ 2,00
								0 nota(s) de R$ 1,00
		
		503						503
								5 nota(s) de R$ 100,00
								0 nota(s) de R$ 50,00
								0 nota(s) de R$ 20,00
								0 nota(s) de R$ 10,00
								0 nota(s) de R$ 5,00
								1 nota(s) de R$ 2,00
								1 nota(s) de R$ 1,00
		 */
		
		//vari�veis
		int valor = 0;
		int valor_inicial = 0;
		double temp = 0.0;
		int notas100=0;
		int notas50=0;
		int notas20=0;
		int notas10=0;
		int notas5=0;
		int notas2=0;
		int notas1=0;
		
		Scanner teclado = new Scanner (System.in);
			valor = teclado.nextInt();
			valor_inicial = valor;
		teclado.close();
		
		if(valor>=100) {
			temp = valor/100;
			notas100 = (int)Math.floor(temp);
			valor = valor - (notas100*100);
			temp=0;
		}
		if(valor>=50) {
			temp = valor/50;
			notas50 = (int)Math.floor(temp);
			valor = valor - (notas50*50);
			temp=0;
		}
		if(valor>=20) {
			temp = valor/20;
			notas20 = (int)Math.floor(temp);
			valor = valor - (notas20*20);
			temp=0;
		}
		if(valor>=10) {
			temp = valor/10;
			notas10 = (int)Math.floor(temp);
			valor = valor - (notas10*10);
			temp=0;
		}
		if(valor>=5) {
			temp = valor/5;
			notas5 = (int)Math.floor(temp);
			valor = valor - (notas5*5);
			temp=0;
		}
		if(valor>=2) {
			temp = valor/2;
			notas2 = (int)Math.floor(temp);
			valor = valor - (notas2*2);
			temp=0;
		}
		if(valor>=1) {
			temp = valor/1;
			notas1 = (int)Math.floor(temp);
			valor = valor - (notas1*1);
			temp=0;
		}
		
		System.out.println(valor_inicial);
		System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
		System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
		System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
		System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
		System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
		System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
		System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
		
		
	}//fim do metodo MAIN(); 
}//fim da classe ex1018
