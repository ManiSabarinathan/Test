import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BSearchObj {
	public static void main(String ...strings ) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(100,"Juju", "MBA")); 
		userList.add(new User(212,"Papu", "MCA"));
		userList.add(new User(250,"Sabar", "MSC"));
		userList.add(new User(700,"God", "All"));
		
		/*Comparator<User> comp = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				 return  o1.getUserId().compareTo(o2.getUserId());				
			}					
		};*/
		//int userIndex = Collections.binarySearch(userList, searchUser ,comp);
		
		
		//Check the user exist or not
		/*User searchUser = new User(250,null,null);
		int userIndex = Collections.binarySearch(userList, searchUser,new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				 return  o1.getUserId().compareTo(o2.getUserId());				
			}					
		});
		
		System.out.println("User exist in Index :: " + userIndex);*/
		
		
		
		User searchUser = new User(212,null,null);
		int userIndex = Collections.binarySearch(userList, searchUser,
			(User o1, User o2) -> {
				 return  o1.getUserId().compareTo(o2.getUserId());				
			})	;
		
		System.out.println("User exist in Index :: " + userIndex);
		
		
		
		
		
		
		
	}

}


