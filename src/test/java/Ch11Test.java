import com.wangzhen.ch11.config.Ch11MainConfig;
import com.wangzhen.ch11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 21:49 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch11Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch11MainConfig.class);

        OrderService bean = app.getBean(OrderService.class);
        bean.addOrder();

        app.close();
    }
}
