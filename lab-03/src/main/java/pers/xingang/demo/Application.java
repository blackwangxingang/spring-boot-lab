package pers.xingang.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王新刚
 * @since 2023/11/08
 */
@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("开始启动Spring容器");
        SpringApplication.run(Application.class, args);
        log.info("Spring容器启动完毕");
    }
}
