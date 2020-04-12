package com.gary.httpsdk.internal.client.request;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public interface IRequest {
    JSONObject syncGetRequest(Map<String, String> para);

    JSONObject syncPostRequest(Map<String, String> para, JSONObject content);
}
