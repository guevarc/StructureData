/**
 * 
 */
package fr.epita.carol.structuredData.services;

import java.io.File;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * @author tbrou
 *
 */
public class XmlTemplateService {
	
	
	
	
	public String convertXmlTemplateToHtmlString(){
		Configuration configuration = Configuration.getInstance();
		try {
			return xmlOperations(configuration.getTemplatePath(), configuration.getTransformationFilePath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	

	private static String xmlOperations(String sourceFilePath, String transformationFilePath) throws Exception {
		
		Transformer newTransformer = TransformerFactory.newInstance().
				newTransformer(new StreamSource(new File(transformationFilePath)));
		newTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
		newTransformer.setOutputProperty(OutputKeys.METHOD, "html");
		newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		StringWriter writer = new StringWriter();
		newTransformer.transform(
				new StreamSource(new File(sourceFilePath)), 
				new StreamResult(writer));
		return writer.toString();
		
	
	}
}
