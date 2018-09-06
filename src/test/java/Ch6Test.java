import com.wangzhen.ch6.config.Ch6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:17 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch6Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch6MainConfig.class);

        System.out.println("IOC容器创建完成........");

        Object bean1 = app.getBean("jamesFactoryBean");
        Object bean2 = app.getBean("jamesFactoryBean");//取Money
        System.out.println("bean1的类型=" + bean1.getClass());
        System.out.println(bean1 == bean2);

        Object bean3 = app.getBean("&jamesFactoryBean");
        System.out.println("bean3的类型=" + bean3.getClass());

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
