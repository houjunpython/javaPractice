import com.kuang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Wang Houjun
 * @date 2020/6/23 - $
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people=context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();

    }
}
