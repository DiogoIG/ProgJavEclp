package Aula5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DataeHora {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime datahora = LocalDateTime.now();
		
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String databr = data.format(dataformatada);
		DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horabr = hora.format(horaformatada);
		
		System.out.println("Data: " + databr);
		System.out.println("Hora: " + horabr);
		
		System.out.println("Data: " + data + "Hora: " + hora);
		System.out.println("\n -----------------------------------\n");
		System.out.println("Data hora: " + datahora);
		
		
		
		
		
		
	}
}
