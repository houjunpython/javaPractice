import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Wang Houjun
 * @date 2020/6/19 - $
 */
public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层
       /**UserServiceImpl userService=new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
        */
       //获取ApplicationContext:拿到Spring的容器
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，需要什么就get什么！
        UserServiceImpl userServiceImpl=(UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }

}
