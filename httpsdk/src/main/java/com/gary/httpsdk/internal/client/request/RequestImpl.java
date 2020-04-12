package com.gary.httpsdk.internal.client.request;


import android.content.Context;

import com.gary.httpsdk.internal.client.result.ResultCallback;
import com.gary.httpsdk.internal.client.userconf.UserConstant;
import com.gary.httpsdk.internal.client.userconf.UserConfigImpl;
import com.gary.httpsdk.internal.util.RequestUtils;

import org.json.JSONObject;

import java.net.URL;
import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class RequestImpl implements IRequest {
    //private Map<String, String> baseConfig = new HashMap<>();
    private Context context;
    private UserConfigImpl userConfig;

    public RequestImpl(Context context, Map<String, String> config) {
        this.context = context;
        this.userConfig = parseUserConfig(config);
    }

    private UserConfigImpl parseUserConfig(Map<String, String> config) {
        UserConfigImpl.Builder builder = new UserConfigImpl.Builder();
        if (config.containsKey(UserConstant.REQ_BASE_URL)) {
            builder.setHostUrl(config.get(UserConstant.REQ_BASE_URL));
        }
        if (config.containsKey(UserConstant.REQ_RES_URL)) {
            builder.setResUrl(config.get(UserConstant.REQ_RES_URL));
        }
        if (config.containsKey(UserConstant.REQ_PROTOCOL)) {
            builder.setProtocol(config.get(UserConstant.REQ_PROTOCOL));
        }
        return builder.build();
    }

    @Override
    public JSONObject syncGetRequest(Map<String, String> para) {
        try {
            URL url = new URL(userConfig.hostUrl + "/" + userConfig.resUrl);
            RequestParas.Builder builder = new RequestParas.Builder(url);
            builder.setReqMethod("GET");
            return RequestUtils.getRequest(builder.build());
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public JSONObject syncPostRequest(Map<String, String> para, JSONObject content) {
        try {
            URL url = new URL(userConfig.hostUrl + "/" + userConfig.resUrl);
            RequestParas.Builder builder = new RequestParas.Builder(url);
            builder.setReqMethod("POST");
            builder.setPostBody(content.toString());
            return RequestUtils.postRequest(builder.build());
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public void asyncGetRequest(Map<String, String> para, ResultCallback callback) {
        //TODO
    }

    @Override
    public void asyncPostRequest(Map<String, String> para, ResultCallback callback) {
        //TODO
    }
}
