package com.pg.test.pojotoxml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.pg.test.pojotoxml.pojo.Car;
import com.pg.test.pojotoxml.pojo.CarFactory;
import com.pg.test.pojotoxml.utils.XmlUtil;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		
		String carXmlUrl = "C://Pradhap//Tech_//General_Tech_//Proj Mini//Z_TestJaxb//src//main//java//com//pg//test//pojotoxml//xml//";
		
		//pojoToXml(carXmlUrl);
		//pojoToXml(carXmlUrl,CarFactory.class);
		
		Car carObj = (Car)xmlToPojo(carXmlUrl+Car.class.getSimpleName()+ ".xml", Car.class);
		CarFactory carFactObj = (CarFactory)xmlToPojo(carXmlUrl+CarFactory.class.getSimpleName()+ ".xml", CarFactory.class);
		
	}

	private static void pojoToXml(String xmlUrl, Class classType){
	
		if(classType.equals(CarFactory.class)){
			
			String carFactoryXmlUrl = xmlUrl+CarFactory.class.getSimpleName()+ ".xml";
			
			Car carObj = new Car("Toyota", "Camry");
			Car carObj2 = new Car("BMW", "series1");
			Car carObj3 = new Car("Chevy", "sport");
			
			List<Car> carLst = new ArrayList<Car>();
			carLst.add(carObj);
			carLst.add(carObj2);
			carLst.add(carObj3);
			
			CarFactory carFactory = new CarFactory("Miami",carLst);
			
			String carFactoryXml = XmlUtil.convertPojoToXml(carFactory, CarFactory.class);
			
			System.out.println(" carFactory converted to XML"
					+ carFactoryXml);
			try {
				File file = new File(carFactoryXmlUrl);
				
				FileOutputStream foutstream = new FileOutputStream(file);
				foutstream.write(carFactoryXml.getBytes());
				foutstream.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private static Object xmlToPojo(String xmlUrl, Class classType){
		return XmlUtil.convertXmltoPojo(xmlUrl, classType);
	}
	
	private static void pojoToXml(String carXmlUrl) {
		System.out.println("Hello World!");
		Car carObj = new Car("Honda", "Accord");
		
		String carXml = XmlUtil.convertPojoToXml(carObj, Car.class);
		
		System.out.println(" Car converted to XML"
				+ carXml);
		//App.class.getClassLoader();
		//App.class.getClassLoader().findResource("Car.xml");
		/*URL url = App.class.getClassLoader().getResource("Car.xml");
		String filesPathAndName = url.getPath();    	
		System.out.println(" filesPathAndName "+filesPathAndName);*/
		
		//Scanner myScanner = new Scanner(new File(filesPathAndName))
		
		//File file = new File("C://Pradhap//Tech_//General_Tech_\\Proj Mini\\Z_TestJaxb\\src\\main\\java\\com\\pg\\test\\pojotoxml\\xml\");
		try {
			String carFactoryXmlUrl = carXmlUrl+CarFactory.class.getSimpleName()+ ".xml";			
			File file = new File(carXmlUrl);
			
			FileOutputStream foutstream = new FileOutputStream(file);
			foutstream.write(carXml.getBytes());
			foutstream.flush();
			
			/*FileWriter fWriter = new FileWriter(file);
			XMLOutputFactory outFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xmlWrite = outFactory.createXMLStreamWriter(fWriter);
			xmlWrite.writeCharacters(carXml);
			xmlWrite.flush();
			xmlWrite.close();*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
