package persistance.entities.Users;

import javax.persistence.*;

@Entity
@Table(name="USER_LOG")
public class UserLog {
	
	@OneToOne
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int log;
	
	@Column(name="userLog")
	private String userLog;
	
	/**
	 * Default blank constructor for UserLog table.
	 */
	public UserLog(){
		
	}
	
	/**
	 * Default constructor for UserLog table. 
	 * @param userLog
	 */
	public UserLog(String userLog){
		this.userLog = userLog;
	}

	//Getters and Setters
	
	/**
	 * 
	 * @return
	 */
	public User get_User(){
		return user;
	}
	
	/**
	 * 
	 * @param user
	 */
	public void set_User(User user){
		this.user = user;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_log(){
	     return log;
	}
	
	/**
	 * 
	 * @param uid
	 */
	public void set_log(int log){
		this.log = log;
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
