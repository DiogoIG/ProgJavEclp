package Aula3;

public class Dataformatv1 {

public class ExemploStringFormat {

    public static void main(String[] args) {

        double preco = 49.9;

        String mensagem = String.format("Preço formatado: R$ %.2f", preco);

        System.out.println(mensagem);
    }
}
}
