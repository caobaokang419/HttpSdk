package com.gary.httpsdk.internal.util;

import android.content.Context;

import com.gary.httpsdk.HttpSdk;
import com.gary.httpsdk.internal.HttpFactory;
import com.gary.httpsdk.internal.client.HttpClient;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class HttpUtils {
    private static volatile HttpClient httpClient;

    public static HttpClient getHttp(Context context) {
        if (httpClient == null) {
            synchronized (HttpSdk.class) {
                if (httpClient == null) {
                    httpClient = HttpFactory.getHttp(context);
                }
            }
        }
        return httpClient;
    }

    public static void enableLog(boolean debug) {
        HttpLog.enableLog(debug);
    }

    public static void setLogTag(String tag) {
        HttpLog.setLogTag(tag);
    }
}
