package MyCopyPastePanel;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropOpr {
	//static String USER_PROFILE;
	//static String INIT_FILE_PATH;

	public PropOpr() throws Exception {
	}

	static {
		Properties properties = new Properties();
		try {
			properties.load(Files.newBufferedReader(Paths.get(MyCopyPastePanel.properties_file), StandardCharsets.UTF_8));
		} catch (IOException e) {
			// failed reading properties file
			System.out.println(String.format("file not found %s", MyCopyPastePanel.properties_file));
		}
	}

	/*
	 * get properties value by key
	 */
	public static String getProperty(final String key, final Properties prop) {
		return getProperty(key, "", prop);
	}

	/*
	 * get properties value by key with return value
	 */
	public static String getProperty(final String key, final String defaultVal, final Properties prop) {
		return prop.getProperty(key, defaultVal);
	}
}
