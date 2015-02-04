/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Clinics;

import javax.persistence.*;

@Entity
@Table(name="CLINIC")
public class Clinic {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cid;
	
	@Column(name="clinicId")
	String clinicId;
	
	@Column(name="clinicNumber")
	String clinicNumber;  
	
	@Column(name="clinicName")
	String clinicName; 
	
	@Column(name="clinicContactTitle")
	String clinicContactTitle;
	
	@Column(name="clinicContactFirstName")
	String clinicContactFirstName;
	
	@Column(name="clinicContactLastName")
	String clinicContactLastName;
	
	@Column(name="clinicContactJobTitle")
	String clinicContactJobTitle;
	
	@Column(name="clinicAddress1")
	String clinicAddress1; 
	
	@Column(name="clinicAddress2")
	String clinicAddress2; 
	
	@Column(name="clinicCity")
	String clinicCity; 
	
	@Column(name="clinicState")
	String clinicState;  
	
	@Column(name="clinicZip")
	String clinicZip; 
	
	@Column(name="clinicPhone")
	String clinicPhone; 
	
	@Column(name="clinicFax")
	String clinicFax; 
	
	@Column(name="clinicNote")
	String clinicNote;
	
	/**
	 * Default blank constructor for Clinic
	 */
	public Clinic(){
		
	}
	
	/**
	 * Default constructor for Clinic.
	 * @param clinicAddress1
	 * @param clinicAddress2
	 * @param clinicCity
	 * @param clinicContactFirstName
	 * @param clinicContactJobTitle
	 * @param clinicContactLastName
	 * @param clinicContactTitle
	 * @param clinicFax
	 * @param clinicId
	 * @param clinicName
	 * @param clinicNote
	 * @param clinicNumber
	 * @param clinicPhone
	 * @param clinicState
	 * @param clinicZip
	 */
	public Clinic(String clinicAddress1, String clinicAddress2, String clinicCity, String clinicContactFirstName, String clinicContactJobTitle, String clinicContactLastName, String clinicContactTitle, String clinicFax,String clinicId, String clinicName, String clinicNote, String clinicNumber, String clinicPhone, String clinicState, String clinicZip){
		this.clinicAddress1 = clinicAddress1;
		this.clinicAddress2 = clinicAddress2;
		this.clinicCity = clinicCity;
		this.clinicContactFirstName = clinicContactFirstName;
		this.clinicContactJobTitle = clinicContactJobTitle;
		this.clinicContactLastName = clinicContactLastName;
		this.clinicContactTitle = clinicContactTitle;
		this.clinicFax = clinicFax;
		this.clinicId = clinicId; 
		this.clinicName = clinicName; 
		this.clinicNote = clinicNote; 
		this.clinicNumber = clinicNumber; 
		this.clinicPhone = clinicPhone; 
		this.clinicState = clinicState; 
		this.clinicZip = clinicZip;
	}
	
	//Getter and Setters
	
	public int get_cid (){
		return cid;
	}
	
	public void set_cid( int cid){
		this.cid = cid;
	}
	
	public String get_clinicId(){
		return clinicId;
	}
	
	public void set_clinicId(String clinicId){
		this.clinicId = clinicId;
	}
	
	public String get_clinicNumber(){
		return clinicNumber;
	}
	
	public void set_clinicNumber(String clinicNumber){
		this.clinicNumber = clinicNumber;
	}
	
	public String get_clinicName(){
		return clinicName;
	}
	
	public void set_clinicName(String clinicName){
		this.clinicName = clinicName;
	}

	public String get_clinicContactTitle(){
		return clinicContactTitle;
	}
	
	public void set_clinicContactTitle(String clinicContactTitle){
		this.clinicContactTitle = clinicContactTitle;
	}
	
	public String get_clinicContactFirstName(){
		return clinicContactFirstName;
	}
	
	public void set_clinicContactFirstName(String clinicContactFirstName){
		this.clinicContactFirstName = clinicContactFirstName;
	}
	
	public String get_clinicContactLastName(){
		return clinicContactLastName;
	}
	
	public void set_clinicContactLastName(String clinicContactLastName){
		this.clinicContactLastName = clinicContactLastName;
	}
	
	public String get_clinicContactJobTitle(){
		return clinicContactJobTitle;
	}
	
	public void set_clinicContactJobTitle(String clinicContactJobTitle){
		this.clinicContactJobTitle = clinicContactJobTitle;
	}
	
	public String get_clinicAddress1(){
		return clinicAddress1;
	}
	
	public void set_clinicAddress1(String clinicAddress1){
		this.clinicAddress1 = clinicAddress1;
	}
	
	public String get_clinicAddress2(){
		return clinicAddress2;
	}
	
	public void set_clinicAddress2(String clinicAddress2){
		this.clinicAddress2 = clinicAddress2;
	}
	
	public String get_clinicCity(){
		return clinicCity;
	}
	
	public void set_clinicCity(String clinicCity){
		this.clinicCity = clinicCity;
	}
	
	public String get_clinicState(){
		return clinicState;
	}
	
	public void set_clinicState(String clinicState){
		this.clinicState = clinicState;
	}
	
	public String get_clinicZip(){
		return clinicZip;
	}
	
	public void set_clinicZip(String clinicZip){
		this.clinicZip = clinicZip;
	}
	
	public String get_clinicPhone(){
		return clinicPhone;
	}
	
	public void set_clinicPhone(String clinicPhone){
		this.clinicPhone = clinicPhone;
	}
	
	public String get_clinicFax(){
		return clinicFax;
	}
	
	public void set_clinicFax(String clinicFax){
		this.clinicFax = clinicFax;
	}
	
	public String get_clinicNote(){
		return clinicNote;
	}
	
	public void set_clinicNote(String clinicNote){
		this.clinicNote = clinicNote;
	}
}
