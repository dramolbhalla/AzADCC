/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Subjects;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_PERSONAL_INFO")
public class SubjectPersonalInfo {
	
	@OneToOne
	private Subject subjectId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personalInfo;
	
	@Column(name="title")
	private String title;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="profTitle")
	private String profTitle;
	
	@Column(name="address1")
	private String address1; 
	
	@Column(name="address2")
	private String address2; 
	
	@Column(name="city")
	private String city; 
	
	@Column(name="state")
	private String state; 
	
	@Column(name="zip")
	private String zip;  
	
	@Column(name="homePhone")
	private String homePhone; 
	
	@Column(name="mobilePhone")
	private String mobilePhone; 
	
	@Column(name="ssn")
	private String ssn;  
	
	@Column(name="birthdate")
	private String birthdate;
	
	@Column(name="email")
	private String email; 
	
	@OneToMany
	private Set<SubjectEmergencyContact> subjectEmergencyContact;
	
	@OneToOne
	private SubjectExpired subjectExpired;
	
	@OneToMany
	private Set<SubjectWorkInfo> subjectWorkInfo;
	
	/**
	 * Empty class constructor for subject table.
	 */
	public SubjectPersonalInfo(){
		
	}
	
	/**
	 * Default constructor for SubjectPersonalInfo table.
	 * @param address1
	 * @param address2
	 * @param birthdate
	 * @param city
	 * @param email
	 * @param firstName
	 * @param homePhone
	 * @param lastName
	 * @param middleName
	 * @param mobilePhone
	 * @param profTitle
	 * @param ssn
	 * @param state
	 * @param title
	 * @param zip
	 */
	public SubjectPersonalInfo(String address1, String address2, String birthdate, String city, String email, String firstName, String homePhone, String lastName, String middleName, String mobilePhone, String profTitle, String ssn, String state, String title, String zip){
		this.address1 = address1;
		this.address2 = address2;
		this.birthdate = birthdate;
		this.city = city;
		this.email = email;
		this.firstName = firstName;
		this.homePhone = homePhone;
		this.lastName = lastName;
		this.middleName = middleName;
		this.mobilePhone = mobilePhone;
		this.profTitle = profTitle;
		this.ssn = ssn;
		this.state = state;
		this.title = title;
		this.zip = zip;
	}
	
	/**
	 * 
	 * @return
	 */
	public Subject get_subjectId(){
		return subjectId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_subjectId(Subject subjectId){
		this.subjectId = subjectId;
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
	
	/**
	 * 
	 * @return
	 */
	public Set<SubjectEmergencyContact> get_SubjectEmergencyContact(){
		return subjectEmergencyContact;
	}
	
	/**
	 * 
	 * @param subjectEmergencyContact
	 */
	public void set_SubjectEmergencyContact(Set<SubjectEmergencyContact> subjectEmergencyContact){
		this.subjectEmergencyContact = subjectEmergencyContact;
	}
	
	/**
	 * 
	 * @return
	 */
	public SubjectExpired get_SubjectExpired(){
		return subjectExpired;
	}
	
	/**
	 * 
	 * @param subjectExpired
	 */
	public void set_SubjectExpired(SubjectExpired subjectExpired){
		this.subjectExpired = subjectExpired;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<SubjectWorkInfo> get_SubjectWorkInfo(){
		return subjectWorkInfo;
	}
	
	/**
	 * 
	 * @param subjectEmergencyContact
	 */
	public void set_SubjectWorkInfo(Set<SubjectWorkInfo> subjectWorkInfo){
		this.subjectWorkInfo = subjectWorkInfo;
	}
		

}
