package logger;

import android.util.Log;

/**
 * Created by Jaybhay Vijay on 12/6/2015.
 */
public class DevelopmentLogger implements Logger {

    @Override
    public int v(String tag, String msg) {
        return Log.v(tag,msg);
    }

    @Override
    public int v(String tag, String msg, Throwable tr) {
        return Log.v(tag,msg,tr);
    }

    @Override
    public int d(String tag, String msg) {
        return Log.d(tag,msg);
    }

    @Override
    public int d(String tag, String msg, Throwable tr) {
        return Log.d(tag,msg,tr);
    }

    @Override
    public int i(String tag, String msg) {
        return Log.i(tag,msg);
    }

    @Override
    public int i(String tag, String msg, Throwable tr) {
        return Log.i(tag,msg,tr);
    }

    @Override
    public int w(String tag, String msg) {
        return Log.w(tag,msg);
    }

    @Override
    public int w(String tag, String msg, Throwable tr) {
        return Log.w(tag,msg,tr);
    }

    @Override
    public int w(String tag, Throwable tr) {
        return Log.w(tag,tr);
    }

    @Override
    public int e(String tag, String msg) {
        return Log.e(tag,msg);
    }

    @Override
    public int e(String tag, String msg, Throwable tr) {
        return Log.e(tag,msg,tr);
    }

    @Override
    public String getStackTraceString(Throwable tr) {
        return Log.getStackTraceString(tr);
    }

    @Override
    public int println(int priority, String tag, String msg) {
        return Log.println(priority,tag,msg);
    }
}
