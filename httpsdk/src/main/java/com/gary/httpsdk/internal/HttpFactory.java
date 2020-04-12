package com.gary.httpsdk.internal;

import android.content.Context;

import com.gary.httpsdk.internal.client.HttpClient;
import com.gary.httpsdk.internal.client.HttpClientImpl;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class HttpFactory {
    public static HttpClient getHttp(Context context) {
        HttpClient httpClient = HttpClientImpl.getInstance(context);
        //TODO
        //HttpClient httpClient = HttpClientImpl2.getInstance(context)
        return httpClient;
    }
}
