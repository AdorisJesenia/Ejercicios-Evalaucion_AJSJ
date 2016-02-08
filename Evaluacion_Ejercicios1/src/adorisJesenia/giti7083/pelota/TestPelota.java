/**
 * 
 */
package adorisJesenia.giti7083.pelota;

import java.util.Scanner;

/**
 * @author Jessy
 *Clase para probar
 */
public class TestPelota {
	public void Test(){
		Rebotable rebotable;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige uno para ver caracteristicas: "+"\n 1 PelotaFutbool"+"\n 2 Llanta");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			rebotable= new PelotaFutbool();
			break;
		case 2:
			
			rebotable= new Llanta();
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestPelota().Test();
	}

}
