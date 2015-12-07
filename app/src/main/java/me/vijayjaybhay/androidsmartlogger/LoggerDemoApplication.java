package me.vijayjaybhay.androidsmartlogger;

import android.app.Application;
import logger.ApplicationLogger;

/**
 * Created by Jaybhay Vijay on 12/7/2015.
 */
public class LoggerDemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationLogger.init(ApplicationLogger.LoggerType.PRODUCTION);
    }
}
