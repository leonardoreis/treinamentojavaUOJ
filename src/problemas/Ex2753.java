package problemas;

public class Ex2753 {
	public static void main (String[] Args) {

		Integer array[] = new Integer[26];
			
		array[0] = 97;
		for (int i = 1; i < 26; i++) {
			array [i] = array[i-1]+1;
		}
		//array[0] = 97;
		for (int x = 0; x < 26; x++) {
			System.out.println(array[x] +" e "+ (char)+array[x]   );
		}

	}//fim do método main
}//fim da classe
