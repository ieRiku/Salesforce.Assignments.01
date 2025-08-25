package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	Properties pr;
	
	public ConfigLoader() throws IOException {
		FileInputStream fs = new FileInputStream("config/config.properties");
		pr = new Properties();
		pr.load(fs);
	}
	
	public String getProperty(String key) {
		return pr.getProperty(key);
	}
}
