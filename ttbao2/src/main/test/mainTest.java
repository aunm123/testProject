import com.domain.User;
import com.tim.BaseServer;
import com.tim.tool.UID;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by timhuo on 2017/5/18.
 */
public class mainTest {
    private ApplicationContext ac = null;

    @Before
    public void befoure(){
        ac = new ClassPathXmlApplicationContext("spring/spring-mvc.xml","spring/spring-hibernate.xml");
    }

    @Test
    public void testMM(){
        User user = new User();
        user.setUsername("fuck you");
        user.setPassword("asdasdasd");
        user.setVsername("asdasdasd");
        BaseServer userServer = (BaseServer) ac.getBean("userServer");
        userServer.add(user);
    }

    @Test
    public void uidTest(){
        System.out.println(UID.getUUID());
    }
}
