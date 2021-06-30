package com.cl.config;

import com.cl.utils.WallConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenglei
 * @data 2021年05月2021/5/27日 17:57
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "file")
public class FileProperties {
    /** 文件大小限制 */
    private Long maxSize;

    /** 头像大小限制 */
    private Long avatarMaxSize;

    private ElPath mac;

    private ElPath linux;

    private ElPath windows;

    public ElPath getPath(){
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith(WallConstant.WIN)) {
            return windows;
        } else if(os.toLowerCase().startsWith(WallConstant.MAC)){
            return mac;
        }
        return linux;
    }

    @Data
    public static class ElPath{

        private String path;

        private String avatar;
    }
}
