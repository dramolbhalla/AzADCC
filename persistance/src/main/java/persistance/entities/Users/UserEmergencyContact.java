/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

import javax.persistence.*;

@Entity
@Table(name="USER_EMERGENCY_CONTACT")
public class UserEmergencyContact {
	
	@OneToOne
	private User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emergencyContact;
	
	@Column(name="title")
	String title;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="middleName")
	String middleName;
	
	@Column(name="lastName")
	String lastName;
	
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
	
	@Column(name="homePhone")
	String homePhone; 
	
	@Column(name="mobilePhone")
	String mobilePhone;
	
	@Column(name="email")
	String email;
	
	/**
	 * Default blank constructor of UserEmergencyContact
	 */
	public UserEmergencyContact(){
		
	}
	
	/**
	 * Default constructor for UserEmergencyContact
	 * @param address1
	 * @param address2
	 * @param city
	 * @param email
	 * @param firstName
	 * @param homePhone
	 * @param lastName
	 * @param middleName
	 * @param mobilePhone
	 * @param state
	 * @param title
	 * @param zip
	 */
	public UserEmergencyContact(String address1, String address2, String city, String email, String firstName, String homePhone, String lastName, String middleName, String mobilePhone, String state, String title, String zip){
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.email = email;
		this.firstName = firstName;
		this.homePhone = homePhone;
		this.lastName = lastName;
		this.middleName = middleName;
		this.mobilePhone = mobilePhone;
		this.state = state;
		this.title = title;
		this.zip = zip;
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
	public int get_emergencyContact(){
		return emergencyContact;
	}
	
	/**
	 * 
	 * @param emergencyContact
	 */
	public void set_emergencyContact(int emergencyContact){
		this.emergencyContact = emergencyContact;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_title(){
		return title;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void set_title(String title){
		this.title = title;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_firstName(){
		return firstName;
	}
	
	/**
	 * 
	 * @param firstName
	 */
	public void set_firstName(String firstName){
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_middleName(){
		return middleName;
	}
	
	/**
	 * 
	 * @param middleName
	 */
	public void set_middleName(String middleName){
		this.middleName = middleName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_lastName(){
		return lastName;
	}
	
	/**
	 * 
	 * @param lastName
	 */
	public void set_lastName(String lastName){
		this.lastName = lastName;
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
	public String get_homePhone () {
		return homePhone;
	}
	
	/**
	 * 
	 * @param homePhone
	 */
	public void set_homePhone (String homePhone){
		this.homePhone = homePhone;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_mobilePhone () {
		return mobilePhone;
	}
	
	/**
	 * 
	 * @param mobilePhone
	 */
	public void set_mobilePhone (String mobilePhone){
		this.mobilePhone = mobilePhone;
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
