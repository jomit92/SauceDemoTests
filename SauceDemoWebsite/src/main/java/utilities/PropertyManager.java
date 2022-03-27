package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    static String filePath = "src/main/resources/configuration.properties";

    public String getProperty(String propertyName) {

        try {
            FileInputStream f = new FileInputStream(filePath);
            Properties p = new Properties();
            p.load(f);

            String propertyValue = p.getProperty(propertyName);

            return propertyValue;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    public void changeProperty(String key, String value) {
        Properties editProp = new Properties();
        try {
            FileInputStream editFi = new
                    FileInputStream(filePath);
            editProp.load(editFi);
            editProp.setProperty(key, value);
            editProp.store(new FileOutputStream(filePath), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
