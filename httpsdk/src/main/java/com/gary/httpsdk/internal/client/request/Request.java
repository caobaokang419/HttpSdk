package com.gary.httpsdk.internal.client.request;

import org.json.JSONObject;

import java.util.Map;

public interface Request {
    JSONObject getRequest(Map<String, String> para);

    JSONObject postRequest(Map<String, String> para, JSONObject content);
}
