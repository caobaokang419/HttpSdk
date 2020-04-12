package com.gary.httpsdk.internal.client.request;

import java.net.URL;

public class RequestParas {
    public URL reqUrl;
    public String reqMethod;//Get or Post ...
    public int connTimeout;
    public int readTimeout;
    public String postBody;

    // Builder Pattern
    public static class Builder {
        private URL reqUrl;
        private String reqMethod;//Get Post ...

        // Optional parameters - initialized to default values
        private int connTimeout = 5 * 1000;//ms
        private int readTimeout = 5 * 1000;//ms
        private String postBody;

        public Builder() {
        }

        public Builder(URL url) {
            reqUrl = url;
        }

        public void setReqMethod(String reqMethod) {
            this.reqMethod = reqMethod;
        }

        public void setConnTimeout(int connTimeout) {
            this.connTimeout = connTimeout;
        }

        public void setReadTimeout(int readTimeout) {
            this.readTimeout = readTimeout;
        }

        public void setPostBody(String postBody) {
            this.postBody = postBody;
        }

        public RequestParas build() {
            return new RequestParas(this);
        }
    }

    private RequestParas(Builder builder){
        reqUrl = builder.reqUrl;
        reqMethod = builder.reqMethod;
        postBody = builder.postBody;
        connTimeout = builder.connTimeout;
        readTimeout = builder.readTimeout;
    }
}
