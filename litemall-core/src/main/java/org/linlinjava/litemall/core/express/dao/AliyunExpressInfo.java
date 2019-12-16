/**
 * Copyright 2018 bejson.com
 */
package org.linlinjava.litemall.core.express.dao;

//import com.alibaba.fastjson.annotation.JSONField;
//import com.bh.proprietor.core.tools.util.JSONUtil;

import java.util.Map;

/**
 * Auto-generated: 2018-07-19 22:27:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class AliyunExpressInfo extends ExpressInfo {

//    @JSONField(name="status")
    private String status;

//    @JSONField(name="result")
    private Map<String,String> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        super.setLogisticCode(result.get("number"));
        super.setShipperName(result.get("expName"));
//        super.setTraces(JSONUtil.parseArr(result.get("list"), org.linlinjava.litemall.core.express.dao.Traces.class));
        this.result = result;
    }
}