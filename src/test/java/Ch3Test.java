import com.wangzhen.ch3.config.Ch3MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 10:19 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch3Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch3MainConfig.class);


        String[] names = app.getBeanDefinitionNames();

        for(String name:names){
            System.out.println(name);
        }
        //从容器中分别取两次person实例, 看是否为同一个bean
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");
        System.out.println(bean1 == bean2);
    }
}
