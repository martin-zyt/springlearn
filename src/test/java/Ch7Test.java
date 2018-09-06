import com.wangzhen.ch7.config.Ch7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 18:57 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch7Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch7MainConfigOfLifeCycle.class);

        System.out.println("IOC容器创建完成........");
        app.close();
    }
}
