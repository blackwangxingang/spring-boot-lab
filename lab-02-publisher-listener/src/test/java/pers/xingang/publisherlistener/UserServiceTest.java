package pers.xingang.publisherlistener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 用户服务测试类
 * @author 王新刚
 * @date 2023/11/07 9:59
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     */
    @Test
    public void register() {
        userService.register("张三");
    }
}