import com.wangzhen.ch4.config.Ch4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 10:25 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch4Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch4MainConfig.class);

        System.out.println("IOC容器创建完成........");
        app.getBean("person");//执行获取的时候才创建并初始化bean

    }
}
