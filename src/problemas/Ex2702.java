package problemas;

import java.util.Scanner;

public class Ex2702 {
	
	public static String Estoque[] = new String[3];
	public static String Pedidos[] = new String[3];
		
	public static void main (String[] Args) {
		Scanner teclado = new Scanner(System.in);
			String linha1 = teclado.nextLine();
			String linha2 = teclado.nextLine();
		teclado.close();
		
		Estoque = linha1.split(" ");
		Pedidos = linha2.split(" ");
		
		//tratamento para conversão:
		for (int i = 0; i < 3; i++) {
			Estoque[i].trim();
			Pedidos[i].trim();
		}
		
		int estoque_frango = Integer.parseInt(Estoque[0]);
		int estoque_bife = Integer.parseInt(Estoque[1]);
		int estoque_massa = Integer.parseInt(Estoque[2]);
		
		int pedido_frango = Integer.parseInt(Pedidos[0]);
		int pedido_bife = Integer.parseInt(Pedidos[1]);
		int pedido_massa = Integer.parseInt(Pedidos[2]);
		
		int pedidos_nao_atendidos = 0; 
		
		if(pedido_frango > estoque_frango) {
			pedidos_nao_atendidos = pedidos_nao_atendidos + (pedido_frango - estoque_frango); 
		}
		if(pedido_bife > estoque_bife) {
			pedidos_nao_atendidos = pedidos_nao_atendidos + (pedido_bife - estoque_bife); 
		}
		if(pedido_massa> estoque_massa) {
			pedidos_nao_atendidos = pedidos_nao_atendidos + (pedido_massa - estoque_massa); 
		}
		
		System.out.println(pedidos_nao_atendidos);
		
	}//fim do metodo main
}//fim da classe
