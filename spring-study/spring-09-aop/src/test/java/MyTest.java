import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Wang Houjun
 * @date 2020/6/28 - $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口
        UserService  userService=(UserService)context.getBean("userService");
        userService.add();

    }

}
