package problemas;
import java.util.Scanner;

public class Ex1009 {
	public static void main (String[] args) {

		String nome;
		double salario_fixo, total_vendas, comissao, total;
		Scanner teclado = new Scanner(System.in);
			nome = teclado.next();
			salario_fixo = teclado.nextDouble();
			total_vendas = teclado.nextDouble();
		teclado.close();
		comissao = (total_vendas/100)*15;
		total = salario_fixo + comissao;
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
	}
}
