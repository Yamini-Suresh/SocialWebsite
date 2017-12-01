package BackEnd.SocialNetworkBackEnd.Test;

import static org.junit.Assert.*;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import Com.SocialNetworkBackEnd.Config.ApplicationContextConfig;
import Com.SocialNetworkBackEnd.Dao.UserDao;
import Com.SocialNetworkBackEnd.Dao.UserDaoImpl;
import Com.SocialNetworkBackEnd.Model.UserDetail;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes={ApplicationContextConfig.class})
@WebAppConfiguration
@Transactional
public class UserDaoTest {
  
   @Autowired
  UserDao userdao;
@Autowired
    public UserDetail user;
@Autowired
SessionFactory sessionFactory;
@Ignore
@Test
public void addTest()
{
//UserDao userdao=new UserDaoImpl(sessionFactory);
UserDetail user=new UserDetail();
user.setUserId(12);
user.setUserName("abc");
user.setRole("user");
user.setEmailId("abc@gmail.com");
user.setIsOnline("N");
user.setPassword("aabb");
System.out.println("check1");
System.out.println(userdao);
assertTrue("Problem in Inserting User",userdao.addUser(user));
System.out.println("check2");
System.out.println("EmailID:"+user.getEmailId());
System.out.println("UserName:"+user.getUserName());
}
}