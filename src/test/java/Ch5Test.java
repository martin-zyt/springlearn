import com.wangzhen.ch5.config.Ch5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:06 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch5Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch5MainConfig.class);

        System.out.println("IOC容器创建完成........");
    }
}
