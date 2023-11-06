package pers.xingang.autoconfigure;

import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author 王新刚
 * @date 2023/11/06 18:33
 */

@Configuration
@EnableConfigurationProperties(XingangServerProperties.class)
public class XingangServerAutoConfiguration {
    private Logger logger = LoggerFactory.getLogger(XingangServerAutoConfiguration.class);

    public HttpServer httpServer(XingangServerProperties serverProperties) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(serverProperties.getPort()), 0);
        server.start();
        logger.info("[httpServer][启动服务器成功，端口为:{}]", serverProperties.getPort());
        return server;
    }
}
