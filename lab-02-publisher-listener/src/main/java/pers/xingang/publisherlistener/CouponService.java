package pers.xingang.publisherlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 优惠券服务类
 * @author 王新刚
 * @date 2023/11/07 9:40
 */
@Slf4j
@Component
public class CouponService{
    @EventListener
    public void addCoupon(UserRegisterEvent event) {
        log.info("  [onApplicationEvent] [给用户({})发送优惠券]", event.getUserName());
    }
}
