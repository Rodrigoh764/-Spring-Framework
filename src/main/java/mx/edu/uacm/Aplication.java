package mx.edu.uacm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplication {

	public static void main(String[] args) {
		
		/*Ninja ninja = new Ninja();
		
		ninja.setArma(new Chacos());
		
		ninja.setMision("pasar nivel uno");*/
		
		
		
		application Context contenedor = new ClassPathXmlApplicationContext("/context.xml");
		
		Ninja ninja = (Ninja) contenedor.getBean("ninja");
		
		log.debug("arma del ninja: " + ninja.getArma());
		
	}
}
