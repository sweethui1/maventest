import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanghui on 2017/8/28.
 */
public class dubboTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        context.start();

    }
}
