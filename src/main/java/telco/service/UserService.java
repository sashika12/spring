package telco.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import telco.model.User;

@Service
public class UserService {

	List<User> userlist = new ArrayList<User>();
	
	public UserService()
	{
		User u1 = new User();
		u1.setUser_id("001");
		u1.setName("Nuwan");
		u1.setEmail("nuwan@gmail.com");
		

		User u2 = new User();
		u2.setUser_id("002");
		u2.setName("Rasika");
		u2.setEmail("Rasika@gmail.com");
		

		User u3 = new User();
		u3.setUser_id("003");
		u3.setName("Sashika");
		u3.setEmail("sashika@gmail.com");
		
		userlist.add(u1);
		userlist.add(u2);
		userlist.add(u3);
	}
	
	public List<User> getAlluser()
	{
		return userlist;
	}
	public User getSpecificUser(String user_id)
	{
		return userlist.stream().filter(u->u.getUser_id().equals(user_id)).findFirst().get();
	}
}
