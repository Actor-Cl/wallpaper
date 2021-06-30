package com.cl.modules.security.config;

import com.cl.modules.security.config.bean.LoginProperties;
import com.cl.modules.security.config.bean.SecurityProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置文件转Pojo类的统一配置类
 * @author chenglei
 * @data 2021年05月2021/5/27日 15:08
 */
@Configuration
public class ConfigBeanConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "login")
    public LoginProperties loginProperties() {
        return new LoginProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "jwt")
    public SecurityProperties securityProperties(){
        return new SecurityProperties();
    }
}
