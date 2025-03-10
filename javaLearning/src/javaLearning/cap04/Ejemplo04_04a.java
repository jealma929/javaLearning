public class Ejemplo04_04a {
	//Acuardate de usar constantes
	private static final String FIN ="fin";
	
	public static void main(String[] args) {
		System.out.println("Se ha recibido " + args.length + " argumentos:");
		
		/* El bucle while itera hasta que se cumple la condicion
		 * No podemos olvidadr controlar la posicion
		*/
		int i=0; // Punto de incio
		// CUIDADO!!! no podemos comparar strings con ==
		while (i < args.length)
			if (!args[i].equals(FIN)) { // condicion de terminacion
			//args[i].equals(FIN) da True si el args[i] coincide con FIN
				System.out.println(i + ")" + args[i]);
				
			}
			else {
				//(args[i].equals(FIN)) 
				imprimePos(i);
			}
						
			i++; // actualización
		}
			
	}
		
		// Como la i fue declarada fuera del bucle, aquí aún podemos usarla.
		private void imprimePos(int i) {
			System.out.println("\"fin\" estaba en la posicion nº " + i);
			return;
			
		}
	
