import java.time.*;
import java.time.format.*;

public class Funciones {
	
	public static void main(String[] args) {
		
		
		int int1;
		int int2;
		int int3;
		
		// Trabajamos con fechas y el formateo de fechas
		
		LocalDate lD1 = LocalDate.now();
		LocalDate lD2 = LocalDate.of(2000, 03, 20);
		LocalDate lD3 = LocalDate.parse("2024-03-20");
		LocalDate lD4 = lD1.plusDays (15);
		LocalDate lD5 = lD1.plusMonths(1);
		
		
		DateTimeFormatter dTF1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dTF2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String lD_S1 = lD1.format(dTF1);
		String lD_S2 = lD1.format(dTF2);
		
		System.out.println("\nLocalDate.now   "+ lD1);
		System.out.println("\nLocalDate.of    "+ lD2);
		System.out.println("\n         .parse "+ lD3);
		System.out.println("\nDateTimeFormatter "+ lD_S1);
		System.out.println("\nDateTimeFormatter "+ lD_S2);
		
		System.out.println("\nLocalDate.now dia de hoy   "+ lD1);
		System.out.println("\nLocalDate.plus 15 dias mas "+ lD4);
		System.out.println("\nLocalDate.plus 1 Mes mas "+ lD5.format(dTF2));
		
		int1 = lD1.getDayOfMonth();
		int2 = lD1.getMonthValue();
		int3 = lD1.getYear();
		
		System.out.println("\ndia de hoy "+ int1);
		System.out.println("\nmes de hoy "+ int2);
		System.out.println("\naño de hoy "+ int3);
		
		LocalDate lD6 = lD2.plusYears(18);
		System.out.println("\n18 años mas de "+lD2.format(dTF2)+ " es "+ lD6.format(dTF2));
		
		System.out.println("\n*******************************************");
		String s1 = asignaFecha (0);
		String s2 = asignaFecha (15);
		String s3 = asignaFecha (30);
		System.out.println("\n0--> "+s1+"  15--> "+s2+"  30--> "+s3);
	}
	
	public static String asignaFecha (int i) {
		LocalDate lD = LocalDate.now();
		lD = lD.plusDays (i);
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = lD.format(dTF);
		return fecha;
	}
}