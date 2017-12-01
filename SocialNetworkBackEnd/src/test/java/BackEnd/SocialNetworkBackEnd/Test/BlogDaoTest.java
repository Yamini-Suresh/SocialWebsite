package BackEnd.SocialNetworkBackEnd.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.SocialNetworkBackEnd.Dao.BlogDao;
import Com.SocialNetworkBackEnd.Model.Blog;

public class BlogDaoTest 
{

	static BlogDao blogDao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("Com.SocialNetworkBackEnd");
		context.refresh();
		
		blogDao=(BlogDao)context.getBean("blogDao");
	}
	
	@Test
	public void addBlogTest()
	{
		Blog blog=new Blog();
		
		blog.setBlogId(1001);
		blog.setBlogName("Core Java");
		blog.setBlogContent("It is based on Simple Java Concept");
		blog.setUsername("sunil");
		blog.setStatus("A");
		blog.setLikes(3);
		blog.setCreateDate(new java.util.Date());
		
		assertTrue("Problem in Inserting Blog",blogDao.addBlog(blog));
	
	}
	

}
