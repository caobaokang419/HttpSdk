package com.gary.httpsdk.internal.client.request;


import android.content.Context;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RequestImpl implements Request {
    private Map<String, String> baseConfig = new HashMap<>();
    private Context context;

    public RequestImpl(Context context, Map<String, String> baseConfig) {
        this.context = context;
        this.baseConfig = baseConfig;
    }

    @Override
    public JSONObject getRequest(Map<String, String> req_para) {
        return null;
    }

    @Override
    public JSONObject postRequest(Map<String, String> req_para, JSONObject post_content) {
        return null;
    }
}
