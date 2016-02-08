/**
 * 
 */
package adorisJesenia.giti7083.futbool;

import java.util.Scanner;


/**
 * @author Jessy
 *Clase para probar
 */
public class TestFutbool {
	public void Test(){
		IntegranteSeleccionFutbool integrante;
		
	   Scanner scanner= new Scanner(System.in);
		System.out.println("Integrante de seleccion elige uno : "+"\n 1 Futbolista"+"\n 2 Masajista"+"\n 3 Entrenador");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			integrante= new Futbolista();
			break;
		case 2:
			
			integrante= new Masajista();
			break;
		case 3:
			integrante= new Entrenador();
			break;
		

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestFutbool().Test();
	}
	

}
