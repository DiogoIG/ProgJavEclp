package Aula3;

import java.text.NumberFormat;
public class Numberjformatv3 {
	public class ExemploNumberFormatMoeda {

	    public static void main(String[] args) {

	        double valor = 1234.5;

	        NumberFormat moeda = NumberFormat.getCurrencyInstance();

	        System.out.println("Valor formatado: " + moeda.format(valor));
	    }
	}


}
