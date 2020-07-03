import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.sql.SQLOutput;

/**
 * @Author Wang Houjun
 * @date 2020/6/22 - $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userbeans.xml");
        User user=context.getBean("user2",User.class);
        User user2=context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user==user2);

    }


}
