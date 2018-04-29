package framework;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigurationManager {
	private static PropertiesConfiguration propertiesConfiguration=null;
	
	public static void loadProperties() throws ConfigurationException
	{
		propertiesConfiguration=new PropertiesConfiguration("application.properties");
	}
	public static PropertiesConfiguration getBundle()
	{
		return propertiesConfiguration;
	}
	
	
}
