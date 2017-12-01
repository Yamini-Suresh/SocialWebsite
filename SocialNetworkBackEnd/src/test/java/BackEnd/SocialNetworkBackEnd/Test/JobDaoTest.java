package BackEnd.SocialNetworkBackEnd.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.SocialNetworkBackEnd.Dao.JobDao;
import Com.SocialNetworkBackEnd.Model.Job;


public class JobDaoTest {

private static final Object Forum = null;
public static AnnotationConfigApplicationContext context;
private static JobDaoTest jobDao;
private Job job;
@BeforeClass
public static void init(){
context =new AnnotationConfigApplicationContext();
context.scan("Com.SocialNetworkBackEnd");
context.refresh();
jobDao =(JobDao) context.getBean("jobDao");
}
@Ignore
@Test
public  void addJobTest() {
Job job = new Job();
job.setJobdate("22dec2011");
job.setJobprofile("be");
job.setPostdate("22dec2011");
job.setQualification("be");
job.setStatus("A");
assertEquals("Failed to add!",true,jobDao.addJob(job));
} 
@Test
public void updateJobTest(){
//Blog blog = (Blog)blogDAO.getBlog(1);
Job job=(Job)jobDao.getJob(1);
    job.setQualification("software engineer");
assertTrue("Problem in updation",jobDao.updateJob(job));
}
}
