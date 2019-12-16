package org.linlinjava.litemall.core.express.config;

import org.linlinjava.litemall.core.express.service.IExpressService;
import org.linlinjava.litemall.core.express.service.impl.AliCloudExpressServiceImpl;
import org.linlinjava.litemall.core.express.service.impl.KdniaoExpressServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ExpressProperties.class)
public class ExpressAutoConfiguration {
    private static final String ALIYUN = "aliyun";

    private static final String KDNIAO = "kdniao";

    private final ExpressProperties properties;

    public ExpressAutoConfiguration(ExpressProperties properties) {
        this.properties = properties;
    }

    @Bean
    public IExpressService expressService() {
        IExpressService expressService = null;
        if(properties.getActive().equals(KDNIAO)){
            expressService = new KdniaoExpressServiceImpl();
        }else if(properties.getActive().equals(ALIYUN)){
            expressService = new AliCloudExpressServiceImpl();
        }else{
            throw new RuntimeException("快递查询参数active配置错误");
        }
        expressService.setProperties(properties);

        return expressService;
    }


}
