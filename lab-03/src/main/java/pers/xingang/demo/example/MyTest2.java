package pers.xingang.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 王新刚
 * @since 2023/11/08
 */
@Component
@Slf4j
//@Order(3)
public class MyTest2 implements ApplicationRunner, Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("执行了ApplicationRunner实现类MyTest2");
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
