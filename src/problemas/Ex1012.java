package problemas;
import java.util.Scanner;

public class Ex1012 {
	public static void main (String[] args) {
		/*
		Escreva um programa que leia três valores com 
		ponto flutuante de dupla precisão: A, B e C. 
		Em seguida, calcule e mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.
		Entrada
		O arquivo de entrada contém três valores com um dígito após o ponto decimal.
		Saída
		O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a 
		uma das áreas descritas acima, sempre com mensagem correspondente e um 
		espaço entre os dois pontos e o valor. 
		O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
		Exemplos de Entrada	Exemplos de Saída
		3.0 4.0 5.2		TRIANGULO: 7.800
						CIRCULO: 84.949
						TRAPEZIO: 18.200
						QUADRADO: 16.000
						RETANGULO: 12.000
		
		12.7 10.4 15.2	TRIANGULO: 96.520
						CIRCULO: 725.833
						TRAPEZIO: 175.560
						QUADRADO: 108.160
						RETANGULO: 132.080
		*/
		
		//início do programa:
		double A, B, C;
		double area_triangulo;
		double area_circulo;
		double area_trapezio;
		double area_quadrado;
		double area_retangulo;
		
		String tA, tB, tC;
		String Linha1;
		String array[] = new String[3];
		
		Scanner teclado = new Scanner(System.in);
			Linha1 = teclado.nextLine();
		teclado.close();
		
		array = Linha1.split(" ");
		tA = array[0];
		tB = array[1];
		tC = array[2];
		
		tA = tA.trim();
		tA = tA.replace(',', '.');
		tB = tB.trim();
		tB = tB.replace(',', '.');
		tC = tC.trim();
		tC = tC.replace(',', '.');
		
		A = Double.parseDouble(tA);
		B = Double.parseDouble(tB);
		C = Double.parseDouble(tC);
		
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//(base * altura) /2
		area_triangulo = (A*C)/2;
		
		//b) a área do círculo de raio C. (pi = 3.14159)
		area_circulo = (3.14159*(C*C));
		
		//c) a área do trapézio que tem A e B por bases e C por altura.
		area_trapezio = ((A+B)*C)/2;
		
		//d) a área do quadrado que tem lado B.
		area_quadrado = B*B;
		
		//e) a área do retângulo que tem lados A e B.
		area_retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", area_triangulo);
		System.out.printf("CIRCULO: %.3f\n", area_circulo);
		System.out.printf("TRAPEZIO: %.3f\n", area_trapezio);
		System.out.printf("QUADRADO: %.3f\n", area_quadrado);
		System.out.printf("RETANGULO: %.3f\n", area_retangulo);
		
	}

}
