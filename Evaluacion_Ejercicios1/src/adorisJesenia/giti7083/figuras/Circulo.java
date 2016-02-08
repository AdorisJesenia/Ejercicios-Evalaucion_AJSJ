/**
 * 
 */
package adorisJesenia.giti7083.figuras;

/**
 * @author Jessy
 *Clase que tiene relacion de herencia con figura
 */
public class Circulo extends Figura{
	//Atributos
private double radio = 3.5;
private Punto centro = null;
//Constructor de la clase
public Circulo(){
	System.out.println("Soy un circulo");
}

/**
 * 
 * @return radio get
 */
private double getRadio() {
	return radio;
}

/**
 * set this radio
 */
private void setRadio(double radio) {
	this.radio = radio;
}


	
}
