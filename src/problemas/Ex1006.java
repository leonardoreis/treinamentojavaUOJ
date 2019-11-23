package problemas;
import java.util.Scanner;

public class Ex1006 {
	public static void main (String[ ] args) {
		/*
		Leia 3 valores, no caso, variáveis A, B e C, 
		que são as três notas de um aluno. 
		A seguir, calcule a média do aluno, 
		sabendo que a nota 
		A tem peso 2, 
		B tem peso 3 e 
		C tem peso 5. 
		Considere que cada nota pode ir de 0 até 10.0, 
		sempre com uma casa decimal.
		Entrada
		O arquivo de entrada contém 3 valores 
		com uma casa decimal, de dupla precisão (double).
		Saída
		Imprima a variável MEDIA conforme exemplo abaixo, 
		com 1 dígito após o ponto decimal e 
		com um espaço em branco antes e depois da igualdade. 
		Assim como todos os problemas, 
		não esqueça de imprimir o fim de linha após o resultado, 
		caso contrário, você receberá "Presentation Error".
		 */
		Scanner teclado = new Scanner(System.in);
		double A = -1, B = -1, C = -1, MEDIA = 0;
		String A2, B2, C2;
		//System.out.println("Digite a nota A");
		while (A < 0 || A > 10) {
			//System.out.println("Nota A: valor entre 0 e 10!");
			A2 = teclado.next();
			A2 = A2.trim();
			A2 = A2.replace(',', '.');
			A = Double.parseDouble(A2);
		}
		//System.out.println("Digite a nota B");
		while (B < 0 || B > 10) {
			//System.out.println("Nota B: valor entre 0 e 10!");
			B2 = teclado.next();
			B2 = B2.trim();
			B2 = B2.replace(',', '.');
			B = Double.parseDouble(B2);
		}
		//System.out.println("Digite a nota C");
		while (C < 0 || C > 10) {
			//System.out.println("Nota C: valor entre 0 e 10!");
			C2 = teclado.next();
			C2 = C2.trim();
			C2 = C2.replace(',', '.');
			C = Double.parseDouble(C2);
		}
		teclado.close();
		MEDIA = ((A*2)+(B*3)+(C*5))/10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}
