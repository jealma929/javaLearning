public class Ejemplo02_02a {
	
	private static int sumaFrutas(int a, int b) { // definimos una nueva clase que solo funciona donde esta definido y le pasamos dos argumentos y retorna la suma
		return a+b;
	}
	public static void main(String[] args) {
		int numManzanas = 5;
		int numPeras = 4;
		
		System.out.println("el frutero tiene "+ sumaFrutas(numManzanas, numPeras)+ " frutas") ;// llamamos a la funcion
		
		float numeroPi = 3.14f;
		
		String saluda = "hola a todos"; //el tipo String no es un tipo de datos simple, es una clase con sus metodos.
		
		System.out.println ("el  numero pi es "+ numeroPi);
		
		System.out.println ("saludandote "+ saluda);
	}
}