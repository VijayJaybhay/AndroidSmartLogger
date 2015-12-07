/*
 * Copyright 2015  Vijay Jaybhay
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package logger;

import android.support.annotation.NonNull;

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
