import com.wangzhen.ch12.Ch12MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:55 2018/9/13
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch12Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch12MainConfig.class);

        app.close();
    }
}
