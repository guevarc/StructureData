/**
 * 
 */
package fr.epita.carol.structuredData.services;

import javax.servlet.ServletContext;

/**
 * @author tbrou
 *
 */

//TODO : inject from Spring
public class Configuration {

	private static Configuration configuration;
	
	private String currentPath = "/test/conf";
	
	private Configuration(){
		
	}
	
	private static void initConf(ServletContext sc){
		configuration = new Configuration();
		configuration.currentPath = sc.getRealPath("/WEB-INF");
	}
	
	private static void initConf(){
		configuration = new Configuration();
	}
	
	public String getTransformationFilePath(){
		return this.currentPath + "/identityTransform.xsl";
	}
	
	public String getTemplatePath(){
		return this.currentPath + "/formTemplate.xml";
	}
	
	public static Configuration getInstance(){
		if (configuration == null){
			initConf();
		}
		return configuration;
		
	}
	public static Configuration getInstance(ServletContext sc){
		if (configuration == null){
			initConf(sc);
		}
		return configuration;
		
	}
	
}
