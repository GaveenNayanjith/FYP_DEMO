package org.gavtfw.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ProjectProperties {

    private ProjectProperties() {
    }

    private static LoggerUtil logger = new LoggerUtil(ProjectProperties.class); //Why are we using private

    private static Map<String, String> readProperties() { //What are we using private
        Map<String, String> propertiesMap = new HashMap<>();
        try {
            InputStream inStream = ProjectProperties.class.getClassLoader().getResourceAsStream("properties/Project.properties");
            InputStreamReader reader = new InputStreamReader(inStream);
            Properties p = new Properties();
            p.load(reader);
            p.entrySet().forEach(x -> propertiesMap.put(x.getKey().toString(), x.getValue().toString()));
            reader.close();
            inStream.close();
        } catch (IOException e) {
            logger.logError(e);
        }
        return propertiesMap;
    }

    public static String getProperty(String key) {
        return System.getProperty(key, readProperties().get(key));
    }

    public static void setProperty(String key, String value) {
        System.setProperty(key, value);
    }


}
