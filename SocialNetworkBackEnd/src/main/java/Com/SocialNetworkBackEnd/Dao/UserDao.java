package Com.SocialNetworkBackEnd.Dao;

import org.springframework.stereotype.Service;

//import java.util.List;

import Com.SocialNetworkBackEnd.Model.UserDetail;

@Service
public interface UserDao {

     public boolean addUser(UserDetail user);
     public boolean updateOnlineStatus(String status,UserDetail user);
	 //boolean saveUser(User user);
}