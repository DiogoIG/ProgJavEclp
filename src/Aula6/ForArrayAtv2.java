package Aula6;

public class ForArrayAtv2 {

    public static void main(String[] args) {

        String[] nomes = {"Ana", "Carlos", "Mariana", "João"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}