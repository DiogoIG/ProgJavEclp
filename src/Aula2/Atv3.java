package Aula2;

import java.util.Scanner;

public class Atv3 {
	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        String nome;
	        int idade;

	        System.out.print("Digite o nome do aluno: ");
	        nome = entrada.nextLine();

	      
	        System.out.print("Digite a idade do aluno: ");
	        idade = entrada.nextInt();

	        System.out.println("===== DADOS DO ALUNO =====");
	        System.out.println("Nome: " + nome);

	       
	        System.out.println("Idade: " + idade + " anos");

	        entrada.close();
	    }
		
	}
	


