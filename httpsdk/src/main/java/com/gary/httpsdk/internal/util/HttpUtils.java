package com.gary.httpsdk.internal.util;

import android.content.Context;

import com.gary.httpsdk.HttpSdk;
import com.gary.httpsdk.internal.HttpFactory;
import com.gary.httpsdk.internal.client.HttpClient;

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

    public static void enableLog(boolean flag) {

    }

    public static void setLogTag(String tag) {

    }
}
