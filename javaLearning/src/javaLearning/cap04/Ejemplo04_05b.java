public class Ejemplo04_05b {
	
	private static final String FIN="fin";
	
	public static void main (String[] args) {
		
		if (args.length !=0) {
			System.out.println ("Se han recibido " + args.length + "argumentos: ");
			
			int i=0;
			String palabra;
			do {
				palabra=args[i];
				System.out.println(i + ")" + palabra);
				i++;
			} while (!palabra.equals(FIN) && i < args.length);
		}else {
			System.err.println ("No se han recibido argumentos");
		}
	}
}