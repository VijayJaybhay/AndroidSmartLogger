package logger;

/**
 * Created by Jaybhay Vijay on 12/6/2015.
 */
public class LoggerFactory {

    public static Logger getApplicationLogger(ApplicationLogger.LoggerType loggerType){
        switch (loggerType){
            case DEVELOPMENT:
                return new DevelopmentLogger();
            case PRODUCTION:
                return new ProductionLogger();
        }
        return null;
    }
}
