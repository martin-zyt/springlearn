import com.wangzhen.ch2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 9:55 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch2Test{
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);

        String[] names = app.getBeanDefinitionNames();

        for(String name:names){
            System.out.println(name);
        }
    }
}
