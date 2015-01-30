/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

public class UserPersonalInfo {
	
	int uid;
	String userId;
	String address1; 
	String address2; 
	String city; 
	String state; 
	String zip;  
	String homePhone; 
	String mobilePhone; 
	String ssn;  
	String birthdate;
	String email; 
	
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
	public String get_ssn () {
		return ssn;
	}
	
	/**
	 * 
	 * @param ssn
	 */
	public void set_ssn (String ssn){
		this.ssn = ssn;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_birthdate () {
		return birthdate;
	}
	
	/**
	 * 
	 * @param birthdate
	 */
	public void set_birthdate (String birthdate){
		this.birthdate = birthdate;
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
