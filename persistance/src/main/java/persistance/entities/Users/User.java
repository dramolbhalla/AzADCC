/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

import java.util.Set;

import persistance.entities.Subjects.*;
import persistance.entities.Centers.*;
import persistance.entities.Clinics.*;

import javax.persistence.*;

@Entity 
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="accessLevel")
	private int accessLevel;
	
	@OneToMany
	private Set<Subject> subjects;
	
	@OneToMany
	private Set<Center> centers;
	
	@OneToMany
	private Set<Clinic> clinics;
	
	@OneToMany
	private Set<UserNote> userNotes;
	
	@OneToMany
	private Set<UserLog> userLogs;
	
	public User(){
		
	}
	
	public User(String userId, int accessLevel){
		this.userId = userId;
		this.accessLevel = accessLevel;
	}
	 
	
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
	public int get_accessLevel (){
		return accessLevel;
	}
	
	/**
	 * 
	 * @param designations
	 */
	public void set_accessLevel (int accessLevel){
		this.accessLevel = accessLevel;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<Subject> get_Subject () {
		return subjects;
	}
	
	/**
	 * 
	 * @param subjectNote
	 */
	public void set_Subject (Set<Subject> subjects){
		this.subjects = subjects;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<Center> get_Center () {
		return centers;
	}
	
	/**
	 * 
	 * @param centers
	 */
	public void set_Center (Set<Center> centers){
		this.centers = centers;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<Clinic> get_Clinic () {
		return clinics;
	}
	
	/**
	 * 
	 * @param clinics
	 */
	public void set_Clinic (Set<Clinic> clinics){
		this.clinics = clinics;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<UserNote> get_UserNote () {
		return userNotes;
	}
	
	/**
	 * 
	 * @param userNotes
	 */
	public void set_UserNote (Set<UserNote> userNotes){
		this.userNotes = userNotes;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<UserLog> get_UserLog () {
		return userLogs;
	}
	
	/**
	 * 
	 * @param userLogs
	 */
	public void set_UserLog (Set<UserLog> userLogs){
		this.userLogs = userLogs;
	}
}
