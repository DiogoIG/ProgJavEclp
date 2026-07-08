package Aula8.poo;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 89.90;
        produto1.estoque = 10;

        produto1.exibirDados();

        double total = produto1.calcularValorTotalEstoque();

        System.out.printf("Valor total em estoque: R$ %.2f%n", total);
    }
}