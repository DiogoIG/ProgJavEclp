package Aula8.poo;

public class Produto {

    String nome;
    double preco;
    int estoque;

    void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque);
    }

    double calcularValorTotalEstoque() {
        return preco * estoque;
    }
}