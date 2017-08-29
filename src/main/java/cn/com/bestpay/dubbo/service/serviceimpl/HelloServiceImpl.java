package cn.com.bestpay.dubbo.service.serviceimpl;

import cn.com.bestpay.dubbo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by wanghui on 2017/8/28.
 */
@Slf4j
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }
}
