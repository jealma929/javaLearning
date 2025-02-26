public class Ejemplo04_01 {
	public static void main(String[] args) {
		/*	El bucle "for each" (aunque realment se escribe for), recorre
		 * todos los elementos de una coleccion. En cada iteracion, s tendrá el
		 * valor de uno de los elementos, y podemos hacer con ella lo que haríamos
		 * con culaquier otra variable.
		 */
		for (String s: args) {
			System.out.println(s);
		}
	}
}