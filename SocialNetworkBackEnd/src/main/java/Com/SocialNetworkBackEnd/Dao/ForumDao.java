package Com.SocialNetworkBackEnd.Dao;

import java.util.List;

import Com.SocialNetworkBackEnd.Model.Blog;
import Com.SocialNetworkBackEnd.Model.Forum;

public interface ForumDao {
public boolean addForum(Forum forum);
public boolean updateForum(Forum forum);
public boolean deleteForum(Forum forum);
public Forum getForum(int forumId);
public List <Forum> getAllForum();
public boolean approveForum(Forum forum);


}
