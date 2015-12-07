package logger;

import android.util.Log;

/**
 * Created by Jaybhay Vijay on 12/6/2015.
 */
public interface Logger {
    int v(String tag, String msg);
    int v(String tag, String msg, Throwable tr);
    int d(String tag, String msg);
    int d(String tag, String msg, Throwable tr);
    int i(String tag, String msg);
    int i(String tag, String msg, Throwable tr);
    int w(String tag, String msg);
    int w(String tag, String msg, Throwable tr);
    int w(String tag, Throwable tr);
    int e(String tag, String msg);
    int e(String tag, String msg, Throwable tr);
    String getStackTraceString(Throwable tr);
    int println(int priority, String tag, String msg);
}
