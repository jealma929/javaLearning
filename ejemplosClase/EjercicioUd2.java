// EjercicioUd2
//
// 1.- 	hola,juan -- "que -- tal" -- estás -- ?  --> 5 argumentos
//
// 2.- d --> apellido1Padre
//
// 3.- existe error en la declaracion de la variable a. no compila 
//public class EjercicioUd2 {
//	public static void main (String[] args) {
//		int a 0 10;
//		int b = 1;
//		int c = a+b;
//		String d="Total: " + a + b + c;
//		System.out.println(d);
//	}
//}
//
// 4.- A=8/B=3 -- A=3/B=3
//public class EjercicioUd2 {
//	public static void main (String[] args) {
//		int a = 3;
//		int b = 8;
//		System.out.print("1)");
//		test(b, a);
//		System.out.print("2)");
//		test(a, a);
//	}
//	
//	private static void test(int a, int b) {
//		System.out.println("A=" + a + " B=" +b);
//	}
//}
//
// 5.- 3
//public class EjercicioUd2 {
//	public static void main (String[] args) {
//		int uno=1;
//		int res=suma(uno, suma(uno + uno, suma(-uno, uno * uno)));
//		System.out.println(res);
//	}
//	private static int suma(int a, int b) {
//		return a+b;
//	}
//}
//
// 6.- d--> int areaTriangulo(int base, int altura)
//
// 7.- b-->res = a + b / a + c /b: --> a + ( b/ a) + (c / b);
//
// 8.- a-->true  c >=(b/a) se cumple una de las condiciones de un or
//
// 9.- 
//public class EjercicioUd2 {
//	public static void main (String[] args) {
//		int argumentoUno = Integer.valueOf(args[0]);
//		int argumentoDos = Integer.valueOf(args[1]);
//		
//		System.out.println(argumentoUno + " \n "+ argumentoDos);
//	}
//}	
//
// 10.-
//public class EjercicioUd2 {
//	public static void main (String[] args) {
//		int argumento1 = Integer.valueOf(args[0]);
//		int argumento2 = Integer.valueOf(args[1]);
//		int argumento3 = Integer.valueOf(args[3]);
//		int argumento4 = Integer.valueOf(args[4]);
//		
//		System.out.println(args.length);
//	}
//}	
//
// 11.-
public class EjercicioUd2 {
	public static void main(String[] args) {
		int base = Integer.valueOf(args[0]);
		int altura = Integer.valueOf(args[1]);
		
		float area = Float.parseFloat((base * altura) /2);
		
		System.out.println("El area es "+ area);
	}
}
					