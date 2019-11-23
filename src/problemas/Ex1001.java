package problemas;
import java.util.Scanner;

public class Ex1001{

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int A, B;
		A = teclado.nextInt();
		B = teclado.nextInt();
		teclado.close();
		System.out.println("X = "+ (A + B));
	}
}
