package Aula6;

import java.util.Scanner;
public class SenhaWhileAtv4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        String senha = "1234";
		int limite = 5;

        while (contador != limite) {
      
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();
            
            if (senha.equals("1234")) {
            	System.out.println("Acesso liberado.");
            	contador = 5;
            	}else {
            
            System.out.println("Senha incorreta. Tente novamente." + " Numero de tentativas: " + contador + " de " + limite);
            contador ++;
            	}
        }

        System.out.println("Senha incorreta.\nFim do sistema ");

        entrada.close();
    }
}
