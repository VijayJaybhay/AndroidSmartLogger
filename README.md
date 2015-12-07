# AndroidSmartLogger
SmartLogger wraps the Android Log class functionalities to provide Development and Production based logging.In Android you need to remove logs before submitting Application to Play Store.So you just need to change LoggerType to PRODUCTION. Smart Logger let you select which mode to use for logging by selecting LoggerType.In Production Logger nothing will be logged.

#How to use?

Follow these steps:<br/>
Step 1: Copy 'logger' package to your android application

Step 2: Create a custom class that extends ```android.app.Application``` class and initialize Logger as follows:
```
public class LoggerDemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationLogger.init(ApplicationLogger.LoggerType.PRODUCTION);
    }
}
```
Step 3: Now you can use logger to log as follows:
```
ApplicationLogger.d(TAG,"In onRestart");
```

For more details see LoggerDemo application 
