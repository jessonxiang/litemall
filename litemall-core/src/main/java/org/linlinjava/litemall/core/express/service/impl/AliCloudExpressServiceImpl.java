package org.linlinjava.litemall.core.express.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.linlinjava.litemall.core.express.config.ExpressProperties;
import org.linlinjava.litemall.core.express.dao.AliyunExpressInfo;
import org.linlinjava.litemall.core.express.dao.ExpressInfo;
import org.linlinjava.litemall.core.express.dao.VendorsInfo;
import org.linlinjava.litemall.core.express.service.IExpressService;
import org.linlinjava.litemall.core.express.util.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * org.linlinjava.litemall.core.express.impl
 * --阿里云市场物流信息查询接口
 *  地址:https://market.aliyun.com/products/56928004/cmapi021863.html?spm=5176.2020520132.101.2.52047218oC8O8w#sku=yuncode1586300000
 * @author jesson
 * @date 2019/12/12 20:49
 */
public class AliCloudExpressServiceImpl implements IExpressService {

    private final Log logger = LogFactory.getLog(AliCloudExpressServiceImpl.class);

    private static final String HOST= "https://wuliu.market.alicloudapi.com";

    private static final String QUERY_KDI= "/kdi";

    private static final String GET_EXPRESS_LIST= "/getExpressList";

    private ExpressProperties properties;

    private static Map<String, String> map = new HashMap<>();

    public ExpressProperties getProperties() {
        return properties;
    }

    public void setProperties(ExpressProperties properties) {
        this.properties = properties;
    }


    @Override
    public Map<String, String> getVendorNames() {
        if(map.isEmpty()){
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("Authorization", "APPCODE " + properties.getAliyun().getAppCode());
            Map<String, String> querys = new HashMap<String, String>();
            try {
                HttpResponse response = HttpUtils.doGet(HOST, GET_EXPRESS_LIST, headers, querys);
//                logger.info(EntityUtils.toString(response.getEntity()));
//                VendorsInfo vendorsVO = JSONUtil.parse(EntityUtils.toString(response.getEntity()), VendorsInfo.class);
//                map = vendorsVO.getResult();
            } catch (Exception e) {
                logger.error("获取物流公司数据错误",e);
            }
        }

        return map;
    }

    @Override
    public ExpressInfo getExpressInfo(String expCode, String expNo) {
        if(!properties.isEnable()){
            return null;
        }
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + properties.getAliyun().getAppCode());
        Map<String, String> querys = new HashMap<String, String>();
        // !!! 请求参数
        querys.put("no", expNo);
        try {
            HttpResponse response = HttpUtils.doGet(HOST, QUERY_KDI, headers, querys);
//            logger.info(EntityUtils.toString(response.getEntity()));
//            ExpressInfo expressInfos = JSONUtil.parse(EntityUtils.toString(response.getEntity()), AliyunExpressInfo.class);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
