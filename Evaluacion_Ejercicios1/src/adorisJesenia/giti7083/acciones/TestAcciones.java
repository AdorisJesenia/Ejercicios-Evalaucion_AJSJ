/**
 * 
 */
package adorisJesenia.giti7083.acciones;

import java.util.Scanner;

import adorisJesenia.giti7083.pelota.Llanta;
import adorisJesenia.giti7083.pelota.PelotaFutbool;


/**
 * @author Jessy
 *
 */
public class TestAcciones {
	public void Test(){
		AccionesHumano accionesHumano;
		AccionesSeresVivos accionesSeresVivos;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige uno para ver caracteristicas: "+"\n 1 Hombre"+"\n 2 Mujer"+"\n 3 Gato"+"\n 4 Perro");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			accionesHumano= new Hombre();
			break;
		case 2:
			
			accionesHumano= new Mujer();
			break;
		case 3:
			accionesSeresVivos= new Gato();
			break;
		case 4:
			
			accionesSeresVivos= new Perro();
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestAcciones().Test();
	}
}
