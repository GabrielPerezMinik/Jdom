package jdom;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Main {

	public static void main(String[] args) throws JDOMException, IOException {
		
		SAXBuilder build=new SAXBuilder();
		File xml=new File("habitaciones.xml");
		Document habitaciones=build.build(xml);
		Element root=habitaciones.getRootElement();
		List<Element> habitacionlist=root.getChildren();
		
		
		for (Element habitacion : habitacionlist) {
			
			for (Element element : habitacion.getChildren()) {
				System.out.println(element.getName());
			System.out.println(element.getChildText("codHabitacion"));
			System.out.println(element.getChildText("codHotel"));
			System.out.println(element.getChildText("numHabitacion"));
			System.out.println(element.getChildText("capacidad"));
			System.out.println(element.getChildText("preciodia"));
			System.out.println(element.getChildText("activa"));
			}
		}

	}

}
