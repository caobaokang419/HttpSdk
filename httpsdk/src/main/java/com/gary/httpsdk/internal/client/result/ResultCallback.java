package com.gary.httpsdk.internal.client.result;

import org.json.JSONObject;

public interface ResultCallback {
    void onRequestSucc(JSONObject result);

    void onRequestFail();

    void onRequestCancel();
}
