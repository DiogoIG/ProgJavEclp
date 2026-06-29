package Aula2;

import java.util.Scanner;
public class Scanneraplicacao {

	public static void main(String[] args) {
		
		String	nome;
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	
	nome = input.nextLine();
	
	System.out.println("O nome digitado foi: " + nome);
	
	input.close();
		
		
		
	}

}
