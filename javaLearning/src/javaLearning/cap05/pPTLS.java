import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.Random;

public class pPT {
	
	// Creamos la tabla y la llenamos de datos	
	JTable jt = new JTable (5,5);
	for (int=1;i<=5; i++) {
		for (int=j; j<=5; i++) {
			if (i==j) {
			 jt.setValueAt(0,i,j);
			}
			if(i==0 && (j==2 || j==3) || (i==1 && (j==0 || j==4)) || (i==2 && (j==1 || j ==3)) ||
			  (i==3 && (j==1 || j==4) || (i==4 && (j==0 || j==2)) {
				  jt.setValueAt(1,i,j);
			} else {
				jt.setValueAt(2,i,j);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(" ------------------------------------------------"
		+ "\n -  Vamos a jugar a Piedra - Papel - Tijera - Lagarta -Spock   -"
		+ "\n -                                                             -"
		+ "\n -  Elije PIEDRA(1) PAPEL(2) TIJERA(3) LAGARTO(4) SPOCK(5)     -"
		+ "\n -                                                             -"
		+ "\n -  Debes de saber que: PIEDRA aplasta a TIJERA                -"
		+ "\n -                      TIJERA corta a PAPEL                   -"
		+ "\n -                      PAPEL  tapa a PIEDRA                   -"
		+ "\n -                      PIEDRA aplata a LAGARTO                -"
		+ "\n -                      LAGARTO envenena a SPOCK               -"
		+ "\n -                      SPOCK rompe TIJERAS                    -"
		+ "\n -                      TIJERAS decapitan LAGARTO              -"
		+ "\n -                      LAGARTO devora PAPEL                   -"
		+ "\n -                      PAPEL desautoriza SPOCK                -"
		+ "\n -                      SPOCK vaporiza PIEDAR                  -"
		+ "\n -                      PIEDRA aplasta a TIJERAS               -"
		+ "\n ---------------------------------------------------------------");
		int respuesta;
		int i;
		int jugada;
		int resultado;
		//Int jugada=(int)(((Math.random()*50)+1)/10+1);
		
		Scanner scanner = new Scanner(System.in);
		
		Random random= new Random();
		
		System.out.println("\n\n    Dame tu jugada         (0)-->Salir    ");
		
		do {
			jugada=(random.nextInt(5)+1);
			
			respuesta=scanner.nextInt();
			
			if (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4 &&
				respuesta != 5 && respuesta != 0)) {
				System.out.println("\n La jugada es incorrecta, intentalo de nuevo ");	
			}
			else (respuesta!=0); {
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