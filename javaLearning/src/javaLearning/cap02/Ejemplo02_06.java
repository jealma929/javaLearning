public class Ejemplo02_06 {
	public static void main (String[] args){
		int x = 3;
		int y = 3;
		System.out.println ("x: " + x);
		System.out.println ("y: " + y);
		System.out.println ("x == y? " + (x == y));
		System.out.println ("x != ? " + (x != y));
		String a = new String("hola");
		String b = new String("hola");
		System.out.println ("a: " + a);
		System.out.println ("b: " + b);
		System.out.println ("a == b? " + (a == b));
		System.out.println ("a != b? " + (a != b));
	}
}
// cuando comparamos los string son entidades no numero por lo tanto nos inidica que la 
// igualdad es falsa. si quisiesemos comparlos tendria que ser con los valores de la 
// entidad, no con ellos mismos