package problemas;

import java.util.Locale;
import java.util.Scanner;

/* 
 Programa: Aumento de Salário / Ex 1048 Uri Online Judge
 Programador: Leonardo Reis
 Data: 18/10/2019
*/ 
public class Ex1048 {
	
 	public static double salario_inicial;
	public static double salario_final;
	public static double percentual15 = 0.15;
	public static double percentual12 = 0.12;
	public static double percentual10 = 0.10;
	public static double percentual07 = 0.07;
	public static double percentual04 = 0.04;
	
	public static void main (String[] Args) {
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
			String entrada_digitada = teclado.nextLine();
		teclado.close();

		if (entrada_digitada.length()>0) {
			entrada_digitada = entrada_digitada.trim();
			entrada_digitada = entrada_digitada.replaceAll("," , ".");
			salario_inicial = Double.parseDouble(entrada_digitada);
			if (salario_inicial >=0 && salario_inicial<=400.00) {
				salario_final = salario_inicial+(salario_inicial*percentual15);
					System.out.printf("Novo salario: %.2f\n", salario_final);
					System.out.printf("Reajuste ganho: %.2f\n", (salario_final-salario_inicial));
					System.out.printf("Em percentual: %.0f %%\n", (percentual15*100));
					
			}else if (salario_inicial >=400.01 && salario_inicial<=800.00) {
				salario_final = salario_inicial+(salario_inicial*percentual12);
					System.out.printf("Novo salario: %.2f\n", salario_final);
					System.out.printf("Reajuste ganho: %.2f\n", (salario_final-salario_inicial));
					System.out.printf("Em percentual: %.0f %%\n", (percentual12*100));
					
			}else if (salario_inicial >=800.01 && salario_inicial<=1200.00) {
				salario_final = salario_inicial+(salario_inicial*percentual10);
					System.out.printf("Novo salario: %.2f\n", salario_final);
					System.out.printf("Reajuste ganho: %.2f\n", (salario_final-salario_inicial));
					System.out.printf("Em percentual: %.0f %%\n", (percentual10*100));
					
			}else if (salario_inicial >=1200.01 && salario_inicial<=2000.00) {
				salario_final = salario_inicial+(salario_inicial*percentual07);
					System.out.printf("Novo salario: %.2f\n", salario_final);
					System.out.printf("Reajuste ganho: %.2f\n", (salario_final-salario_inicial));
					System.out.printf("Em percentual: %.0f %%\n", (percentual07*100));
					
			}else if (salario_inicial >2000) {
				salario_final = salario_inicial+(salario_inicial*percentual04);
					System.out.printf("Novo salario: %.2f\n", salario_final);
					System.out.printf("Reajuste ganho: %.2f\n", (salario_final-salario_inicial));
					System.out.printf("Em percentual: %.0f %%\n", (percentual04*100));				
			}
		}
		
	}//fim do metodo main
}//fim da classe
