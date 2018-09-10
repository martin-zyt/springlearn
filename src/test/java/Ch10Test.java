import com.wangzhen.ch10.aop.Calculator;
import com.wangzhen.ch10.config.Ch10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:41 2018/9/10
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch10Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch10MainConfig.class);

        //Calculator c = new Calculator();
        Calculator c = app.getBean(Calculator.class);
        int result = c.div(4, 0);
        System.out.println(result);
        app.close();
    }
}
