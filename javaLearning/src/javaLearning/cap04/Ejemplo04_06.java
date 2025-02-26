import java.util.Scanner;

public class Ejemplo04_06 {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);// crear el objeto scaner de la clase
		// objeto que escanea de la entrada estandar --> System.in
		// Scanner es una clase --> scanner es el objeto, con lo que se manipula 
		//en el programa... contiene informacion y puede realizar acciones o metodos
		
		System.out.println("¿Como te llamas?)");
		String nombre = scanner.nextLine();
		//objeto nombre de tipo string y le asignamos el valor de la funcion llamando
		//al metodo nextLine
		
		
		System.out.println("¡Hola, " + nombre +"| ¡Que tal?");
	}
}