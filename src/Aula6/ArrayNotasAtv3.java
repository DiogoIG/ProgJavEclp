package Aula6;

public class ArrayNotasAtv3 {

    public static void main(String[] args) {

        double[] notas = {3.5, 8.0, 10.0};
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        media = soma / notas.length;

        System.out.printf("Média do aluno: %.2f%n", media);
    }
}