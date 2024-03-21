package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("DanglingJavadoc")
public class ConfigReader {

    /**
     * This class  reads Configuration.properties file.
     * The method getProperty(String key); fetches
     * values from properties file using the key that's
     * provided as parameter.
     */
    private static FileInputStream input;
    private static Properties properties;

    static {
        String path = "C:\\Users\\aydar\\IdeaProjects\\CucumberAutomationFramework\\src\\test\\resources\\configurations\\Configuration.properties";

        try {
            input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            System.out.println("Path for properties file is not valid");
        } catch (IOException e) {
            System.out.println("Failed to load properties file");
        } finally {
            try {
                assert input != null;
                input.close();
            } catch (IOException e) {
                System.out.println("Exception occurred when trying to close the input object");
            }
        }
    }

    /**
     * This method accepts the key as String nad returns the value as String.
     */

    public static String getProperty(String key){

        return properties.getProperty(key);
    }

}
