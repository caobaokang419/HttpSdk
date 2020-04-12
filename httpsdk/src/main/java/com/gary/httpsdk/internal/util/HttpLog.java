package com.gary.httpsdk.internal.util;

import android.util.Log;

/**
 * Created by GaryCao on 2020/04/12.
 */
public final class HttpLog {
    public static final boolean DEBUG = false;
    private static String TAG_DEF = "[HttpSdk]";

    private HttpLog() {
        throw new UnsupportedOperationException("singleton,can't instantiate");
    }

    public static void i(String Msg) {
        LogIt(Log.INFO, TAG_DEF, Msg);
    }

    public static void i(String Tag, String Msg) {
        LogIt(Log.INFO, Tag, Msg);
    }

    public static void d(String Msg) {
        LogIt(Log.DEBUG, TAG_DEF, Msg);
    }

    public static void d(String Tag, String Msg) {
        LogIt(Log.DEBUG, Tag, Msg);
    }

    public static void v(String Msg) {
        LogIt(Log.VERBOSE, TAG_DEF, Msg);
    }

    public static void v(String Tag, String Msg) {
        LogIt(Log.VERBOSE, Tag, Msg);
    }

    public static void w(String Msg) {
        LogIt(Log.WARN, TAG_DEF, Msg);
    }

    public static void w(String Tag, String Msg) {
        LogIt(Log.WARN, Tag, Msg);
    }

    public static void e(String Msg) {
        LogIt(Log.ERROR, TAG_DEF, Msg);
    }

    public static void e(String Tag, String Msg) {
        LogIt(Log.ERROR, Tag, Msg);
    }

    private static void LogIt(int LEVEL, String Tag, String Message) {
        if (DEBUG) {
            Log.println(LEVEL, TAG_DEF + " " + Tag, Message);
        }
    }
}
