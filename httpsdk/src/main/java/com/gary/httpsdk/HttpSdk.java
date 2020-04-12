package com.gary.httpsdk;

import android.content.Context;

import com.gary.httpsdk.internal.client.HttpClient;
import com.gary.httpsdk.internal.util.HttpUtils;

public class HttpSdk {
    public static HttpClient getHttp(Context context) {
        return HttpUtils.getHttp(context);
    }

    public static void enableLog(boolean flag) {
        HttpUtils.enableLog(flag);
    }

    public static void setLogTag(String tag) {
        HttpUtils.setLogTag(tag);
    }
}
