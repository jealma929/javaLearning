/*  Escribir un programa que reciba el numero de mes y devuelva
	el numero de dias que tiene.Ignora los años bisiestos.
	Solo debes hacer algo si recibes 1 solo parametro.
*/

public class Ejercicio03_04 {
	public static void main (String[] args) { 
		int mes = Integer.valueOf(args[0]);
		
		if (mes>12) {
			System.err.println("El numero de mes no es correcto");
		}else {
			System.out.println(calculaDias(mes));
		}
	}
 	private static int calculaDias(int mes) {
 		int dias; 		
 		if (mes%2 != 0) {
 			if (mes < 6) {
 				dias=31;
 			}
 			else {
 				dias=30;
 			}
 		}
 		else {
 			if (mes==2) {
 				dias=28;
 			}
 			else {
 				if (mes==4) {
 					dias=30;
 				}
 				else {
 					dias=31;
 				}
 			}
 		}
 		
 		return dias;
 	}
}