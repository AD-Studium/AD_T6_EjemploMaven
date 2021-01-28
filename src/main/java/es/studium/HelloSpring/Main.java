/**
 * 
 */
package es.studium.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Main {

	/**
	 * main ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getMensaje());
		//Cerramos el contenedor abierto utilizando un configurable ya que ApplicationContext no tiene método close
		((ConfigurableApplicationContext) appContext).close();

	}
}
