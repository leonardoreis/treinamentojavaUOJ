package problemas;

public class Ex1097 {
	public static void main (String[] Args) {
		
		for (int i = 1; i <= 9; i+=2) {
			for (int j = (i+6); j > (i+3); j--){
				System.out.println("I="+ i + " J="+ j );
			}
		}
		
	}//fim do metodo main
}//fim da classe
