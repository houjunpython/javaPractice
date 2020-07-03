import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Wang Houjun
 * @date 2020/6/24 - $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext");
        User user=(User)context.getBean("user");

        System.out.println(user.name);


    }
}
