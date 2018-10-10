package common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ReadConfig implements Configurable{

    private static final Logger logger = LogManager.getLogger();

    private String browserName = null;
    private String browserDriver = null;
    private String driverPath = null;

    private String http = null;
    private String server = null;
    private String site = null;
    private String port = null;


    public ReadConfig(){
        logger.info("Constructor: Loading config.json into the system.");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        JsonNode tree_selenium;
        JsonNode tree_baseUrls;
        try {
            root = mapper.readTree(new File(CONFIG_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if( !root.isNull() ){
                tree_selenium = root.path("selenium");
                tree_baseUrls = root.path("baseUrl");
            }else {
                logger.error("config.json is empty!");
                throw new IllegalArgumentException("config.json is empty!");
            }
        }
        if( !tree_selenium.isNull() ){
            browserName = tree_selenium.get("browserName").asText();
            browserDriver = tree_selenium.get("browserDriver").asText();
            driverPath = tree_selenium.get("driverPath").asText();
        }
        if( !tree_baseUrls.isNull() ){
            http = tree_baseUrls.get("http").asText();
            server = tree_baseUrls.get("server").asText();
            site = tree_baseUrls.get("site").asText();
            port = tree_baseUrls.get("port").asText();
        }
    }

    public String getBrowserName() {
        return browserName;
    }

    public String getBrowserDriver() {
        return browserDriver;
    }

    public String getDriverPath() {
        return driverPath;
    }

    public String getHttp() {
        return http;
    }

    public String getServer() {
        return server;
    }

    public String getSite() {
        return site;
    }

    public String getPort() {
        return port;
    }

}
