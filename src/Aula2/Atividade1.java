package Aula2;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
	
		String nome, profissao, email;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Digite seu email: ");
		email = input.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		input.nextLine();
		
		System.out.println("Digite sua profissão: ");
		profissao = input.nextLine();
		
		
		
		System.out.println("Cadastro de usuario:");
		System.out.println("Nome: "+ nome);
		System.out.println("Email: " + email);
		System.out.println("Idade:" + idade);
		System.out.println("Profissão: " + profissao);
		
		input.close();
		
	}

}
