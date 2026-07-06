package Aula6;

import java.util.Scanner;
public class WhileScanneratv1 {

	public static void main(String[] args) {
		
		int condicao= 1;
		int contador = 1;
		int limite = 5;
		Scanner input = new Scanner(System.in);
		String conteudo ;
		
		while(condicao == 1) {
			System.out.println("Tentativas: " + contador + " de " + limite);
			System.out.println("Digite alguma coisa: ");
			conteudo = input.nextLine();
			
			// o if pode usar o .equal
			if (contador == limite) {
				condicao = 0;
			}
			contador++;
		}
		
		
	}

}
