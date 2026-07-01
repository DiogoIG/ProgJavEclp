package Aula4;

import java.util.Scanner;

public class CondIfOficina {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double media;
		media = 2.9;
		
		if(media >= 7){
			System.out.printf("%.2f%nAprovado!", media);
			
			
			
		}else if(media >=4) {
			System.out.printf("%.2f%nRecuperação!", media);
			
		}else {
			
			System.out.printf("%.2f%nReprovado!", media);
		}
		
		
		
		
		
	}

}
