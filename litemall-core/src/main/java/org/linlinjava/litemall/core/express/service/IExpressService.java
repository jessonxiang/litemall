package org.linlinjava.litemall.core.express.service;

import org.linlinjava.litemall.core.express.config.ExpressProperties;
import org.linlinjava.litemall.core.express.dao.ExpressInfo;

import java.util.Map;

/**
 * org.linlinjava.litemall.core
 * --简单描述类的作用
 *
 * @author jesson
 * @date 2019/12/12 20:48
 */
public interface IExpressService {

    /**
     * 根据单号查询物流信息
     * @param expCode 物流code
     * @param expNo 物流编号
     * @return
     */
    public ExpressInfo getExpressInfo(String expCode, String expNo);

    /**
     * 获取供应商名称map集合
     * @return
     */
    public Map<String,String> getVendorNames();

    /**
     * 设置配置属性
     * @param properties
     */
    public void setProperties(ExpressProperties properties);
}
