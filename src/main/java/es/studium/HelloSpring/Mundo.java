/**
 * 
 */
package es.studium.HelloSpring;

/**
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Mundo {
	private String mensaje;
	/**
	 * Contructor sin parametro
	 */
	public Mundo() {
		this.mensaje="";
	}
	/**
	 * Constructor con parametro
	 * @param mensaje 
	 */
	public Mundo(String mensaje) {
		this.mensaje = mensaje;
	}
	/**
	 * Optiene mensaje
	 * @return String mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * Establece mensaje
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
