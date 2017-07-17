package Composite;

import java.util.ArrayList;
import java.util.List;

public class UserList implements user{
	private List<user> userlist = new ArrayList<user>();
	
	public void adduser(user user){
		userlist.add(user);
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for(user user : userlist){
			user.play();
		}
	}
	
	public static void main(String[] args){
		
	}
}
