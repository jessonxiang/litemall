package org.linlinjava.litemall.core.express.dao;

//import com.alibaba.fastjson.annotation.JSONField;

import java.util.Map;

/**
 * org.linlinjava.litemall.core.express.vo
 * --简单描述类的作用
 *
 * @author jesson
 * @date 2019/12/13 16:53
 */
public class VendorsInfo {

//    @JSONField(name = "status")
    private String status;
//    @JSONField(name="msg")
    private String msg;
//    @JSONField(name="result")
    private Map<String,String> result;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }
}
