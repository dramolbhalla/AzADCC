/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

public class UserPassword {
	
	int uid;
	String userId;
	String password;
	
	/**
	 * 
	 * @return
	 */
	public int get_uid(){
	     return uid;
	}
	
	/**
	 * 
	 * @param uid
	 */
	public void set_uid(int uid){
		this.uid = uid;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_userId(){
		return userId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_userId(String userId){
		this.userId = userId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_password(){
		return password;
	}
	
	/**
	 * 
	 * @param password
	 */
	public void set_password(String password){
		this.password = password;
	}
}
