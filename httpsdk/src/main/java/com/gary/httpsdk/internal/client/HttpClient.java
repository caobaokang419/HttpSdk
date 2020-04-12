package com.gary.httpsdk.internal.client;

import com.gary.httpsdk.internal.client.request.Request;

import java.util.Map;

public interface HttpClient {
    Request getHttpRequest(Map<String, String> req_para);
}
