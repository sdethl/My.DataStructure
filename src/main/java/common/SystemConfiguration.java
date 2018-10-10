package common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SystemConfiguration {

    protected String browserName;
    protected String browserDriver;
    protected String driverPath;

    public String baseUrl;

    private static final Logger logger = LogManager.getLogger();
    public SystemConfiguration(){
        logger.info("Constructor: Loading system configurations.");

        ReadConfig config = new ReadConfig();
        String http = config.getHttp();
        String server = config.getServer();
        String site = config.getSite();
        String port = config.getPort();
        baseUrl = http + server + site + port;

        browserName = config.getBrowserName();
        browserDriver = config.getBrowserDriver();
        driverPath = config.getDriverPath();
    }

    public String getUrl_login(){
        String str = getUrl(URLConstants.LOGIN);
        logger.info(str);
        return str;
    }

    //Home
    public String getUrl_myTasks(){
        return baseUrl + URLConstants.MY_TASKS;
    }
    public String getUrl_userRoles() {
        return baseUrl + URLConstants.USERS_ROLES;
    }
    public String getUrl_tasks() {
        return baseUrl + URLConstants.TASKS;
    }
    public String getUrl_callQueueManagement(){ return  baseUrl + URLConstants.CALL_QUEUE_MANAGEMENT; }
    public String getUrl_advancedSearch(){return  baseUrl + URLConstants.ADVANCED_SEARCH;}

    //User Management
    public String getUrl_UserManagement(){
        return baseUrl + URLConstants.USERS_LIST;
    }

    private String getUrl(String val){
        return baseUrl + val;
    }
}
