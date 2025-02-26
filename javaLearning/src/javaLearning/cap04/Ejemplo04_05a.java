public class Ejemplo04_05a {
	// Acuerdate de usar cosntantes
	private static final String FIN ="fin";
	
	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos:");
		
		//El bucle while itera hasta que se cumple la condicion
		//No podemos olvidar controla la posicion
		int i = 0; // Punto de inicio
		do { // condicion de terminacion
			System.out.println(i + ")" + args[i]);
			i++; // actualizacion de contador
		} while (i< args.length && !args[i].equals(FIN));
		
		// como la i fue declarada fuera del bucle, aqui aun podemos usarla
		System.out.println ("\"fin\" estaba en la posicion nº " + i);	
	}
}