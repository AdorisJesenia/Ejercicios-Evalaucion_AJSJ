/**
 * 
 */
package adorisJesenia.giti7083.telefonos;

import java.util.Scanner;


/**
 * @author Jessy
 *
 */
public class TestTelefonos {
	public void Test(){
		Telefono telefono;
		VideoPlayer videoPlayer;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige uno : "+"\n 1 Telefono Movil"+"\n 2 Telefono Fijo"+"\n 3 Video Telefono");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			telefono= new TelefonoMovil();
			break;
		case 2:
			
			telefono= new TelefonoFijo();
			break;
		case 3:
			videoPlayer= new VideoTelefono();
			break;
		

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestTelefonos().Test();
	}

}
