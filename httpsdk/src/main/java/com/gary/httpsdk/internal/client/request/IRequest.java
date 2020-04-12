package com.gary.httpsdk.internal.client.request;

import com.gary.httpsdk.internal.client.result.ResultCallback;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public interface IRequest {
    JSONObject syncGetRequest(Map<String, String> para);

    JSONObject syncPostRequest(Map<String, String> para, JSONObject content);

    void asyncGetRequest(Map<String, String> para, ResultCallback callback);

    void asyncPostRequest(Map<String, String> para, ResultCallback callback);
}
