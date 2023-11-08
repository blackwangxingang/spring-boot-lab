package pers.xingang.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 王新刚
 * @since 2023/11/08
 */
@Component
@Slf4j
//@Order(1)
public class HerTest2 implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) throws Exception {
        log.info("执行了CommandLineRunner实现类HerTest2");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
