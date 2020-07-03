import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Wang Houjun
 * @date 2020/6/25 - $
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类方式去做，我们就只能通过AnnotationConfig上下文获取容器，通过配置类的class对象加载！
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser=(User)context.getBean("getUser");
        System.out.println(getUser.getName());

    }
}
