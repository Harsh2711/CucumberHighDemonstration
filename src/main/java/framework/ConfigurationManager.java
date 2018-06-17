package framework;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class ConfigurationManager {
	private static PropertiesConfiguration propertiesConfiguration = null;

	public static void loadProperties() {
		File dir = new File("src/test/resources");
		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		propertiesConfiguration = new PropertiesConfiguration();
		for (File file : files) {
			try {
				propertiesConfiguration.load(file.getCanonicalPath());
			} catch (ConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static PropertiesConfiguration getBundle() {
		return propertiesConfiguration;
	}

}
