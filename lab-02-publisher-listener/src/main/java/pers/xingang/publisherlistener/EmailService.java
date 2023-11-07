package pers.xingang.publisherlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 邮件服务类
 * <p>用户注册成功后，发送邮件</p>
 * @author 王新刚
 * @date 2023/11/07 9:40
 */
@Slf4j
@Component
public class EmailService implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        log.info("  [onApplicationEvent] [给用户({})发送邮件]", event.getUserName());
    }
}
