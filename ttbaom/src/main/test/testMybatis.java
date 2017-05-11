import com.Entity.OrderItem;
import com.Entity.User;
import com.Entity.dao.UserMapper;
import com.Service.OrderService;
import com.Service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
public class testMybatis {

    private ApplicationContext ac = null;

    @Before
    public void befoure(){
        ac = new ClassPathXmlApplicationContext("springmvc.xml");
    }

    @Test
    public void testMM(){
//        UserServer2 userServer2 = (UserServer2) ac.getBean("userServer2");
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = (User) userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
//        userServer2.saveUser(new User(1,"name","password"));
    }

    @Test
    public void testMapper(){
        UserService userService = (UserService) ac.getBean("userService");
        User user = userService.findbyId(1);
        System.out.println(user.toString());
    }

    @Test
    public void testMapper1(){
        UserService userService = (UserService) ac.getBean("userService");
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testMapper2(){
        OrderService orderService = (OrderService) ac.getBean("orderService");
        List<OrderItem> orderItems = (List<OrderItem>) orderService.getOrderDetailByPrimaryKey(1);
        for (OrderItem item : orderItems){
            System.out.println(item.toString());
        }
    }
}
