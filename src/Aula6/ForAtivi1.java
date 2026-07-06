package Aula6;

public class ForAtivi1 {

	public static void main(String[] args) {
		
		// For para repetição
		
		
		String[] pessoas = {
				"Paula", "Carlos", "Jascinto Pinto", "Eduardo"
		};
		
		
		for (int i = 0 ; i < pessoas.length ; i++) {
			
			System.out.println((i+1) + ".Repetição: "+ pessoas[i]);
		}
		
		System.out.println("\n Valor de um array \nNome: " + pessoas[2] + "\nIndice: 2");
	}

}
