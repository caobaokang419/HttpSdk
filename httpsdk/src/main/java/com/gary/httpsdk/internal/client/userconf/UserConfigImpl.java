package com.gary.httpsdk.internal.client.userconf;

/**
 * Created by GaryCao on 2020/04/12.
 */
public class UserConfigImpl {
    private String hostUrl;
    private String resUrl;
    private String protocol; //http or https

    // Builder Pattern
    public static class Builder {
        private String hostUrl;
        private String resUrl;

        // Optional parameters - initialized to default values
        private String protocol = "https";

        public Builder() {
        }

        public Builder(String hostUrl, String resUrl) {
            this.hostUrl = hostUrl;
            this.resUrl = resUrl;
        }

        public Builder setHostUrl(String hostUrl) {
            this.hostUrl = hostUrl;
            return this;
        }

        public Builder setResUrl(String resUrl) {
            this.resUrl = resUrl;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UserConfigImpl build() {
            return new UserConfigImpl(this);
        }
    }

    private UserConfigImpl(Builder builder) {
        hostUrl = builder.hostUrl;
        resUrl = builder.resUrl;
        protocol = builder.protocol;
    }
}
