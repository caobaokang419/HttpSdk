package com.gary.httpsdk.internal.util;

import android.util.Log;

/**
 * Created by GaryCao on 2020/04/12.
 */
public final class HttpLog {
    private static boolean debug = false;
    private static String tag = "[HttpSdk]";

    private HttpLog() {
        throw new UnsupportedOperationException("singleton,can't instantiate");
    }

    public static void enableLog(boolean debug) {
        HttpLog.debug = debug;
    }

    public static void setLogTag(String tag) {
        HttpLog.tag = tag;
    }

    public static void i(String Msg) {
        log(Log.INFO, tag, Msg);
    }

    public static void i(String Tag, String Msg) {
        log(Log.INFO, Tag, Msg);
    }

    public static void d(String Msg) {
        log(Log.DEBUG, tag, Msg);
    }

    public static void d(String Tag, String Msg) {
        log(Log.DEBUG, Tag, Msg);
    }

    public static void v(String Msg) {
        log(Log.VERBOSE, tag, Msg);
    }

    public static void v(String Tag, String Msg) {
        log(Log.VERBOSE, Tag, Msg);
    }

    public static void w(String Msg) {
        log(Log.WARN, tag, Msg);
    }

    public static void w(String Tag, String Msg) {
        log(Log.WARN, Tag, Msg);
    }

    public static void e(String Msg) {
        log(Log.ERROR, tag, Msg);
    }

    public static void e(String Tag, String Msg) {
        log(Log.ERROR, Tag, Msg);
    }

    private static void log(int level, String Tag, String Message) {
        if (debug || level >= Log.ERROR) {
            Log.println(level, tag + " " + Tag, Message);
        }
    }
}
