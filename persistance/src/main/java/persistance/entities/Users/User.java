/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Users;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="USER")
public class User {
	int uid;
	String userId;
	String clinicId;
	String title;
	String firstName;
	String middleName;
	String lastName;
	String initials;
	String department; 
	String profTitle;
	String designations;
	String accessLevel;
	String notes;   
	
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
	public String get_clinicId(){
		return clinicId;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_clinicId(String clinicId){
		this.clinicId = clinicId;
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
	public String get_initials(){
		return initials;
	}
	
	/**
	 * 
	 * @param lastName
	 */
	public void set_initials(String initials){
		this.initials = initials;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_department(){
		return department;
	}
	
	/**
	 * 
	 * @param department
	 */
	public void set_department(String department){
		this.department = department;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_profTitle (){
		return profTitle;
	}
	
	/**
	 * 
	 * @param profTitle
	 */
	public void set_profTitle (String profTitle){
		this.profTitle = profTitle;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_designations (){
		return designations;
	}
	
	/**
	 * 
	 * @param designations
	 */
	public void set_designations (String designations){
		this.designations = designations;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_accessLevel (){
		return accessLevel;
	}
	
	/**
	 * 
	 * @param designations
	 */
	public void set_accessLevel (String accessLevel){
		this.accessLevel = accessLevel;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_notes () {
		return notes;
	}
	
	/**
	 * 
	 * @param notes
	 */
	public void set_notes (String notes){
		this.notes = notes;
	}
}
