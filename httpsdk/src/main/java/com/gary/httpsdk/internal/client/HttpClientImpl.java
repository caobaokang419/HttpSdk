package com.gary.httpsdk.internal.client;

import android.content.Context;

import com.gary.httpsdk.internal.client.request.RequestImpl;
import com.gary.httpsdk.internal.client.request.IRequest;

import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class HttpClientImpl implements HttpClient {
    private static volatile HttpClient client;
    private Context context;

    public HttpClientImpl(Context context) {
        this.context = context;
    }

    public static HttpClient getInstance(Context context) {
        if (client == null) {
            synchronized (HttpClientImpl.class) {
                if (client == null) {
                    client = new HttpClientImpl(context);
                }
            }
        }
        return client;
    }

    @Override
    public IRequest getHttpRequest(Map<String, String> config) {
        return new RequestImpl(this.context, config);
    }
}
