package persistance.entities.Users;

public class UserLog {
	
	int uid;
	String userId;
	String userLog;

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
	public String get_userLog(){
		return userLog;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_userLog(String userLog){
		this.userLog = userLog;
	}
}
