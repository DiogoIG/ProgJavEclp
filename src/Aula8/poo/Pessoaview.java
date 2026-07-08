package Aula8.poo;

public class Pessoaview {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome = "Paula Lins";
		pessoa1.idade = 67;
		pessoa1.nacionalidade = "Brasileira";
		
		pessoa1.sexo = "Feminino";
		pessoa1.profissao = "Farmaceutico";
		pessoa1.altura = 1.75;
		pessoa1.peso = 66;
		
		
		pessoa2.nome = "Jacintto Pinto";
		pessoa2.idade = 99;
		pessoa2.nacionalidade = "Brasileiro africano";
		
		pessoa2.sexo = "Masculino";
		pessoa2.profissao = "Vagabundo";
		pessoa2.altura = 1.80;
		pessoa2.peso = 88;
		
		pessoa1.exibirPessoa();
		pessoa1.exibirDadosExtras();
		System.out.println("\n-------------------------------\n");
		pessoa2.exibirPessoa();
		pessoa2.exibirDadosExtras();
		

	}

}
