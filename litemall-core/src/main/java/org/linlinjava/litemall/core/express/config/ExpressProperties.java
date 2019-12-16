package org.linlinjava.litemall.core.express.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "litemall.express")
public class ExpressProperties {

    private boolean enable;

    private String active;

    private Kdniao kdniao;

    private Aliyun aliyun;

    public static class Aliyun{

        private String appCode;


        public String getAppCode() {
            return appCode;
        }

        public void setAppCode(String appCode) {
            this.appCode = appCode;
        }
    }
    public static class Kdniao{

        private String appId;
        private String appKey;
        private List<Map<String, String>> vendors = new ArrayList<>();

        public List<Map<String, String>> getVendors() {
            return vendors;
        }

        public void setVendors(List<Map<String, String>> vendors) {
            this.vendors = vendors;
        }

        public String getAppKey() {
            return appKey;
        }

        public void setAppKey(String appKey) {
            this.appKey = appKey;
        }

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Kdniao getKdniao() {
        return kdniao;
    }

    public void setKdniao(Kdniao kdniao) {
        this.kdniao = kdniao;
    }

    public Aliyun getAliyun() {
        return aliyun;
    }

    public void setAliyun(Aliyun aliyun) {
        this.aliyun = aliyun;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
