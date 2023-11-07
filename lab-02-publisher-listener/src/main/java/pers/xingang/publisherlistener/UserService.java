package pers.xingang.publisherlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 用户服务类
 * <p>用户注册成功后发布用户注册事件</p>
 * @author 王新刚
 * @date 2023/11/07 9:46
 */
@Slf4j
@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        log.info("setApplicationEventPublisher");
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String username) {
        log.info("  [register] [执行用户({})的注册逻辑]", username);

        log.info("  [register] [发布用户({})的注册事件]", username);
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, username));
    }
}
