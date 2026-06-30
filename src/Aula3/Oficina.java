package Aula3;

public class Oficina {

	public static void main(String[] args) {

		double
		v1,
		v2,
		soma, subtracao, multiplicacao, divisao, resto;
		
		v1 = 100; v2 = 21;
		soma = v1 + v2;
		
		subtracao = v1-v2;
		
		multiplicacao = v1 * v2;
		
		divisao = v1 / v2;
		
		resto = v1 % v2;
		
		System.out.println("Soma de: "+ v1 + "+" + v2 + " = " + soma);
		System.out.println("Subtração de:"+ v1 + "-" + v2 + " = " + subtracao);
		System.out.println("Multiplicação de: "+ v1 + "*" + v2 + " = " + multiplicacao);
		System.out.println("Divisão de: "+ v1 + "/" + v2 + " = " + divisao);
		System.out.println("Resto de: "+ v1 + "%" + v2 + " = " + resto);
		System.out.println("Mudança de saida");
		System.out.printf("Total: R$ %.2f%n", resto);
		
		
	}

}
