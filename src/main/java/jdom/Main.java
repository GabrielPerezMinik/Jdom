package jdom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Main {

	public static void main(String[] args) throws JDOMException, IOException {
		
		SAXBuilder build=new SAXBuilder();
		File xml=new File("habitaciones.xml");
		Document habitaciones=build.build(xml);
		Element root=habitaciones.getRootElement();
		List<Element> habitacionlist=root.getChildren();
		
		
		for (Element habitacion : habitacionlist) {		
				
			System.out.println(habitacion.getChildTextTrim("codHotel"));
			
			for (Element element : habitacionlist) {
				
			System.out.println(habitacion.getChildTextTrim("Estancias"));
			System.out.println(habitacion.getChildTextTrim("Cliente"));
			}
		}

//		escribirXml();
		
	}

	
//	public static void escribirXml() throws IOException {
//		
//		Element root=new Element("Habitaciones");
//		Document habitacionDocument=new Document(root);
//		Element habitacion=new Element("habitacion");
//		Element codHabitacion= new Element("codHabitacion");
//		codHabitacion.setText("123456");
//		habitacion.addContent(codHabitacion);
//		root.addContent(habitacion);
//		XMLOutputter salida=new XMLOutputter();
//		salida.setFormat(Format.getPrettyFormat());
//		salida.output(habitacionDocument, new FileWriter("habitacion2.xml"));
//	}
	
}
