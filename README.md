# AndroidSmartLogger
SmartLogger wraps the Android Log class functionalities to provide Development and Production based logging.In Android you should ideally remove logs before submitting Application to Play Store.So you just need to change LoggerType to PRODUCTION. Smart Logger let you select which mode to use for logging by selecting LoggerType.In Production Logger nothing will be logged.<br/>

SmartLogger does not uses if-else statements to check whether it is production mode or development mode. It simply takes advantage of Polimorphism to replace implementation at runtime.   

SmartLogger comes with two types of LoggerTypes:

<b>DEVELOPMENT</b> : It works as Android Log class <br/>
<b>PRODUCTION</b> : It does not prints anything on Logcat. Simply whatever you log is ignored.
You can select which logger to use while intializing the ApplicationLogger. What you need to do is just pass ```LoggerType``` in ```init()```.

SmartLogger supports following Log levels:
<ul>
<li>DEBUG</li>
<li>VERBOSE</li>
<li>WARN</li>
<li>INFO</li>
<li>ERROR</li>
</ul>
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
