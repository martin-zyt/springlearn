import com.wangzhen.ch9.bean.Moon;
import com.wangzhen.ch9.bean.Sun;
import com.wangzhen.ch9.config.Ch9MainConfig;
import com.wangzhen.ch9.dao.TestDao;
import com.wangzhen.ch9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:37 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ch9Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch9MainConfig.class);
        System.out.println(app);

        TestService testService = app.getBean(TestService.class);
        testService.println();
        //直接从容器中获取TestDao, 和使用Autowired注解来取比较
        TestDao testDao = app.getBean(TestDao.class);
        System.out.println(testDao);

		Moon moon = (Moon)app.getBean(Moon.class);
		System.out.println(moon);

		Sun sun = (Sun)app.getBean(Sun.class);
		System.out.println(sun.getMoon());
        app.close();
    }
}
