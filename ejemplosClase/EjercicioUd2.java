// EjercicioUd2
//
// 1.- 	hola,juan -- "que tal" -- estás -- ?  --> 4 argumentos
//
// 2.- d --> apellido1Padre
//
/* 3.- existe error en la declaracion de la variable a. no compila 
		con a=10 --> como d es string y despues de la cadena a 
		imprimir hay un + de concatenaar string convierte los
		enteros a string y forma una cadena de caracteres 10111
*/
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		int a = 10;
		int b = 1;
		int c = a+b;
		String d="Total: " + a + b + c;
		System.out.println(d);
	}
}
*/
// 4.- A=8/B=3 -- A=3/B=3
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		int a = 3;
		int b = 8;
		System.out.print("1)");
		test(b, a);
		System.out.print("2)");
		test(a, a);
	}
	
	private static void test(int a, int b) {
		System.out.println("A=" + a + " B=" +b);
	}
}
*/
// 5.- 3
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		int uno=1;
		int res=suma(uno, suma(uno + uno, suma(-uno, uno * uno)));
		System.out.println(res);
	}
	private static int suma(int a, int b) {
		return a+b;
	}
}
*/
// 6.- d--> int areaTriangulo(int base, int altura)
//
// 7.- b-->res = a + b / a + c /b: --> a + ( b/ a) + (c / b);
//
// 8.- a-->true  c >=(b/a) se cumple una de las condiciones de un or
//
// 9.- ¿
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		int argumentoUno = Integer.valueOf(args[0]);
		int argumentoDos = Integer.valueOf(args[1]);
		
		System.out.println(argumentoUno + " \n "+ argumentoDos);
	}
}	
*/
// 10.- ¿
/*public class EjercicioUd2 {
	public static void main(String[] args) {
		int argumento1 = Integer.valueOf(args[0]);
		int argumento2 = Integer.valueOf(args[1]);
		int argumento3 = Integer.valueOf(args[3]);
		int argumento4 = Integer.valueOf(args[4]);
		
		System.out.println(args.length);
	}
}	
*/
//11.-¿
/*public class EjercicioUd2 {
	public static void main(String[] args) {
		int base = Integer.valueOf(args[0]);
		int altura = Integer.valueOf(args[1]);
		// hay que hacer un cass--> se pone el tipo al que queremos convertir entre
		//parentesis...(float)
		//float area =(float) (base * altura /2); // trunca el resultado
		float area =(float) (base * altura) /2; // no trunca el resultado
		
		System.out.println("El area es "+ area);
	}
}
*/
// 12.-¿
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		String primerApellido = args[0];
		String segundoApellido = args[1];
		String nombreHijo1 = args[2];
		String nombreHijo2 = args[3];
		String nombreHijo3 = args[4];
		String nombrePadre = args[5];
		String nombreMadre = args[6];
		
		System.out.println("Padre: "+nombrePadre +primerApellido);
		System.out.println("Madre: "+nombreMadre +primerApellido);
		System.out.println("Hijos: "+nombreHijo1 +primerApellido);
		System.out.println("       "+nombreHijo2 +primerApellido);
		System.out.println("       "+nombreHijo3 +primerApellido);
	}
}
*/
// 13.-	¿		
/*public class EjercicioUd2 {
	public static void main(String[] args) {
		int base = Integer.valueOf(args[0]);
		int altura = Integer.valueOf(args[1]);
		
		System.out.println("El area es "+ area(base , altura));
	}
	private static int area(int a,int b) {
		return a*b;
	}
}
*/
// 14.-¿
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		String primerApellido = args[0];
		String segundoApellido = args[1];
		String nombreHijo1 = args[2];
		String nombreHijo2 = args[3];
		String nombreHijo3 = args[4];
		String nombrePadre = args[5];
		String nombreMadre = args[6];
		
		pintar(nombrePadre, primerApellido, "");
 		pintar(nombreMadre, segundoApellido, "");
		pintar(nombreHijo1, primerApellido, segundoApellido);
		pintar(nombreHijo2, primerApellido, segundoApellido);
		pintar(nombreHijo3, primerApellido, segundoApellido);
		
	}
	private static void pintar (String n, String a1, String a2) {
		System.out.println( "Nombre: "+n+"  Apellidos: "+a1+" "+a2);
	}
}
*/
// 15.-¿
/*public class EjercicioUd2 {
	public static void main (String[] args) {
		String primerApellido = args[0];
		String segundoApellido = args[1];
		String nombreHijo1 = args[2];
		String nombreHijo2 = args[3];
		String nombreHijo3 = args[4];
		String nombrePadre = args[5];
		String nombreMadre = args[6];
		
		pintar(nombreCompleto(nombrePadre, primerApellido, ""));
		pintar(nombreCompleto(nombreMadre, segundoApellido, ""));
		pintar(nombreCompleto(nombreHijo1, primerApellido, segundoApellido));
		pintar(nombreCompleto(nombreHijo2, primerApellido, segundoApellido));
		pintar(nombreCompleto(nombreHijo3, primerApellido, segundoApellido));
		
	}
	private static String nombreCompleto (String n, String a1, String a2) {
		String nombrePersona = n+" "+a1+" "+a2;
		return nombrePersona ;
	}
	
	private static void pintar (String nombrePersona) {
		System.out.println("Nombre: "+nombrePersona);
	}

}
*/

