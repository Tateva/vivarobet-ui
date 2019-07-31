package am.qa.vivarobet.util;

import java.io.FileReader;
import java.util.Properties;

public class ReadFromFileUtil {

	public static String readPropertyByName(String name) throws Exception {
		FileReader reader = new FileReader("src/main/resources/user.properties");

		Properties p = new Properties();
		p.load(reader);

		return p.getProperty(name);
	}
}
