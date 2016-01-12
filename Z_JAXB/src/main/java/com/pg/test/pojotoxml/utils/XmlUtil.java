package com.pg.test.pojotoxml.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {

	public static String convertPojoToXml(Object objSrc, Class... classType) {

		String convertPojoToXml = null;
		try {

			JAXBContext classCntx = JAXBContext.newInstance(classType);
			
			Marshaller xmlMarsh = classCntx.createMarshaller();
			xmlMarsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter strWriter = new StringWriter();
			xmlMarsh.marshal(objSrc, strWriter);
			convertPojoToXml = strWriter.toString();
			
			/*JAXBSource  classJaxbSrc = new JAXBSource(classCntx,objSrc);
			StringWriter strXmlWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(strXmlWriter);

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			transformerFactory.setAttribute("indent-number", new Integer(2));
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(classJaxbSrc, xmlOutput);			
			convertPojoToXml = xmlOutput.getWriter().toString();*/
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return convertPojoToXml;

	}
	
	public static Object convertXmltoPojo(String url, Class classType){
		Object convertXmltoPojo = null;
		try {
			FileInputStream fis = new FileInputStream(url);
            BufferedReader buffRead = new BufferedReader(new InputStreamReader(fis,
                    "UTF8"));

            JAXBContext jaxbContext = JAXBContext.newInstance(classType);
			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
			convertXmltoPojo = unMarshaller.unmarshal(buffRead);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return convertXmltoPojo;
	}

}
