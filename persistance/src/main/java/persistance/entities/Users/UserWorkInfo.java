/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

import javax.persistence.*;

@Entity
@Table(name="USER_WORK_INFO")
public class UserWorkInfo {
	
	@OneToOne
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int workInfo;

	@Column(name="address1")
	String address1; 
	
	@Column(name="address2")
	String address2;
	
	@Column(name="city")
	String city; 
	
	@Column(name="state")
	String state; 
	
	@Column(name="zip")
	String zip; 
	
	@Column(name="workPhone")
	String workPhone; 
	
	@Column(name="extension")
	String extension; 
	
	@Column(name="fax")
	String fax; 
	
	@Column(name="email")
	String email;  
	
	/**
	 * Default blank constructor for UserWorkInfo.
	 */
	public UserWorkInfo(){
		
	}
	
	/**
	 * Default constructor for UserWorkInfo.
	 * @param address1
	 * @param address2
	 * @param city
	 * @param email
	 * @param state
	 * @param zip
	 * @param workPhone
	 * @param extension
	 * @param fax
	 */
	public UserWorkInfo(String address1, String address2, String city, String email, String state, String zip, String workPhone, String extension, String fax){
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.email = email;
		this.state = state;
		this.zip = zip;
		this.workPhone = workPhone;
		this.extension = extension;
		this.fax = fax;
		
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
	public int get_workInfo(){
		return workInfo;
	}
	
	/**
	 * 
	 * @param workInfo
	 */
	public void set_workInfo(int workInfo){
		this.workInfo = workInfo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_address1 () {
		return address1;
	}
	
	/**
	 * 
	 * @param address1
	 */
	public void set_address1 (String address1){
		this.address1 = address1;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_address2 () {
		return address2;
	}
	
	/**
	 * 
	 * @param address2
	 */
	public void set_address2 (String address2){
		this.address2 = address2;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_city () {
		return city;
	}
	
	/**
	 * 
	 * @param city
	 */
	public void set_city (String city){
		this.city = city;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_state () {
		return state;
	}
	
	/**
	 * 
	 * @param state
	 */
	public void set_state (String state){
		this.state = state;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_zip () {
		return zip;
	}
	
	/**
	 * 
	 * @param zip
	 */
	public void set_zip (String zip){
		this.zip = zip;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_workPhone () {
		return workPhone;
	}
	
	/**
	 * 
	 * @param workPhone
	 */
	public void set_workPhone (String workPhone){
		this.workPhone = workPhone;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_extension () {
		return extension;
	}
	
	/**
	 * 
	 * @param extension
	 */
	public void set_extension (String extension){
		this.extension = extension;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_fax () {
		return fax;
	}
	
	/**
	 * 
	 * @param fax
	 */
	public void set_fax (String fax){
		this.fax = fax;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_email () {
		return email;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void set_email (String email){
		this.email = email;
	}
}
