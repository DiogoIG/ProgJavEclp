package Aula2;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao sistema.");

        entrada.close();
    }
}