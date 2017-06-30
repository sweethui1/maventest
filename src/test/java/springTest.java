import cn.com.bestpay.model.testModel;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanghui on 2017/6/30.
 */
public class springTest {

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        testModel t = (testModel) ac.getBean("testModel");
        t.save();
        System.out.println(t.getTest1()+ t.getTest2());
    }
}
