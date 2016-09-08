import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ipartek.formacion.service.GuerreroHablaService;

public class App {

	public static void main(String[] args) {

		/*
		 * final GuerreroHablaService service = new GuerreroHablaService();
		 * System.out.println(service.hablar());
		 * 
		 * final IGuerreroHablable gHumano = new GuerreroHumano();
		 * service.setGuerrero(gHumano); System.out.println(service.hablar());
		 */

		final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		final GuerreroHablaService service = (GuerreroHablaService) context.getBean("servicioGuerrero");
		System.out.println(service.hablar());

	}

}
