/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Centers;

import javax.persistence.*;

@Entity
@Table(name="CENTER")
public class Center {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cid;
	
	@Column(name="centerId")
	String centerId;
	
	@Column(name="centerNumber")
	String centerNumber;  
	
	@Column(name="centerName")
	String centerName; 
	
	@Column(name="centerContactTitle")
	String centerContactTitle;
	
	@Column(name="centerContactFirstName")
	String centerContactFirstName;
	
	@Column(name="centerContactLastName")
	String centerContactLastName;
	
	@Column(name="centerContactJobTitle")
	String centerContactJobTitle;
	
	@Column(name="centerAddress1")
	String centerAddress1; 
	
	@Column(name="centerAddress2")
	String centerAddress2; 
	
	@Column(name="centerCity")
	String centerCity; 
	
	@Column(name="centerState")
	String centerState;  
	
	@Column(name="centerZip")
	String centerZip; 
	
	@Column(name="centerPhone")
	String centerPhone; 
	
	@Column(name="centerFax")
	String centerFax; 
	
	@Column(name="centerNote")
	String centerNote;
	
	/**
	 * Default blank constructor for center
	 */
	public Center(){
		
	}
	
	/**
	 * Default constructor for center.
	 * @param centerAddress1
	 * @param centerAddress2
	 * @param centerCity
	 * @param centerContactFirstName
	 * @param centerContactJobTitle
	 * @param centerContactLastName
	 * @param centerContactTitle
	 * @param centerFax
	 * @param centerId
	 * @param centerName
	 * @param centerNote
	 * @param centerNumber
	 * @param centerPhone
	 * @param centerState
	 * @param centerZip
	 */
	public Center(String centerAddress1, String centerAddress2, String centerCity, String centerContactFirstName, String centerContactJobTitle, String centerContactLastName, String centerContactTitle, String centerFax,String centerId, String centerName, String centerNote, String centerNumber, String centerPhone, String centerState, String centerZip){
		this.centerAddress1 = centerAddress1;
		this.centerAddress2 = centerAddress2;
		this.centerCity = centerCity;
		this.centerContactFirstName = centerContactFirstName;
		this.centerContactJobTitle = centerContactJobTitle;
		this.centerContactLastName = centerContactLastName;
		this.centerContactTitle = centerContactTitle;
		this.centerFax = centerFax;
		this.centerId = centerId; 
		this.centerName = centerName; 
		this.centerNote = centerNote; 
		this.centerNumber = centerNumber; 
		this.centerPhone = centerPhone; 
		this.centerState = centerState; 
		this.centerZip = centerZip;
	}
	
	//Getter and Setters	
	public int get_cid (){
		return cid;
	}
	
	public void set_cid( int cid){
		this.cid = cid;
	}
	
	public String get_centerId(){
		return centerId;
	}
	
	public void set_centerId(String centerId){
		this.centerId = centerId;
	}
	
	public String get_centerNumber(){
		return centerNumber;
	}
	
	public void set_centerNumber(String centerNumber){
		this.centerNumber = centerNumber;
	}
	
	public String get_centerName(){
		return centerName;
	}
	
	public void set_centerName(String centerName){
		this.centerName = centerName;
	}

	public String get_centerContactTitle(){
		return centerContactTitle;
	}
	
	public void set_centerContactTitle(String centerContactTitle){
		this.centerContactTitle = centerContactTitle;
	}
	
	public String get_centerContactFirstName(){
		return centerContactFirstName;
	}
	
	public void set_centerContactFirstName(String centerContactFirstName){
		this.centerContactFirstName = centerContactFirstName;
	}
	
	public String get_centerContactLastName(){
		return centerContactLastName;
	}
	
	public void set_centerContactLastName(String centerContactLastName){
		this.centerContactLastName = centerContactLastName;
	}
	
	public String get_centerContactJobTitle(){
		return centerContactJobTitle;
	}
	
	public void set_centerContactJobTitle(String centerContactJobTitle){
		this.centerContactJobTitle = centerContactJobTitle;
	}
	
	public String get_centerAddress1(){
		return centerAddress1;
	}
	
	public void set_centerAddress1(String centerAddress1){
		this.centerAddress1 = centerAddress1;
	}
	
	public String get_centerAddress2(){
		return centerAddress2;
	}
	
	public void set_centerAddress2(String centerAddress2){
		this.centerAddress2 = centerAddress2;
	}
	
	public String get_centerCity(){
		return centerCity;
	}
	
	public void set_centerCity(String centerCity){
		this.centerCity = centerCity;
	}
	
	public String get_centerState(){
		return centerState;
	}
	
	public void set_centerState(String centerState){
		this.centerState = centerState;
	}
	
	public String get_centerZip(){
		return centerZip;
	}
	
	public void set_centerZip(String centerZip){
		this.centerZip = centerZip;
	}
	
	public String get_centerPhone(){
		return centerPhone;
	}
	
	public void set_centerPhone(String centerPhone){
		this.centerPhone = centerPhone;
	}
	
	public String get_centerFax(){
		return centerFax;
	}
	
	public void set_centerFax(String centerFax){
		this.centerFax = centerFax;
	}
	
	public String get_centerNote(){
		return centerNote;
	}
	
	public void set_centerNote(String centerNote){
		this.centerNote = centerNote;
	}
}
