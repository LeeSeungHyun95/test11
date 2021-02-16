package Y;

import java.util.ArrayList;
import java.util.HashMap;

public class Repository {
	private int userCount;
	private ArrayList<UserModel> users;
	private HashMap<String, UserModel> findId;
	
	public Repository() {
		this.userCount = 0;
		this.users = new ArrayList<UserModel>();
		this.findId = new HashMap<String, UserModel>();
		}
	
	public HashMap<String, UserModel> getfindId() {
		return findId;
	}
	
	public ArrayList<UserModel> getusers() {
		return users;
	}
	
	public boolean save(String id, String password, String email) {
		if(findId.containsKey(id)) return false;
		
		users.add(new UserModel());
		users.get(userCount).setId(id);
		users.get(userCount).setPassword(password);
		users.get(userCount).setEmail(email);;
		findId.put(id, users.get(userCount)); 
		
		this.userCount++;
		
		return true;
	}
	
	
	
	
}
