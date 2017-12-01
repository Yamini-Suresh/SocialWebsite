

package BackEnd.SocialNetworkBackEnd.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

     import Com.SocialNetworkBackEnd.Dao.ForumDao;

import Com.SocialNetworkBackEnd.Model.Forum;

public class ForumDaoTest {

public static final Logger log = Logger.getLogger(ForumDaoTest.class.getName());

private static final Object Forum = null;
public static AnnotationConfigApplicationContext context;
private static ForumDao forumDao;
private Forum forum;
@BeforeClass
public static void init(){
context =new AnnotationConfigApplicationContext();
context.scan("com.SocialNetworkBackEnd.*");
context.refresh();
forumDao =(ForumDao) context.getBean("forumDao");
}
//@Ignore
@Test
public  void addForumTest() {
Forum forum = new Forum();
forum.setForumName("Advance Java");
forum.setForumContent(" Advance java concept");
forum.setStatus("B");
forum.setUserId(2);
forum.setCreateDate(new Date());
assertEquals("Failed to add user!",true,forumDao.addForum(forum));
} 
@Ignore
@Test
public void getForumTest(){
Forum forum = forumDao.getForum(1);
assertNotEquals("forum Not Found", forum);
log.info("Forum Name:"+forum.getForumName());
log.info("Blog Content"+forum.getForumContent());
}
@Ignore
@Test
public void getAllForumTest(){
    
List<Forum> forumList=(List<Forum>)forumDao.getAllForum();
assertNotNull("Forum List Not Found", forumList.get(0));
for(Forum forum:forumList)
{
log.info("Forum ID"+forum.getForumId()+"::"+"Forum Name:"+forum.getForumName());
assertTrue("Problem in Deletion", forumDao.deleteForum(forum));
}
}
@Ignore
@Test
public void updateForumTest(){
Forum forum = forumDao.getForum(1);
forum.setForumContent("wcd");
forum.setForumName("app");
assertTrue("Problem in updation",forumDao.updateForum(forum));
}
}

