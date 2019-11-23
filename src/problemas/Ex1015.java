package problemas;
import java.util.Scanner;

public class Ex1015 { // Dist�ncia Entre Dois Pontos
	public static void main(String[] args) {
		/*
		Leia os quatro valores correspondentes 
		aos eixos x e y de dois pontos quaisquer no plano, 
		p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, 
		mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:
		Distancia = sqrt((x2-x1)^2 + (y2-y1)^2));
		Entrada
		O arquivo de entrada cont�m duas linhas de dados. 
		A primeira linha cont�m 
		a) dois valores de ponto flutuante: x1 y1 e a 
		segunda linha cont�m 
		b) dois valores de ponto flutuante x2 y2.
		Sa�da
		Calcule e imprima o valor da dist�ncia segundo a 
		f�rmula fornecida, com 4 casas ap�s o ponto decimal.
		*/
		double x1, y1, x2, y2, distancia;
		String linha1, linha2;
		String array1[] = new String[2];
		String array2[] = new String[2];
		
		Scanner teclado = new Scanner (System.in);
			linha1 = teclado.nextLine();
			linha2 = teclado.nextLine();
		teclado.close();
		
		//Separando a String para o Array;
		array1 = linha1.split(" ");
		array2 = linha2.split(" ");
		
		//tratamento das strings para converter para double
		for (int i = 0; i < 2; i++) {
			array1[i] = array1[i].trim();
			array1[i] = array1[i].replace(',', '.');
			array2[i] = array2[i].trim();
			array2[i] = array2[i].replace(',', '.');
		}
		
		//recebendo valores nas vari�veis double
		x1 = Double.parseDouble(array1[0]);
		y1 = Double.parseDouble(array1[1]);
		x2 = Double.parseDouble(array2[0]);
		y2 = Double.parseDouble(array2[1]);
		
		//Distancia = sqrt((x2-x1)^2 + (y2-y1)^2));
		distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		//imprimindo a distancia:
		System.out.printf("%.4f\n" , distancia);
		
	}//fim do main
}//fim da classe ex1015
