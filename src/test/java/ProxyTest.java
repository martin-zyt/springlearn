import com.wangzhen.proxy.CGlibProxy;
import com.wangzhen.proxy.JDKProxy;
import com.wangzhen.proxy.UserManager;
import com.wangzhen.proxy.UserManagerImpl;
import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:27 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class ProxyTest {
    @Test
    public void test01() {
        UserManager userManager = (UserManager) new CGlibProxy().createProxyObject(new UserManagerImpl());
        System.out.println("-----------CGLibProxy-------------");
        userManager.addUser("tom", "root");
        System.out.println("-----------JDKProxy-------------");
        JDKProxy jdkPrpxy = new JDKProxy();
        UserManager userManagerJDK = (UserManager) jdkPrpxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }
}
