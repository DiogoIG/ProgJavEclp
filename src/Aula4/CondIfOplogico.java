package Aula4;

public class CondIfOplogico {

	public static void main(String[] args) {
		int idade, opcao;
		double renda;
		boolean ativo;
		
		idade = 55;
		opcao = 1;
		renda = 2450;
		ativo = false;
		
		
		if(idade >= 18 && renda >= 1500) {
			System.out.println("Cadastro aprovado.");
		}else {
			System.out.println("Cliente fora dos padrões.");
		}
		if(opcao== 1 || opcao == 2) {
			System.out.println("Opções validas");
		}else {
			System.out.println("Opção invalida");
		}
		if (!ativo) {
			System.out.println("Sistema inativo." + ativo);
		}
		
	}

}
