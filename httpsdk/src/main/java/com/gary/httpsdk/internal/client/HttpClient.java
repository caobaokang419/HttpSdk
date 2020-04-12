package com.gary.httpsdk.internal.client;

import com.gary.httpsdk.internal.client.request.IRequest;

import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public interface HttpClient {
    IRequest getHttpRequest(Map<String, String> req_para);
}
