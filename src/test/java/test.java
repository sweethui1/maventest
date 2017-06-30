import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 2017/2/4.
 */
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("config/spring-quartz.xml");

    }
}
