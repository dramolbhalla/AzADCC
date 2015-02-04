/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

import javax.persistence.*;

@Entity
@Table(name="USER_PASSWORD")
public class UserPassword {
	
	@OneToOne
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int password;
	
	@Column(name="passwordString")
	private String passwordString;
		
	/**
	 * Default blank constructor for UserPassword.
	 */
	public UserPassword(){
		
	}
	
	/**
	 * Default constructor for UserPassword.
	 * @param passwordString
	 */
	public UserPassword(String passwordString){
		this.passwordString = passwordString;
	}
	
	//Getter and Setters
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
	public int get_password(){
		return password;
	}
	
	/**
	 * 
	 * @param password
	 */
	public void set_password(int password){
		this.password = password;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_passwordString(){
		return passwordString;
	}
	
	/**
	 * 
	 * @param password
	 */
	public void set_passwordString(String passwordString){
		this.passwordString = passwordString;
	}
}
