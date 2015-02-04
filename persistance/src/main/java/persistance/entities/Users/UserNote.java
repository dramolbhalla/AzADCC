package persistance.entities.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_NOTE")
public class UserNote {
	
	@OneToOne
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int note;
	
	@Column(name="userNote")
	private String userNote;
	
	/**
	 * Empty class constructor for user table.
	 */
	public UserNote(){
		
	}
	
	public UserNote(String userNote){
		this.userNote = userNote;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_note(){
		return note; 
	}
	
	/**
	 * 
	 * @param note
	 */
	public void set_note(int note){
		this.note = note;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_userNote(){
		return userNote;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_userLog(String userNote){
		this.userNote = userNote;
	}
	
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

}
