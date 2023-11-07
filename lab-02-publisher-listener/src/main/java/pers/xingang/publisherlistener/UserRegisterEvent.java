package pers.xingang.publisherlistener;

import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 * @author 王新刚
 * @date 2023/11/07 9:40
 */
public class UserRegisterEvent extends ApplicationEvent {

    private String userName;


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public UserRegisterEvent(Object source) {
        super(source);
    }

    public UserRegisterEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
