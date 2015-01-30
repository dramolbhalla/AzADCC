/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Subjects;

public class SubjectWorkInfo {
	
	int sid;
	String subjectId;
	String address1; 
	String address2; 
	String city; 
	String state; 
	String zip; 
	String workPhone; 
	String extension; 
	String fax; 
	String email;  
	
	/**
	 * 
	 * @return
	 */
	public int get_uid(){
	     return sid;
	}
	
	/**
	 * 
	 * @param uid
	 */
	public void set_uid(int sid){
		this.sid = sid;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectId(){
		return subjectId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_subjectId(String subjectId){
		this.subjectId = subjectId;
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
