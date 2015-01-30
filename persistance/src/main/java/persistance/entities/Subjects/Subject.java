/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Subjects;

public class Subject {
	int sid;
	String subjectId;
	String clinicId;   
	String notes;   
	
	/**
	 * 
	 * @return
	 */
	public int get_sid(){
	     return sid;
	}
	
	/**
	 * 
	 * @param uid
	 */
	public void set_sid(int sid){
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
