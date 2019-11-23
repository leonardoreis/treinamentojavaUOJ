package problemas;
import java.util.Scanner;

public class Ex1002 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		double raio, area;
		raio = teclado.nextDouble();
		teclado.close();
		area = (3.14159*(raio*raio));
		System.out.printf("A=%.4f\n", area);
	}
}
