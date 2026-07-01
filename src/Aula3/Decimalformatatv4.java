package Aula3;
import java.text.DecimalFormat;

public class Decimalformatatv4 {


	public class ExemploDecimalFormat {

	    public static void main(String[] args) {

	        double valor = 1234.567;

	        DecimalFormat formato = new DecimalFormat("#,##0.00");

	        System.out.println("Valor formatado: " + formato.format(valor));
	    }
	}

}
