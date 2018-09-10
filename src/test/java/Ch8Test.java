import com.wangzhen.ch8.bean.Bird;
import com.wangzhen.ch8.config.Ch8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:21 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch8Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch8MainConfig.class);
        //从容器中获取所有bean
        String[] names = app.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) app.getBean("bird");

        System.out.println(bird);
        System.out.println("IOC容器创建完成........");

        ConfigurableEnvironment environment = app.getEnvironment();
        System.out.println("environment====" + environment.getProperty("bird.color"));
        app.close();
    }
}
