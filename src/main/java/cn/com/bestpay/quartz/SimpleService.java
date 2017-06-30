
package cn.com.bestpay.quartz;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("simpleService")
public class SimpleService {
	
	private static final long serialVersionUID = 122323233244334343L;
	private static final Logger logger = LoggerFactory.getLogger(SimpleService.class);
	
	public void testMethod1(){
		//这里执行定时调度业务
		logger.info("testMethod1.......1");
		System.out.println("2--testMethod1......."+System.currentTimeMillis()/1000);
	}
	
	public void testMethod2(){
		logger.info("testMethod2.......2");	
	}
}

