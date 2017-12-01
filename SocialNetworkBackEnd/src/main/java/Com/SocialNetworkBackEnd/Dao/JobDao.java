

package Com.SocialNetworkBackEnd.Dao;

import Com.SocialNetworkBackEnd.Model.Job;

public interface JobDao {

public boolean addJob(Job job);
public boolean updateJob(Job job);
public boolean deleteJob(Job job);
public Job getJob(int jobId);
}

