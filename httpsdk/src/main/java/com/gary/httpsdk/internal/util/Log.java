package com.gary.httpsdk.internal.util;

/**
 * Created by GaryCao on 2020/04/12.
 */
public final class Log {
    private static boolean debug = false;
    private static String tag = "[HttpSdk]";

    private Log() {
        throw new UnsupportedOperationException("singleton,can't instantiate");
    }

    public static void enableLog(boolean debug) {
        Log.debug = debug;
    }

    public static void setLogTag(String tag) {
        Log.tag = tag;
    }

    public static void i(String Msg) {
        log(android.util.Log.INFO, tag, Msg);
    }

    public static void i(String Tag, String Msg) {
        log(android.util.Log.INFO, Tag, Msg);
    }

    public static void d(String Msg) {
        log(android.util.Log.DEBUG, tag, Msg);
    }

    public static void d(String Tag, String Msg) {
        log(android.util.Log.DEBUG, Tag, Msg);
    }

    public static void v(String Msg) {
        log(android.util.Log.VERBOSE, tag, Msg);
    }

    public static void v(String Tag, String Msg) {
        log(android.util.Log.VERBOSE, Tag, Msg);
    }

    public static void w(String Msg) {
        log(android.util.Log.WARN, tag, Msg);
    }

    public static void w(String Tag, String Msg) {
        log(android.util.Log.WARN, Tag, Msg);
    }

    public static void e(String Msg) {
        log(android.util.Log.ERROR, tag, Msg);
    }

    public static void e(String Tag, String Msg) {
        log(android.util.Log.ERROR, Tag, Msg);
    }

    private static void log(int level, String Tag, String Message) {
        if (debug || level >= android.util.Log.ERROR) {
            android.util.Log.println(level, tag + " " + Tag, Message);
        }
    }
}
