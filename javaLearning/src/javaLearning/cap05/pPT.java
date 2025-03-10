import java.util.Scanner;
import java.util.Random;

public class pPT {
	public static void main(String[] args) {
		System.out.println(" ----------------------------------------------"
		+ "\n -  Vamos a jugar a Piedra - Papel - Tijera     -"
		+ "\n -                                              -"
		+ "\n -  Elije entre PIEDRA(1) PAPEL(2) o TIJERA(3)  -"
		+ "\n -                                              -"
		+ "\n -  Debes de saber que: PIEDRA gana a TIJERA    -"
		+ "\n -                      TIJERA gana a PAPEL     -"
		+ "\n -                      PAPEL  gana a PIEDRA    -"
		+ "\n ---------------------------------------------");
		int respuesta;
		int i;
		int jugada;
		int resultado;
		//Int jugada=(int)(((Math.random()*30)+1)/10+1);
		
		Scanner scanner = new Scanner(System.in);
		
		Random random= new Random();
		
		System.out.println("    ( PIEDRA (1)   PAPEL (2)  TIJERA (3) )    ");
		System.out.println("\n\n    Dame tu jugada         (0)-->Salir    ");
		
		do {
			jugada=(random.nextInt(3)+1);
			respuesta=scanner.nextInt();
			if ((respuesta != 1 && respuesta != 2) && (respuesta != 3 && respuesta != 0)) {
				System.out.println("\n La jugada es incorrecta, intentalo de nuevo ");	
			}
			if (respuesta!=0); {
				resultado = comparar ( jugada, respuesta );
				System.out.println("el resultado de la comparaciona es " +resultado);
				if (resultado ==1) {
					System.out.println("\nLo siento pero HA ganado el ordenador");
				}
				else {
					if (resultado==2) {
						System.out.println("\nFelicidades HAS ganado al ordenador");
					}
					else {
						if (resultado==3) {
							System.out.println("\n No hay ganadores ni vencidos");
						}
					}					
				}
			}
			System.out.println(jugada);
		} while ((respuesta != 1 || respuesta != 2) || (respuesta != 3 || respuesta != 0));
	}
	
	public static int comparar(int o, int j) {
		int a=2; // 0-->gana ordenador   1-->gana jugador    2--> empate 
		System.out.println("estoy en el comparadador");
			if (o==j) {
				//return (2);
				a=2;
			}
			if (o==1 && j==2 || o==2 && j==1) {
				if (o<j) {
					//return (1);
					a=1;
				}
				else {
						//return (0);
					a=0;
					}
			}
			if (o==2 && j==3 || o==3 && j==2) {
					if (o<j) {
						//return (0);
						a=0;
					}
					else {
						//return (1);
						a=1;
					}
			}	
			if (o==1 && j==3 || o==3 && j==1) {
					if (o<j) {
						//return (0);
						a=0;
					}
					else {
						//return (1);
						a=1;
					}
			}
	return (a);
	}
}