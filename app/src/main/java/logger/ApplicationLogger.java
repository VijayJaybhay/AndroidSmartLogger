package logger;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.logging.Logger;

/**
 * Created by Jaybhay Vijay on 12/6/2015.
 */
public class ApplicationLogger{

    @NonNull
    private static logger.Logger logger;
    private ApplicationLogger(){
    }

    public static void init(LoggerType loggerType){
        logger=LoggerFactory.getApplicationLogger(loggerType);
    }

    public static int v(String tag, String msg) {
        return logger.v(tag,msg);
    }

    public static int v(String tag, String msg, Throwable tr) {
        return logger.v(tag,msg,tr);
    }

    public static int d(String tag, String msg) {
        return logger.d(tag,msg);
    }

    public static int d(String tag, String msg, Throwable tr) {
        return logger.d(tag,msg,tr);
    }

    public static int i(String tag, String msg) {
        return logger.i(tag,msg);
    }

    public static int i(String tag, String msg, Throwable tr) {
        return logger.i(tag,msg,tr);
    }

    public static int w(String tag, String msg) {
        return logger.w(tag,msg);
    }

    public static int w(String tag, String msg, Throwable tr) {
        return logger.w(tag,msg,tr);
    }

    public static int w(String tag, Throwable tr) {
        return w(tag,tr);
    }

    public static int e(String tag, String msg) {
        return logger.e(tag,msg);
    }

    public static int e(String tag, String msg, Throwable tr) {
        return logger.e(tag,msg,tr);
    }

    public static String getStackTraceString(Throwable tr) {
        return logger.getStackTraceString(tr);
    }

    public static int println(int priority, String tag, String msg) {
        return logger.println(priority,tag,msg);
    }

    public enum LoggerType{
        DEVELOPMENT,PRODUCTION
    }

}
