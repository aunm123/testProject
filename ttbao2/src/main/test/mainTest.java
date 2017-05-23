import com.domain.User;
import com.tim.BaseClass.BaseServer;
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
        userServer.save(user);
    }

    @Test
    public void uidTest(){
        System.out.println(UID.getUUID());
    }

    @Test
    public void uidfind(){
        BaseServer userServer = (BaseServer) ac.getBean("userServer");
        User rea = (User) userServer.find(55);
        System.out.println(rea.toString());
    }

    @Test
    public void uidsave(){
        BaseServer userServer = (BaseServer) ac.getBean("userServer");
        User user = new User();
        user.setUserid(55);
        user.setUsername("人民币");
        user.setPassword("123123");
        user.setVsername("人民币");

        userServer.save(user);
    }
}
