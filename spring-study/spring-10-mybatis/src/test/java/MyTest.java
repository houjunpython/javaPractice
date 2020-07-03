import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author Wang Houjun
 * @date 2020/7/2 - $
 */
public class MyTest {
        @Test
        public void test() throws IOException {
            String resources = "mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resources);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sessionFactory.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.selectUser();
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }



