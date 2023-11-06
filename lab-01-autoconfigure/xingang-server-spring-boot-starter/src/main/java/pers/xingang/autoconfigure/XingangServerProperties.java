package pers.xingang.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 王新刚
 * @date 2023/11/06 18:33
 */

@ConfigurationProperties(prefix = "xingang.server")
public class XingangServerProperties {
    /**
     * 默认端口
     */
    private static final Integer DEFAULT_PORT = 8000;

    /**
     * 端口
     */
    private Integer port = DEFAULT_PORT;

    public static Integer getDefaultPort() {
        return DEFAULT_PORT;
    }

    public Integer getPort() {
        return port;
    }

    public XingangServerProperties setPort(Integer port) {
        this.port = port;
        return this;
    }
}
