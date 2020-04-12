package com.gary.httpsdk.internal.client.request;


import android.content.Context;

import com.gary.httpsdk.internal.client.userconf.UserConstant;
import com.gary.httpsdk.internal.client.userconf.UserConfigImpl;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class RequestImpl implements IRequest {
    //private Map<String, String> baseConfig = new HashMap<>();
    private Context context;
    private UserConfigImpl clientConf;

    public RequestImpl(Context context, Map<String, String> config) {
        this.context = context;
        this.clientConf = parseClientConfig(config);
    }

    private UserConfigImpl parseClientConfig(Map<String, String> config) {
        UserConfigImpl.Builder builder = new UserConfigImpl.Builder();
        if (config.containsKey(UserConstant.REQ_BASE_URL)) {
            builder.setHostUrl((String) config.get(UserConstant.REQ_BASE_URL));
        }
        if (config.containsKey(UserConstant.REQ_RES_URL)) {
            builder.setResUrl((String) config.get(UserConstant.REQ_RES_URL));
        }
        if (config.containsKey(UserConstant.REQ_PROTOCOL)) {
            builder.setProtocol((String) config.get(UserConstant.REQ_PROTOCOL));
        }
        return builder.build();
    }

    @Override
    public JSONObject getRequest(Map<String, String> para) {
        return null;
    }

    @Override
    public JSONObject postRequest(Map<String, String> para, JSONObject content) {
        return null;
    }
}
